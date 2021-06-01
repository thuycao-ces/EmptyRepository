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
 * Provides a wrapper for {@link NewsletterService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsletterService
 * @generated
 */
public class NewsletterServiceWrapper
	implements NewsletterService, ServiceWrapper<NewsletterService> {

	public NewsletterServiceWrapper(NewsletterService newsletterService) {
		_newsletterService = newsletterService;
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletter addNewsletter(
			long resourcePrimKey, int issueNumber, String title,
			String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsletterService.addNewsletter(
			resourcePrimKey, issueNumber, title, description, issueDate);
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletter
		getNewsletterByIssueNumber(int issueNumber) {

		return _newsletterService.getNewsletterByIssueNumber(issueNumber);
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletter
		getNewsletterByResourcePrimKey(long resourcePrimKey) {

		return _newsletterService.getNewsletterByResourcePrimKey(
			resourcePrimKey);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsletterService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletter updateNewsletter(
			long newsletterId, int issueNumber, String title,
			String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsletterService.updateNewsletter(
			newsletterId, issueNumber, title, description, issueDate);
	}

	@Override
	public void updateNewsletterStatus(long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		_newsletterService.updateNewsletterStatus(resourcePrimKey);
	}

	@Override
	public NewsletterService getWrappedService() {
		return _newsletterService;
	}

	@Override
	public void setWrappedService(NewsletterService newsletterService) {
		_newsletterService = newsletterService;
	}

	private NewsletterService _newsletterService;

}