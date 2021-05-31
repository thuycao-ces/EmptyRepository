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
 * Provides a wrapper for {@link NewslettersService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersService
 * @generated
 */
public class NewslettersServiceWrapper
	implements NewslettersService, ServiceWrapper<NewslettersService> {

	public NewslettersServiceWrapper(NewslettersService newslettersService) {
		_newslettersService = newslettersService;
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters addNewsletters(
			int issueNumber, String title, String description,
			java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersService.addNewsletters(
			issueNumber, title, description, issueDate);
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters
		getNewslettersByIssueNumber(int issueNumber) {

		return _newslettersService.getNewslettersByIssueNumber(issueNumber);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newslettersService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters updateNewsletters(
			long newsletterId, int issueNumber, String title,
			String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersService.updateNewsletters(
			newsletterId, issueNumber, title, description, issueDate);
	}

	@Override
	public NewslettersService getWrappedService() {
		return _newslettersService;
	}

	@Override
	public void setWrappedService(NewslettersService newslettersService) {
		_newslettersService = newslettersService;
	}

	private NewslettersService _newslettersService;

}