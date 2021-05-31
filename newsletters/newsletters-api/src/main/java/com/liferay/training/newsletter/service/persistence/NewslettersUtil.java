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

package com.liferay.training.newsletter.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.newsletter.model.Newsletters;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the newsletters service. This utility wraps <code>com.liferay.training.newsletter.service.persistence.impl.NewslettersPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersPersistence
 * @generated
 */
public class NewslettersUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Newsletters newsletters) {
		getPersistence().clearCache(newsletters);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Newsletters> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Newsletters> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Newsletters> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Newsletters> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Newsletters> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Newsletters update(Newsletters newsletters) {
		return getPersistence().update(newsletters);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Newsletters update(
		Newsletters newsletters, ServiceContext serviceContext) {

		return getPersistence().update(newsletters, serviceContext);
	}

	/**
	 * Caches the newsletters in the entity cache if it is enabled.
	 *
	 * @param newsletters the newsletters
	 */
	public static void cacheResult(Newsletters newsletters) {
		getPersistence().cacheResult(newsletters);
	}

	/**
	 * Caches the newsletterses in the entity cache if it is enabled.
	 *
	 * @param newsletterses the newsletterses
	 */
	public static void cacheResult(List<Newsletters> newsletterses) {
		getPersistence().cacheResult(newsletterses);
	}

	/**
	 * Creates a new newsletters with the primary key. Does not add the newsletters to the database.
	 *
	 * @param newslettersId the primary key for the new newsletters
	 * @return the new newsletters
	 */
	public static Newsletters create(long newslettersId) {
		return getPersistence().create(newslettersId);
	}

	/**
	 * Removes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	public static Newsletters remove(long newslettersId)
		throws com.liferay.training.newsletter.exception.
			NoSuchNewslettersException {

		return getPersistence().remove(newslettersId);
	}

	public static Newsletters updateImpl(Newsletters newsletters) {
		return getPersistence().updateImpl(newsletters);
	}

	/**
	 * Returns the newsletters with the primary key or throws a <code>NoSuchNewslettersException</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	public static Newsletters findByPrimaryKey(long newslettersId)
		throws com.liferay.training.newsletter.exception.
			NoSuchNewslettersException {

		return getPersistence().findByPrimaryKey(newslettersId);
	}

	/**
	 * Returns the newsletters with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters, or <code>null</code> if a newsletters with the primary key could not be found
	 */
	public static Newsletters fetchByPrimaryKey(long newslettersId) {
		return getPersistence().fetchByPrimaryKey(newslettersId);
	}

	/**
	 * Returns all the newsletterses.
	 *
	 * @return the newsletterses
	 */
	public static List<Newsletters> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the newsletterses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletterses
	 * @param end the upper bound of the range of newsletterses (not inclusive)
	 * @return the range of newsletterses
	 */
	public static List<Newsletters> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the newsletterses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletterses
	 * @param end the upper bound of the range of newsletterses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newsletterses
	 */
	public static List<Newsletters> findAll(
		int start, int end, OrderByComparator<Newsletters> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the newsletterses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletterses
	 * @param end the upper bound of the range of newsletterses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of newsletterses
	 */
	public static List<Newsletters> findAll(
		int start, int end, OrderByComparator<Newsletters> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the newsletterses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of newsletterses.
	 *
	 * @return the number of newsletterses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NewslettersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<NewslettersPersistence, NewslettersPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NewslettersPersistence.class);

		ServiceTracker<NewslettersPersistence, NewslettersPersistence>
			serviceTracker =
				new ServiceTracker
					<NewslettersPersistence, NewslettersPersistence>(
						bundle.getBundleContext(), NewslettersPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}