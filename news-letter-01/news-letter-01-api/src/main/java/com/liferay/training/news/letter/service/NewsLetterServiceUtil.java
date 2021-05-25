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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for NewsLetter. This utility wraps
 * <code>com.liferay.training.news.letter.service.impl.NewsLetterServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetterService
 * @generated
 */
public class NewsLetterServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.news.letter.service.impl.NewsLetterServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.news.letter.model.NewsLetter
			addNewsLetter(
				long groupId, int issueNumber, String title, String description,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewsLetter(
			groupId, issueNumber, title, description, serviceContext);
	}

	public static com.liferay.training.news.letter.model.NewsLetter
			deleteNewsLetter(long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNewsLetter(newsletterId);
	}

	public static com.liferay.training.news.letter.model.NewsLetter
			getNewsLetter(long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNewsLetter(newsletterId);
	}

	public static com.liferay.training.news.letter.model.NewsLetter
			getNewsLetterByIssueNumber(int issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNewsLetterByIssueNumber(issueNumber);
	}

	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter> getNewsLetters() {

		return getService().getNewsLetters();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.news.letter.model.NewsLetter
			updateNewsLetter(
				long newsletterId, int issueNumber, String title,
				String description,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewsLetter(
			newsletterId, issueNumber, title, description, serviceContext);
	}

	public static NewsLetterService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NewsLetterService, NewsLetterService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NewsLetterService.class);

		ServiceTracker<NewsLetterService, NewsLetterService> serviceTracker =
			new ServiceTracker<NewsLetterService, NewsLetterService>(
				bundle.getBundleContext(), NewsLetterService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}