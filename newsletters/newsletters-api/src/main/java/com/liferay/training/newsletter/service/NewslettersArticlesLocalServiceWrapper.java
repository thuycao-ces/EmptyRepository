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
 * Provides a wrapper for {@link NewslettersArticlesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesLocalService
 * @generated
 */
public class NewslettersArticlesLocalServiceWrapper
	implements NewslettersArticlesLocalService,
			   ServiceWrapper<NewslettersArticlesLocalService> {

	public NewslettersArticlesLocalServiceWrapper(
		NewslettersArticlesLocalService newslettersArticlesLocalService) {

		_newslettersArticlesLocalService = newslettersArticlesLocalService;
	}

	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			addNewslettersArticles(
				int issueNumber, String title, String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.addNewslettersArticles(
			issueNumber, title, content, userId);
	}

	/**
	 * Adds the newsletters articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was added
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
		addNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return _newslettersArticlesLocalService.addNewslettersArticles(
			newslettersArticles);
	}

	/**
	 * Creates a new newsletters articles with the primary key. Does not add the newsletters articles to the database.
	 *
	 * @param newslettersArticlesId the primary key for the new newsletters articles
	 * @return the new newsletters articles
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
		createNewslettersArticles(long newslettersArticlesId) {

		return _newslettersArticlesLocalService.createNewslettersArticles(
			newslettersArticlesId);
	}

	/**
	 * Deletes the newsletters articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles that was removed
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			deleteNewslettersArticles(long newslettersArticlesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.deleteNewslettersArticles(
			newslettersArticlesId);
	}

	/**
	 * Deletes the newsletters articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was removed
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
		deleteNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return _newslettersArticlesLocalService.deleteNewslettersArticles(
			newslettersArticles);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newslettersArticlesLocalService.dynamicQuery();
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

		return _newslettersArticlesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _newslettersArticlesLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _newslettersArticlesLocalService.dynamicQuery(
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

		return _newslettersArticlesLocalService.dynamicQueryCount(dynamicQuery);
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

		return _newslettersArticlesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
		fetchNewslettersArticles(long newslettersArticlesId) {

		return _newslettersArticlesLocalService.fetchNewslettersArticles(
			newslettersArticlesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newslettersArticlesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newslettersArticlesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticles() {

		return _newslettersArticlesLocalService.getNewslettersArticles();
	}

	/**
	 * Returns the newsletters articles with the primary key.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			getNewslettersArticles(long newslettersArticlesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.getNewslettersArticles(
			newslettersArticlesId);
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
	@Override
	public java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticleses(int start, int end) {

		return _newslettersArticlesLocalService.getNewslettersArticleses(
			start, end);
	}

	/**
	 * Returns the number of newsletters articleses.
	 *
	 * @return the number of newsletters articleses
	 */
	@Override
	public int getNewslettersArticlesesCount() {
		return _newslettersArticlesLocalService.getNewslettersArticlesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newslettersArticlesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
			updateNewslettersArticles(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersArticlesLocalService.updateNewslettersArticles(
			newsletterArticlesId, issueNumber, title, content);
	}

	/**
	 * Updates the newsletters articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was updated
	 */
	@Override
	public com.liferay.training.newsletter.model.NewslettersArticles
		updateNewslettersArticles(
			com.liferay.training.newsletter.model.NewslettersArticles
				newslettersArticles) {

		return _newslettersArticlesLocalService.updateNewslettersArticles(
			newslettersArticles);
	}

	@Override
	public NewslettersArticlesLocalService getWrappedService() {
		return _newslettersArticlesLocalService;
	}

	@Override
	public void setWrappedService(
		NewslettersArticlesLocalService newslettersArticlesLocalService) {

		_newslettersArticlesLocalService = newslettersArticlesLocalService;
	}

	private NewslettersArticlesLocalService _newslettersArticlesLocalService;

}