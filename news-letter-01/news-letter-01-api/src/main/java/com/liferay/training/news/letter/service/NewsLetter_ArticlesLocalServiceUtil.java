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
 * Provides the local service utility for NewsLetter_Articles. This utility wraps
 * <code>com.liferay.training.news.letter.service.impl.NewsLetter_ArticlesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesLocalService
 * @generated
 */
public class NewsLetter_ArticlesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.news.letter.service.impl.NewsLetter_ArticlesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			addNewsLetter_Articles(
				long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewsLetter_Articles(
			newsletterId, articlesId, serviceContext);
	}

	/**
	 * Adds the news letter_ articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was added
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
		addNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return getService().addNewsLetter_Articles(newsLetter_Articles);
	}

	/**
	 * Creates a new news letter_ articles with the primary key. Does not add the news letter_ articles to the database.
	 *
	 * @param newsletter_articles_Id the primary key for the new news letter_ articles
	 * @return the new news letter_ articles
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
		createNewsLetter_Articles(long newsletter_articles_Id) {

		return getService().createNewsLetter_Articles(newsletter_articles_Id);
	}

	/**
	 * Deletes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			deleteNewsLetter_Articles(long newsletter_articles_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNewsLetter_Articles(newsletter_articles_Id);
	}

	/**
	 * Deletes the news letter_ articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was removed
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
		deleteNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return getService().deleteNewsLetter_Articles(newsLetter_Articles);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
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

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
		fetchNewsLetter_Articles(long newsletter_articles_Id) {

		return getService().fetchNewsLetter_Articles(newsletter_articles_Id);
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
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articles() {

		return getService().getNewsLetter_Articles();
	}

	/**
	 * Returns the news letter_ articles with the primary key.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			getNewsLetter_Articles(long newsletter_articles_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNewsLetter_Articles(newsletter_articles_Id);
	}

	/**
	 * Returns a range of all the news letter_ articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letter_ articleses
	 * @param end the upper bound of the range of news letter_ articleses (not inclusive)
	 * @return the range of news letter_ articleses
	 */
	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articleses(int start, int end) {

		return getService().getNewsLetter_Articleses(start, end);
	}

	/**
	 * Returns the number of news letter_ articleses.
	 *
	 * @return the number of news letter_ articleses
	 */
	public static int getNewsLetter_ArticlesesCount() {
		return getService().getNewsLetter_ArticlesesCount();
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

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			updateNewsLetter_Articles(
				long newsletter_articles_Id, long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewsLetter_Articles(
			newsletter_articles_Id, newsletterId, articlesId, serviceContext);
	}

	/**
	 * Updates the news letter_ articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was updated
	 */
	public static com.liferay.training.news.letter.model.NewsLetter_Articles
		updateNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return getService().updateNewsLetter_Articles(newsLetter_Articles);
	}

	public static NewsLetter_ArticlesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewsLetter_ArticlesLocalService, NewsLetter_ArticlesLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			NewsLetter_ArticlesLocalService.class);

		ServiceTracker
			<NewsLetter_ArticlesLocalService, NewsLetter_ArticlesLocalService>
				serviceTracker =
					new ServiceTracker
						<NewsLetter_ArticlesLocalService,
						 NewsLetter_ArticlesLocalService>(
							 bundle.getBundleContext(),
							 NewsLetter_ArticlesLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}