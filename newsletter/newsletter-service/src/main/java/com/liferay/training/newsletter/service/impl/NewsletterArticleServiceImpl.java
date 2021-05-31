package com.liferay.training.newsletter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.newsletter.model.NewsletterArticle;
import com.liferay.training.newsletter.service.base.NewsletterArticleServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	property = { 
		"json.web.service.context.name=newsletter",
		"json.web.service.context.path=NewsletterArticle" }, 
	service = AopService.class)
public class NewsletterArticleServiceImpl extends NewsletterArticleServiceBaseImpl {

	public NewsletterArticle addNewsletterArticle(long journalArticleId, int issueNumber, String title, String content, long userId)
			throws PortalException {

		return newsletterArticleLocalService.addNewsletterArticle(journalArticleId, issueNumber, title, content, userId);
	}
	
	public NewsletterArticle deleteNewsletterArticleByJournalArticleId(long journalArticleId) throws PortalException {
		NewsletterArticle newsletterArticle = getNewsletterByJournalActicleId(journalArticleId);
		return newsletterArticleLocalService.deleteNewsletterArticle(newsletterArticle.getNewsletterArticleId());
	}

	public List<NewsletterArticle> getNewsletterArticleByIssueNumber(int issueNumber) {
		List<NewsletterArticle> newsletterArticles = newsletterArticleLocalService.getNewsletterArticles();

		List<NewsletterArticle> newList = new ArrayList<NewsletterArticle>();

		for (NewsletterArticle item : newsletterArticles) {
			if (item.getIssueNumber() == issueNumber) {
				newList.add(item);
			}
		}
		return newList;
	}
	
	public NewsletterArticle getNewsletterByJournalActicleId(long journalArticleId) {

		List<NewsletterArticle> newsletterArticles = newsletterArticleLocalService.getNewsletterArticles();
		for (NewsletterArticle newsletterArticle : newsletterArticles) {
			if (newsletterArticle.getJournalArticleId() == journalArticleId) {
				return newsletterArticle;
			}
		}

		return null;
	}

	public NewsletterArticle updateNewsletterArticle(long newsletterArticlesId, int issueNumber, String title,
			String content) throws PortalException {

		return newsletterArticleLocalService.updateNewsletterArticle(newsletterArticlesId, issueNumber, title, content);
	}
}