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
 * Provides a wrapper for {@link NewsLetterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetterLocalService
 * @generated
 */
public class NewsLetterLocalServiceWrapper
	implements NewsLetterLocalService, ServiceWrapper<NewsLetterLocalService> {

	public NewsLetterLocalServiceWrapper(
		NewsLetterLocalService newsLetterLocalService) {

		_newsLetterLocalService = newsLetterLocalService;
	}

	/**
	 * Adds the news letter to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter the news letter
	 * @return the news letter that was added
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter addNewsLetter(
		com.liferay.training.news.letter.model.NewsLetter newsLetter) {

		return _newsLetterLocalService.addNewsLetter(newsLetter);
	}

	/**
	 * Creates a new news letter with the primary key. Does not add the news letter to the database.
	 *
	 * @param newsletterId the primary key for the new news letter
	 * @return the new news letter
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter createNewsLetter(
		long newsletterId) {

		return _newsLetterLocalService.createNewsLetter(newsletterId);
	}

	/**
	 * Deletes the news letter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter that was removed
	 * @throws PortalException if a news letter with the primary key could not be found
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter deleteNewsLetter(
			long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterLocalService.deleteNewsLetter(newsletterId);
	}

	/**
	 * Deletes the news letter from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter the news letter
	 * @return the news letter that was removed
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter deleteNewsLetter(
		com.liferay.training.news.letter.model.NewsLetter newsLetter) {

		return _newsLetterLocalService.deleteNewsLetter(newsLetter);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsLetterLocalService.dynamicQuery();
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

		return _newsLetterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetterModelImpl</code>.
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

		return _newsLetterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetterModelImpl</code>.
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

		return _newsLetterLocalService.dynamicQuery(
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

		return _newsLetterLocalService.dynamicQueryCount(dynamicQuery);
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

		return _newsLetterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.news.letter.model.NewsLetter fetchNewsLetter(
		long newsletterId) {

		return _newsLetterLocalService.fetchNewsLetter(newsletterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newsLetterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newsLetterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the news letter with the primary key.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter
	 * @throws PortalException if a news letter with the primary key could not be found
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter getNewsLetter(
			long newsletterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterLocalService.getNewsLetter(newsletterId);
	}

	/**
	 * Returns a range of all the news letters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letters
	 * @param end the upper bound of the range of news letters (not inclusive)
	 * @return the range of news letters
	 */
	@Override
	public java.util.List<com.liferay.training.news.letter.model.NewsLetter>
		getNewsLetters(int start, int end) {

		return _newsLetterLocalService.getNewsLetters(start, end);
	}

	/**
	 * Returns the number of news letters.
	 *
	 * @return the number of news letters
	 */
	@Override
	public int getNewsLettersCount() {
		return _newsLetterLocalService.getNewsLettersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsLetterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLetterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the news letter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter the news letter
	 * @return the news letter that was updated
	 */
	@Override
	public com.liferay.training.news.letter.model.NewsLetter updateNewsLetter(
		com.liferay.training.news.letter.model.NewsLetter newsLetter) {

		return _newsLetterLocalService.updateNewsLetter(newsLetter);
	}

	@Override
	public NewsLetterLocalService getWrappedService() {
		return _newsLetterLocalService;
	}

	@Override
	public void setWrappedService(
		NewsLetterLocalService newsLetterLocalService) {

		_newsLetterLocalService = newsLetterLocalService;
	}

	private NewsLetterLocalService _newsLetterLocalService;

}