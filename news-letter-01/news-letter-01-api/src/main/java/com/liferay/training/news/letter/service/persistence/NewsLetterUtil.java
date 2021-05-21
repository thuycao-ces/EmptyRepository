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

package com.liferay.training.news.letter.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.news.letter.model.NewsLetter;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the news letter service. This utility wraps <code>com.liferay.training.news.letter.service.persistence.impl.NewsLetterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetterPersistence
 * @generated
 */
public class NewsLetterUtil {

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
	public static void clearCache(NewsLetter newsLetter) {
		getPersistence().clearCache(newsLetter);
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
	public static Map<Serializable, NewsLetter> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NewsLetter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NewsLetter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NewsLetter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NewsLetter> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NewsLetter update(NewsLetter newsLetter) {
		return getPersistence().update(newsLetter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NewsLetter update(
		NewsLetter newsLetter, ServiceContext serviceContext) {

		return getPersistence().update(newsLetter, serviceContext);
	}

	/**
	 * Caches the news letter in the entity cache if it is enabled.
	 *
	 * @param newsLetter the news letter
	 */
	public static void cacheResult(NewsLetter newsLetter) {
		getPersistence().cacheResult(newsLetter);
	}

	/**
	 * Caches the news letters in the entity cache if it is enabled.
	 *
	 * @param newsLetters the news letters
	 */
	public static void cacheResult(List<NewsLetter> newsLetters) {
		getPersistence().cacheResult(newsLetters);
	}

	/**
	 * Creates a new news letter with the primary key. Does not add the news letter to the database.
	 *
	 * @param newsletterId the primary key for the new news letter
	 * @return the new news letter
	 */
	public static NewsLetter create(long newsletterId) {
		return getPersistence().create(newsletterId);
	}

	/**
	 * Removes the news letter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter that was removed
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	public static NewsLetter remove(long newsletterId)
		throws com.liferay.training.news.letter.exception.
			NoSuchNewsLetterException {

		return getPersistence().remove(newsletterId);
	}

	public static NewsLetter updateImpl(NewsLetter newsLetter) {
		return getPersistence().updateImpl(newsLetter);
	}

	/**
	 * Returns the news letter with the primary key or throws a <code>NoSuchNewsLetterException</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	public static NewsLetter findByPrimaryKey(long newsletterId)
		throws com.liferay.training.news.letter.exception.
			NoSuchNewsLetterException {

		return getPersistence().findByPrimaryKey(newsletterId);
	}

	/**
	 * Returns the news letter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter, or <code>null</code> if a news letter with the primary key could not be found
	 */
	public static NewsLetter fetchByPrimaryKey(long newsletterId) {
		return getPersistence().fetchByPrimaryKey(newsletterId);
	}

	/**
	 * Returns all the news letters.
	 *
	 * @return the news letters
	 */
	public static List<NewsLetter> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the news letters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letters
	 * @param end the upper bound of the range of news letters (not inclusive)
	 * @return the range of news letters
	 */
	public static List<NewsLetter> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the news letters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letters
	 * @param end the upper bound of the range of news letters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of news letters
	 */
	public static List<NewsLetter> findAll(
		int start, int end, OrderByComparator<NewsLetter> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the news letters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letters
	 * @param end the upper bound of the range of news letters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of news letters
	 */
	public static List<NewsLetter> findAll(
		int start, int end, OrderByComparator<NewsLetter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the news letters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of news letters.
	 *
	 * @return the number of news letters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NewsLetterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NewsLetterPersistence, NewsLetterPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NewsLetterPersistence.class);

		ServiceTracker<NewsLetterPersistence, NewsLetterPersistence>
			serviceTracker =
				new ServiceTracker
					<NewsLetterPersistence, NewsLetterPersistence>(
						bundle.getBundleContext(), NewsLetterPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}