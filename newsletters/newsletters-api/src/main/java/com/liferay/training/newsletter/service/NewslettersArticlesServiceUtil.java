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
 * Provides the remote service utility for NewslettersArticles. This utility wraps
 * <code>com.liferay.training.newsletter.service.impl.NewslettersArticlesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesService
 * @generated
 */
public class NewslettersArticlesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.newsletter.service.impl.NewslettersArticlesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
			addNewslettersArticles(
				int issueNumber, String title, String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewslettersArticles(
			issueNumber, title, content, userId);
	}

	public static java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticlesByIssueNumber(int issueNumber) {

		return getService().getNewslettersArticlesByIssueNumber(issueNumber);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.newsletter.model.NewslettersArticles
			updateNewslettersArticles(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewslettersArticles(
			newsletterArticlesId, issueNumber, title, content);
	}

	public static NewslettersArticlesService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewslettersArticlesService, NewslettersArticlesService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			NewslettersArticlesService.class);

		ServiceTracker<NewslettersArticlesService, NewslettersArticlesService>
			serviceTracker =
				new ServiceTracker
					<NewslettersArticlesService, NewslettersArticlesService>(
						bundle.getBundleContext(),
						NewslettersArticlesService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}