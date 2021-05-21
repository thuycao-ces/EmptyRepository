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
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterService.addNewsLetter(
			groupId, issueNumber, title, description, dueDate, serviceContext);
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
	public NewsLetterService getWrappedService() {
		return _newsLetterService;
	}

	@Override
	public void setWrappedService(NewsLetterService newsLetterService) {
		_newsLetterService = newsLetterService;
	}

	private NewsLetterService _newsLetterService;

}