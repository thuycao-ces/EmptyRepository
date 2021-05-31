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
 * Provides a wrapper for {@link NewslettersArticlesService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesService
 * @generated
 */
public class NewslettersArticlesServiceWrapper
	implements NewslettersArticlesService,
			   ServiceWrapper<NewslettersArticlesService> {

	public NewslettersArticlesServiceWrapper(
		NewslettersArticlesService newslettersArticlesService) {

		_newslettersArticlesService = newslettersArticlesService;
	}

	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			addNewslettersArticles(
				int issueNumber, String title, String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesService.addNewslettersArticles(
			issueNumber, title, content, userId);
	}

	@Override
	public java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticlesByIssueNumber(int issueNumber) {

		return _newslettersArticlesService.getNewslettersArticlesByIssueNumber(
			issueNumber);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newslettersArticlesService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			updateNewslettersArticles(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesService.updateNewslettersArticles(
			newsletterArticlesId, issueNumber, title, content);
	}

	@Override
	public NewslettersArticlesService getWrappedService() {
		return _newslettersArticlesService;
	}

	@Override
	public void setWrappedService(
		NewslettersArticlesService newslettersArticlesService) {

		_newslettersArticlesService = newslettersArticlesService;
	}

	private NewslettersArticlesService _newslettersArticlesService;

}