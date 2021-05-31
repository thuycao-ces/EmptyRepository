package com.liferay.training.newsletter.listing.util;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.training.newsletter.model.Newsletters;
import com.liferay.training.newsletter.model.NewslettersArticles;
import com.liferay.training.newsletter.service.NewslettersArticlesLocalService;
import com.liferay.training.newsletter.service.NewslettersLocalService;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = NewsLetterListingUtil.class, immediate = true)
public class NewsLetterListingUtil {

	public List<Newsletters> getNewsletters() {

		Order order = OrderFactoryUtil.desc("issueDate");

		DynamicQuery newsletterQuery = newslettersLocalService.dynamicQuery().addOrder(order);

		return newslettersLocalService.dynamicQuery(newsletterQuery);

	}

	public List<NewslettersArticles> getNewslettersArticles() {

		DynamicQuery newsletterQuery = newslettersArticlesLocalService.dynamicQuery();

		return newslettersLocalService.dynamicQuery(newsletterQuery);

	}

	public Set<String> getYearsFromNewsLetter(List<Newsletters> newsletters) {

		Set<String> dateList = new LinkedHashSet<String>();

		for (Newsletters newsletter : newsletters) {

			String pattern = "yyyy";
			String year = formatDateTimes(pattern).format(newsletter.getIssueDate());

			dateList.add(year);
		}

		return dateList;
	}

	public HashMap<Long, String> getDateTimesFromNewsLetter(List<Newsletters> newsletters) {

		HashMap<Long, String> months = new HashMap<Long, String>();

		for (Newsletters newsletter : newsletters) {

			String patternMonth = "MMMM";
			String patternYear = "yyyy";

			String month = formatDateTimes(patternMonth).format(newsletter.getIssueDate());
			String year = formatDateTimes(patternYear).format(newsletter.getIssueDate());

			String value = month + "_" + year;

			if (!months.containsValue(value)) {
				months.put(newsletter.getNewslettersId(), value);
			}

		}

		return months;
	}

	public Set<String> getMonthsFromNewsLetter(List<Newsletters> newsletters) {

		Set<String> months = new LinkedHashSet<String>();

		for (Newsletters newsletter : newsletters) {

			String patternMonth = "MMMM";

			String month = formatDateTimes(patternMonth).format(newsletter.getIssueDate());

			months.add(month);

		}

		return months;
	}

	public SimpleDateFormat formatDateTimes(String pattern) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		return simpleDateFormat;
	}

	public String[] splitString(String string) {

		String[] array = string.split("_");

		return array;

	}

	@Reference
	NewslettersLocalService newslettersLocalService;

	@Reference
	NewslettersArticlesLocalService newslettersArticlesLocalService;

}
