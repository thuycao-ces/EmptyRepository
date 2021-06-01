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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Newsletter. This utility wraps
 * <code>com.liferay.training.newsletter.service.impl.NewsletterServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see NewsletterService
 * @generated
 */
public class NewsletterServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.newsletter.service.impl.NewsletterServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.newsletter.model.Newsletter
			addNewsletter(
				long resourcePrimKey, int issueNumber, String title,
				String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewsletter(
			resourcePrimKey, issueNumber, title, description, issueDate);
	}

	public static com.liferay.training.newsletter.model.Newsletter
		getNewsletterByIssueNumber(int issueNumber) {

		return getService().getNewsletterByIssueNumber(issueNumber);
	}

	public static com.liferay.training.newsletter.model.Newsletter
		getNewsletterByResourcePrimKey(long resourcePrimKey) {

		return getService().getNewsletterByResourcePrimKey(resourcePrimKey);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.newsletter.model.Newsletter
			updateNewsletter(
				long newsletterId, int issueNumber, String title,
				String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewsletter(
			newsletterId, issueNumber, title, description, issueDate);
	}

	public static void updateNewsletterStatus(long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().updateNewsletterStatus(resourcePrimKey);
	}

	public static NewsletterService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NewsletterService, NewsletterService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NewsletterService.class);

		ServiceTracker<NewsletterService, NewsletterService> serviceTracker =
			new ServiceTracker<NewsletterService, NewsletterService>(
				bundle.getBundleContext(), NewsletterService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}