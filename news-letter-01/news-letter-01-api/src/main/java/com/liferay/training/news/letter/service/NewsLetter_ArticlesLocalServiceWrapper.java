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
 * Provides a wrapper for {@link NewsLetter_ArticlesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesLocalService
 * @generated
 */
public class NewsLetter_ArticlesLocalServiceWrapper
	implements NewsLetter_ArticlesLocalService,
			   ServiceWrapper<NewsLetter_ArticlesLocalService> {

	public NewsLetter_ArticlesLocalServiceWrapper(
		NewsLetter_ArticlesLocalService newsLetter_ArticlesLocalService) {

		_newsLetter_ArticlesLocalService = newsLetter_ArticlesLocalService;
	}

	/**
	 * Adds the news letter_ articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was added
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
		addNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return _newsLetter_ArticlesLocalService.addNewsLetter_Articles(
			newsLetter_Articles);
	}

	/**
	 * Creates a new news letter_ articles with the primary key. Does not add the news letter_ articles to the database.
	 *
	 * @param newsletter_articles_Id the primary key for the new news letter_ articles
	 * @return the new news letter_ articles
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
		createNewsLetter_Articles(long newsletter_articles_Id) {

		return _newsLetter_ArticlesLocalService.createNewsLetter_Articles(
			newsletter_articles_Id);
	}

	/**
	 * Deletes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
			deleteNewsLetter_Articles(long newsletter_articles_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesLocalService.deleteNewsLetter_Articles(
			newsletter_articles_Id);
	}

	/**
	 * Deletes the news letter_ articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was removed
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
		deleteNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return _newsLetter_ArticlesLocalService.deleteNewsLetter_Articles(
			newsLetter_Articles);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsLetter_ArticlesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _newsLetter_ArticlesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _newsLetter_ArticlesLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _newsLetter_ArticlesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _newsLetter_ArticlesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _newsLetter_ArticlesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
		fetchNewsLetter_Articles(long newsletter_articles_Id) {

		return _newsLetter_ArticlesLocalService.fetchNewsLetter_Articles(
			newsletter_articles_Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newsLetter_ArticlesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newsLetter_ArticlesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the news letter_ articles with the primary key.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
			getNewsLetter_Articles(long newsletter_articles_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesLocalService.getNewsLetter_Articles(
			newsletter_articles_Id);
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
	@Override
	public java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articleses(int start, int end) {

		return _newsLetter_ArticlesLocalService.getNewsLetter_Articleses(
			start, end);
	}

	/**
	 * Returns the number of news letter_ articleses.
	 *
	 * @return the number of news letter_ articleses
	 */
	@Override
	public int getNewsLetter_ArticlesesCount() {
		return _newsLetter_ArticlesLocalService.getNewsLetter_ArticlesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsLetter_ArticlesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetter_ArticlesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the news letter_ articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was updated
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter_Articles
		updateNewsLetter_Articles(
			com.liferay.training.news.letter.model.NewsLetter_Articles
				newsLetter_Articles) {

		return _newsLetter_ArticlesLocalService.updateNewsLetter_Articles(
			newsLetter_Articles);
	}

	@Override
	public NewsLetter_ArticlesLocalService getWrappedService() {
		return _newsLetter_ArticlesLocalService;
	}

	@Override
	public void setWrappedService(
		NewsLetter_ArticlesLocalService newsLetter_ArticlesLocalService) {

		_newsLetter_ArticlesLocalService = newsLetter_ArticlesLocalService;
	}

	private NewsLetter_ArticlesLocalService _newsLetter_ArticlesLocalService;

}