package com.liferay.training.newsletter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.training.newsletter.model.NewslettersArticles;
import com.liferay.training.newsletter.service.base.NewslettersArticlesLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "model.class.name=com.liferay.training.newsletter.model.NewslettersArticles",
	service = AopService.class
)
public class NewslettersArticlesLocalServiceImpl
	extends NewslettersArticlesLocalServiceBaseImpl {

	public NewslettersArticles addNewslettersArticles(int issueNumber, String title, String content, long userId) throws PortalException {

		User user = userLocalService.getUser(userId);

		long newsletterArticlesId = counterLocalService.increment(NewslettersArticles.class.getName());

		NewslettersArticles newslettersArticles = createNewslettersArticles(newsletterArticlesId);

		newslettersArticles.setUserId(userId);
		newslettersArticles.setAuthor(user.getFullName());
		newslettersArticles.setIssueNumber(issueNumber);
		newslettersArticles.setTitle(title);
		newslettersArticles.setContent(content);
		
		return super.addNewslettersArticles(newslettersArticles);
	}
	
	public List<NewslettersArticles> getNewslettersArticles() {
		return newslettersArticlesPersistence.findAll();
	}
	
	public NewslettersArticles updateNewslettersArticles(long newsletterArticlesId, int issueNumber, String title, String content) throws PortalException {

		NewslettersArticles newslettersArticles = getNewslettersArticles(newsletterArticlesId);

		newslettersArticles.setContent(content);
		newslettersArticles.setTitle(title);
		newslettersArticles.setIssueNumber(issueNumber);

		return super.updateNewslettersArticles(newslettersArticles);
	}
	
	@Override
	public NewslettersArticles addNewslettersArticles(NewslettersArticles newslettersArticles) {

		throw new UnsupportedOperationException("Not supported.");
	}
	
	@Override
	public NewslettersArticles updateNewslettersArticles(NewslettersArticles newslettersArticles) {

		throw new UnsupportedOperationException("Not supported.");
	}
}