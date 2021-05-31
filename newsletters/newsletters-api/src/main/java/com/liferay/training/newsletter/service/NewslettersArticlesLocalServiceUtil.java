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
 * Provides the local service utility for NewslettersArticles. This utility wraps
 * <code>com.liferay.training.newsletter.service.impl.NewslettersArticlesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesLocalService
 * @generated
 */
public class NewslettersArticlesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.newsletter.service.impl.NewslettersArticlesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
			addNewslettersArticles(
				int issueNumber, String title, String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewslettersArticles(
			issueNumber, title, content, userId);
	}

	/**
	 * Adds the newsletters articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was added
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
		addNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return getService().addNewslettersArticles(newslettersArticles);
	}

	/**
	 * Creates a new newsletters articles with the primary key. Does not add the newsletters articles to the database.
	 *
	 * @param newslettersArticlesId the primary key for the new newsletters articles
	 * @return the new newsletters articles
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
		createNewslettersArticles(long newslettersArticlesId) {

		return getService().createNewslettersArticles(newslettersArticlesId);
	}

	/**
	 * Deletes the newsletters articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles that was removed
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
			deleteNewslettersArticles(long newslettersArticlesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNewslettersArticles(newslettersArticlesId);
	}

	/**
	 * Deletes the newsletters articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was removed
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
		deleteNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return getService().deleteNewslettersArticles(newslettersArticles);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.newsletter.model.NewslettersArticles
		fetchNewslettersArticles(long newslettersArticlesId) {

		return getService().fetchNewslettersArticles(newslettersArticlesId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticles() {

		return getService().getNewslettersArticles();
	}

	/**
	 * Returns the newsletters articles with the primary key.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
			getNewslettersArticles(long newslettersArticlesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNewslettersArticles(newslettersArticlesId);
	}

	/**
	 * Returns a range of all the newsletters articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters articleses
	 * @param end the upper bound of the range of newsletters articleses (not inclusive)
	 * @return the range of newsletters articleses
	 */
	public static java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticleses(int start, int end) {

		return getService().getNewslettersArticleses(start, end);
	}

	/**
	 * Returns the number of newsletters articleses.
	 *
	 * @return the number of newsletters articleses
	 */
	public static int getNewslettersArticlesesCount() {
		return getService().getNewslettersArticlesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.training.newsletter.model.NewslettersArticles
			updateNewslettersArticles(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewslettersArticles(
			newsletterArticlesId, issueNumber, title, content);
	}

	/**
	 * Updates the newsletters articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was updated
	 */
	public static com.liferay.training.newsletter.model.NewslettersArticles
		updateNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return getService().updateNewslettersArticles(newslettersArticles);
	}

	public static NewslettersArticlesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewslettersArticlesLocalService, NewslettersArticlesLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			NewslettersArticlesLocalService.class);

		ServiceTracker
			<NewslettersArticlesLocalService, NewslettersArticlesLocalService>
				serviceTracker =
					new ServiceTracker
						<NewslettersArticlesLocalService,
						 NewslettersArticlesLocalService>(
							 bundle.getBundleContext(),
							 NewslettersArticlesLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}