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
 * Provides a wrapper for {@link NewslettersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersLocalService
 * @generated
 */
public class NewslettersLocalServiceWrapper
	implements NewslettersLocalService,
			   ServiceWrapper<NewslettersLocalService> {

	public NewslettersLocalServiceWrapper(
		NewslettersLocalService newslettersLocalService) {

		_newslettersLocalService = newslettersLocalService;
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters addNewsletters(
			int issueNumber, String title, String description,
			java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.addNewsletters(
			issueNumber, title, description, issueDate);
	}

	/**
	 * Adds the newsletters to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was added
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters addNewsletters(
		com.liferay.training.newsletter.model.Newsletters newsletters) {

		return _newslettersLocalService.addNewsletters(newsletters);
	}

	/**
	 * Creates a new newsletters with the primary key. Does not add the newsletters to the database.
	 *
	 * @param newslettersId the primary key for the new newsletters
	 * @return the new newsletters
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters createNewsletters(
		long newslettersId) {

		return _newslettersLocalService.createNewsletters(newslettersId);
	}

	/**
	 * Deletes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws PortalException if a newsletters with the primary key could not be found
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters deleteNewsletters(
			long newslettersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.deleteNewsletters(newslettersId);
	}

	/**
	 * Deletes the newsletters from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was removed
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters deleteNewsletters(
		com.liferay.training.newsletter.model.Newsletters newsletters) {

		return _newslettersLocalService.deleteNewsletters(newsletters);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newslettersLocalService.dynamicQuery();
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

		return _newslettersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersModelImpl</code>.
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

		return _newslettersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersModelImpl</code>.
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

		return _newslettersLocalService.dynamicQuery(
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

		return _newslettersLocalService.dynamicQueryCount(dynamicQuery);
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

		return _newslettersLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters fetchNewsletters(
		long newslettersId) {

		return _newslettersLocalService.fetchNewsletters(newslettersId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newslettersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newslettersLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.training.newsletter.model.Newsletters>
		getNewsletters() {

		return _newslettersLocalService.getNewsletters();
	}

	/**
	 * Returns the newsletters with the primary key.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters
	 * @throws PortalException if a newsletters with the primary key could not be found
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters getNewsletters(
			long newslettersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.getNewsletters(newslettersId);
	}

	/**
	 * Returns a range of all the newsletterses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletterses
	 * @param end the upper bound of the range of newsletterses (not inclusive)
	 * @return the range of newsletterses
	 */
	@Override
	public java.util.List<com.liferay.training.newsletter.model.Newsletters>
		getNewsletterses(int start, int end) {

		return _newslettersLocalService.getNewsletterses(start, end);
	}

	/**
	 * Returns the number of newsletterses.
	 *
	 * @return the number of newsletterses
	 */
	@Override
	public int getNewslettersesCount() {
		return _newslettersLocalService.getNewslettersesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newslettersLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.training.newsletter.model.Newsletters updateNewsletters(
			long newsletterId, int issueNumber, String title,
			String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newslettersLocalService.updateNewsletters(
			newsletterId, issueNumber, title, description, issueDate);
	}

	/**
	 * Updates the newsletters in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was updated
	 */
	@Override
	public com.liferay.training.newsletter.model.Newsletters updateNewsletters(
		com.liferay.training.newsletter.model.Newsletters newsletters) {

		return _newslettersLocalService.updateNewsletters(newsletters);
	}

	@Override
	public NewslettersLocalService getWrappedService() {
		return _newslettersLocalService;
	}

	@Override
	public void setWrappedService(
		NewslettersLocalService newslettersLocalService) {

		_newslettersLocalService = newslettersLocalService;
	}

	private NewslettersLocalService _newslettersLocalService;

}