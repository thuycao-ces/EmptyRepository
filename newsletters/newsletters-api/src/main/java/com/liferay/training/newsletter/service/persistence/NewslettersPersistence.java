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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.newsletter.exception.NoSuchNewslettersException;
import com.liferay.training.newsletter.model.Newsletters;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the newsletters service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersUtil
 * @generated
 */
@ProviderType
public interface NewslettersPersistence extends BasePersistence<Newsletters> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewslettersUtil} to access the newsletters persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the newsletters in the entity cache if it is enabled.
	 *
	 * @param newsletters the newsletters
	 */
	public void cacheResult(Newsletters newsletters);

	/**
	 * Caches the newsletterses in the entity cache if it is enabled.
	 *
	 * @param newsletterses the newsletterses
	 */
	public void cacheResult(java.util.List<Newsletters> newsletterses);

	/**
	 * Creates a new newsletters with the primary key. Does not add the newsletters to the database.
	 *
	 * @param newslettersId the primary key for the new newsletters
	 * @return the new newsletters
	 */
	public Newsletters create(long newslettersId);

	/**
	 * Removes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	public Newsletters remove(long newslettersId)
		throws NoSuchNewslettersException;

	public Newsletters updateImpl(Newsletters newsletters);

	/**
	 * Returns the newsletters with the primary key or throws a <code>NoSuchNewslettersException</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	public Newsletters findByPrimaryKey(long newslettersId)
		throws NoSuchNewslettersException;

	/**
	 * Returns the newsletters with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters, or <code>null</code> if a newsletters with the primary key could not be found
	 */
	public Newsletters fetchByPrimaryKey(long newslettersId);

	/**
	 * Returns all the newsletterses.
	 *
	 * @return the newsletterses
	 */
	public java.util.List<Newsletters> findAll();

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
	public java.util.List<Newsletters> findAll(int start, int end);

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
	public java.util.List<Newsletters> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletters>
			orderByComparator);

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
	public java.util.List<Newsletters> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletters>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the newsletterses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of newsletterses.
	 *
	 * @return the number of newsletterses
	 */
	public int countAll();

}