package com.liferay.training.newsletter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.newsletter.model.Newsletters;
import com.liferay.training.newsletter.service.base.NewslettersLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "model.class.name=com.liferay.training.newsletter.model.Newsletters",
	service = AopService.class
)
public class NewslettersLocalServiceImpl
	extends NewslettersLocalServiceBaseImpl {

	public Newsletters addNewsletters(int issueNumber, String title, String description, Date issueDate)
			throws PortalException {

		long newsletterId = counterLocalService.increment(Newsletters.class.getName());

		Newsletters newsletter = createNewsletters(newsletterId);

		newsletter.setDescription(description);
		newsletter.setTitle(title);
		newsletter.setIssueDate(issueDate);
		newsletter.setIssueNumber(issueNumber);

		return super.addNewsletters(newsletter);
	}
	
	public List<Newsletters> getNewsletters() {
		return newslettersPersistence.findAll();
	}
	
	public Newsletters updateNewsletters(long newsletterId, int issueNumber, String title, String description, Date issueDate) throws PortalException {

		Newsletters newsletter = getNewsletters(newsletterId);

		newsletter.setDescription(description);
		newsletter.setTitle(title);
		newsletter.setIssueNumber(issueNumber);
		newsletter.setIssueDate(issueDate);

		return super.updateNewsletters(newsletter);
	}
	
	@Override
	public Newsletters addNewsletters(Newsletters newsletters) {
		throw new UnsupportedOperationException("Not supported.");
	}
	
	@Override
	public Newsletters updateNewsletters(Newsletters newsletters) {
		throw new UnsupportedOperationException("Not supported.");
	}
}