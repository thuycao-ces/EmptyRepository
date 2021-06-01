/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.newsletter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsletterArticleService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsletterArticleService
 * @generated
 */
public class NewsletterArticleServiceWrapper
	implements NewsletterArticleService,
			   ServiceWrapper<NewsletterArticleService> {

	public NewsletterArticleServiceWrapper(
		NewsletterArticleService newsletterArticleService) {

		_newsletterArticleService = newsletterArticleService;
	}

	@Override
	public com.liferay.training.newsletter.model.NewsletterArticle
			addNewsletterArticle(
				long journalArticleId, int issueNumber, String title,
				String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsletterArticleService.addNewsletterArticle(
			journalArticleId, issueNumber, title, content, userId);
	}

	@Override
	public java.util.List
		<com.liferay.training.newsletter.model.NewsletterArticle>
			getNewsletterArticleByIssueNumber(int issueNumber) {

		return _newsletterArticleService.getNewsletterArticleByIssueNumber(
			issueNumber);
	}

	@Override
	public com.liferay.training.newsletter.model.NewsletterArticle
		getNewsletterByResourcePrimKey(long resourcePrimkey) {

		return _newsletterArticleService.getNewsletterByResourcePrimKey(
			resourcePrimkey);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsletterArticleService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.newsletter.model.NewsletterArticle
			updateNewsletterArticle(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsletterArticleService.updateNewsletterArticle(
			newsletterArticlesId, issueNumber, title, content);
	}

	@Override
	public void updateNewsletterArticleStatus(long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		_newsletterArticleService.updateNewsletterArticleStatus(
			resourcePrimKey);
	}

	@Override
	public NewsletterArticleService getWrappedService() {
		return _newsletterArticleService;
	}

	@Override
	public void setWrappedService(
		NewsletterArticleService newsletterArticleService) {

		_newsletterArticleService = newsletterArticleService;
	}

	private NewsletterArticleService _newsletterArticleService;

}