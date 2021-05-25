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
 * Provides the remote service utility for NewsLetter_Articles. This utility wraps
 * <code>com.liferay.training.news.letter.service.impl.NewsLetter_ArticlesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesService
 * @generated
 */
public class NewsLetter_ArticlesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.news.letter.service.impl.NewsLetter_ArticlesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			addNewsLetter_Articles(
				long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewsLetter_Articles(
			newsletterId, articlesId, serviceContext);
	}

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			deleteNewsLetter_Articles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNewsLetter_Articles(id);
	}

	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articles() {

		return getService().getNewsLetter_Articles();
	}

	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_ArticlesByNewsletterId(long newsletterId) {

		return getService().getNewsLetter_ArticlesByNewsletterId(newsletterId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			updateNewsLetter_Articles(
				long newsletter_articles_Id, long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewsLetter_Articles(
			newsletter_articles_Id, newsletterId, articlesId, serviceContext);
	}

	public static NewsLetter_ArticlesService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewsLetter_ArticlesService, NewsLetter_ArticlesService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			NewsLetter_ArticlesService.class);

		ServiceTracker<NewsLetter_ArticlesService, NewsLetter_ArticlesService>
			serviceTracker =
				new ServiceTracker
					<NewsLetter_ArticlesService, NewsLetter_ArticlesService>(
						bundle.getBundleContext(),
						NewsLetter_ArticlesService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}