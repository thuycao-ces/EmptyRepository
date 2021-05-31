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
 * Provides the local service utility for Newsletters. This utility wraps
 * <code>com.liferay.training.newsletter.service.impl.NewslettersLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersLocalService
 * @generated
 */
public class NewslettersLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.newsletter.service.impl.NewslettersLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.newsletter.model.Newsletters
			addNewsletters(
				int issueNumber, String title, String description,
				java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addNewsletters(
			issueNumber, title, description, issueDate);
	}

	/**
	 * Adds the newsletters to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was added
	 */
	public static com.liferay.training.newsletter.model.Newsletters
		addNewsletters(
			com.liferay.training.newsletter.model.Newsletters newsletters) {

		return getService().addNewsletters(newsletters);
	}

	/**
	 * Creates a new newsletters with the primary key. Does not add the newsletters to the database.
	 *
	 * @param newslettersId the primary key for the new newsletters
	 * @return the new newsletters
	 */
	public static com.liferay.training.newsletter.model.Newsletters
		createNewsletters(long newslettersId) {

		return getService().createNewsletters(newslettersId);
	}

	/**
	 * Deletes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws PortalException if a newsletters with the primary key could not be found
	 */
	public static com.liferay.training.newsletter.model.Newsletters
			deleteNewsletters(long newslettersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteNewsletters(newslettersId);
	}

	/**
	 * Deletes the newsletters from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was removed
	 */
	public static com.liferay.training.newsletter.model.Newsletters
		deleteNewsletters(
			com.liferay.training.newsletter.model.Newsletters newsletters) {

		return getService().deleteNewsletters(newsletters);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersModelImpl</code>.
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

	public static com.liferay.training.newsletter.model.Newsletters
		fetchNewsletters(long newslettersId) {

		return getService().fetchNewsletters(newslettersId);
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
		<com.liferay.training.newsletter.model.Newsletters> getNewsletters() {

		return getService().getNewsletters();
	}

	/**
	 * Returns the newsletters with the primary key.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters
	 * @throws PortalException if a newsletters with the primary key could not be found
	 */
	public static com.liferay.training.newsletter.model.Newsletters
			getNewsletters(long newslettersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNewsletters(newslettersId);
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
	public static java.util.List
		<com.liferay.training.newsletter.model.Newsletters> getNewsletterses(
			int start, int end) {

		return getService().getNewsletterses(start, end);
	}

	/**
	 * Returns the number of newsletterses.
	 *
	 * @return the number of newsletterses
	 */
	public static int getNewslettersesCount() {
		return getService().getNewslettersesCount();
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

	public static com.liferay.training.newsletter.model.Newsletters
			updateNewsletters(
				long newsletterId, int issueNumber, String title,
				String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateNewsletters(
			newsletterId, issueNumber, title, description, issueDate);
	}

	/**
	 * Updates the newsletters in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsletters the newsletters
	 * @return the newsletters that was updated
	 */
	public static com.liferay.training.newsletter.model.Newsletters
		updateNewsletters(
			com.liferay.training.newsletter.model.Newsletters newsletters) {

		return getService().updateNewsletters(newsletters);
	}

	public static NewslettersLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewslettersLocalService, NewslettersLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NewslettersLocalService.class);

		ServiceTracker<NewslettersLocalService, NewslettersLocalService>
			serviceTracker =
				new ServiceTracker
					<NewslettersLocalService, NewslettersLocalService>(
						bundle.getBundleContext(),
						NewslettersLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}