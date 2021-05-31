package com.liferay.training.newsletter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.newsletter.model.NewslettersArticles;
import com.liferay.training.newsletter.service.base.NewslettersArticlesServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	property = {
		"json.web.service.context.name=newsletter",
		"json.web.service.context.path=NewslettersArticles"
	},
	service = AopService.class
)
public class NewslettersArticlesServiceImpl
	extends NewslettersArticlesServiceBaseImpl {

	public NewslettersArticles addNewslettersArticles(int issueNumber, String title, String content, long userId) throws PortalException {
	
		return newslettersArticlesLocalService.addNewslettersArticles(issueNumber, title, content, userId);
	}
	
	public List<NewslettersArticles> getNewslettersArticlesByIssueNumber(int issueNumber) {
		List<NewslettersArticles> newslettersArticles = newslettersArticlesLocalService.getNewslettersArticles();
	
		List<NewslettersArticles> newList = new ArrayList<NewslettersArticles>();
		
		for(NewslettersArticles item: newslettersArticles) {
			if(item.getIssueNumber() == issueNumber) {
				newList.add(item);
			}
		}
		return newList;
	}
	
	public NewslettersArticles updateNewslettersArticles(long newsletterArticlesId, int issueNumber, String title, String content) throws PortalException {

		return newslettersArticlesLocalService.updateNewslettersArticles(newsletterArticlesId, issueNumber, title, content);
	}
}