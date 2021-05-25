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
 * Provides a wrapper for {@link NewsLetterService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetterService
 * @generated
 */
public class NewsLetterServiceWrapper
	implements NewsLetterService, ServiceWrapper<NewsLetterService> {

	public NewsLetterServiceWrapper(NewsLetterService newsLetterService) {
		_newsLetterService = newsLetterService;
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter addNewsLetter(
			long groupId, int issueNumber, String title, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.addNewsLetter(
			groupId, issueNumber, title, description, serviceContext);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter deleteNewsLetter(
			long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.deleteNewsLetter(newsletterId);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter getNewsLetter(
			long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.getNewsLetter(newsletterId);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter
			getNewsLetterByIssueNumber(int issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.getNewsLetterByIssueNumber(issueNumber);
	}

	@Override
	public java.util.List<com.liferay.training.news.letter.model.NewsLetter>
		getNewsLetters() {

		return _newsLetterService.getNewsLetters();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsLetterService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter updateNewsLetter(
			long newsletterId, int issueNumber, String title,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.updateNewsLetter(
			newsletterId, issueNumber, title, description, serviceContext);
	}

	@Override
	public NewsLetterService getWrappedService() {
		return _newsLetterService;
	}

	@Override
	public void setWrappedService(NewsLetterService newsLetterService) {
		_newsLetterService = newsLetterService;
	}

	private NewsLetterService _newsLetterService;

}