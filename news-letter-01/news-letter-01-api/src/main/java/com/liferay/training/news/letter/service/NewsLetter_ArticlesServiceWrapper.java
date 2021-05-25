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

package com.liferay.training.news.letter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsLetter_ArticlesService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesService
 * @generated
 */
public class NewsLetter_ArticlesServiceWrapper
	implements NewsLetter_ArticlesService,
			   ServiceWrapper<NewsLetter_ArticlesService> {

	public NewsLetter_ArticlesServiceWrapper(
		NewsLetter_ArticlesService newsLetter_ArticlesService) {

		_newsLetter_ArticlesService = newsLetter_ArticlesService;
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
			addNewsLetter_Articles(
				long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesService.addNewsLetter_Articles(
			newsletterId, articlesId, serviceContext);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
			deleteNewsLetter_Articles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesService.deleteNewsLetter_Articles(id);
	}

	@Override
	public java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articles() {

		return _newsLetter_ArticlesService.getNewsLetter_Articles();
	}

	@Override
	public java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_ArticlesByNewsletterId(long newsletterId) {

		return _newsLetter_ArticlesService.getNewsLetter_ArticlesByNewsletterId(
			newsletterId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsLetter_ArticlesService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
			updateNewsLetter_Articles(
				long newsletter_articles_Id, long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesService.updateNewsLetter_Articles(
			newsletter_articles_Id, newsletterId, articlesId, serviceContext);
	}

	@Override
	public NewsLetter_ArticlesService getWrappedService() {
		return _newsLetter_ArticlesService;
	}

	@Override
	public void setWrappedService(
		NewsLetter_ArticlesService newsLetter_ArticlesService) {

		_newsLetter_ArticlesService = newsLetter_ArticlesService;
	}

	private NewsLetter_ArticlesService _newsLetter_ArticlesService;

}