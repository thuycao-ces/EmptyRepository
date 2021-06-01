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
import com.liferay.training.newsletter.exception.NoSuchNewsletterException;
import com.liferay.training.newsletter.model.Newsletter;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the newsletter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsletterUtil
 * @generated
 */
@ProviderType
public interface NewsletterPersistence extends BasePersistence<Newsletter> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsletterUtil} to access the newsletter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the newsletters where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the matching newsletters
	 */
	public java.util.List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey);

	/**
	 * Returns a range of all the newsletters where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @return the range of matching newsletters
	 */
	public java.util.List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end);

	/**
	 * Returns an ordered range of all the newsletters where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching newsletters
	 */
	public java.util.List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newsletters where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching newsletters
	 */
	public java.util.List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter
	 * @throws NoSuchNewsletterException if a matching newsletter could not be found
	 */
	public Newsletter findByResourcePrimKey_First(
			long resourcePrimKey,
			com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
				orderByComparator)
		throws NoSuchNewsletterException;

	/**
	 * Returns the first newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter, or <code>null</code> if a matching newsletter could not be found
	 */
	public Newsletter fetchByResourcePrimKey_First(
		long resourcePrimKey,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator);

	/**
	 * Returns the last newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter
	 * @throws NoSuchNewsletterException if a matching newsletter could not be found
	 */
	public Newsletter findByResourcePrimKey_Last(
			long resourcePrimKey,
			com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
				orderByComparator)
		throws NoSuchNewsletterException;

	/**
	 * Returns the last newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter, or <code>null</code> if a matching newsletter could not be found
	 */
	public Newsletter fetchByResourcePrimKey_Last(
		long resourcePrimKey,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator);

	/**
	 * Returns the newsletters before and after the current newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param newsletterId the primary key of the current newsletter
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next newsletter
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	public Newsletter[] findByResourcePrimKey_PrevAndNext(
			long newsletterId, long resourcePrimKey,
			com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
				orderByComparator)
		throws NoSuchNewsletterException;

	/**
	 * Removes all the newsletters where resourcePrimKey = &#63; from the database.
	 *
	 * @param resourcePrimKey the resource prim key
	 */
	public void removeByResourcePrimKey(long resourcePrimKey);

	/**
	 * Returns the number of newsletters where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the number of matching newsletters
	 */
	public int countByResourcePrimKey(long resourcePrimKey);

	/**
	 * Caches the newsletter in the entity cache if it is enabled.
	 *
	 * @param newsletter the newsletter
	 */
	public void cacheResult(Newsletter newsletter);

	/**
	 * Caches the newsletters in the entity cache if it is enabled.
	 *
	 * @param newsletters the newsletters
	 */
	public void cacheResult(java.util.List<Newsletter> newsletters);

	/**
	 * Creates a new newsletter with the primary key. Does not add the newsletter to the database.
	 *
	 * @param newsletterId the primary key for the new newsletter
	 * @return the new newsletter
	 */
	public Newsletter create(long newsletterId);

	/**
	 * Removes the newsletter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter that was removed
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	public Newsletter remove(long newsletterId)
		throws NoSuchNewsletterException;

	public Newsletter updateImpl(Newsletter newsletter);

	/**
	 * Returns the newsletter with the primary key or throws a <code>NoSuchNewsletterException</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	public Newsletter findByPrimaryKey(long newsletterId)
		throws NoSuchNewsletterException;

	/**
	 * Returns the newsletter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter, or <code>null</code> if a newsletter with the primary key could not be found
	 */
	public Newsletter fetchByPrimaryKey(long newsletterId);

	/**
	 * Returns all the newsletters.
	 *
	 * @return the newsletters
	 */
	public java.util.List<Newsletter> findAll();

	/**
	 * Returns a range of all the newsletters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @return the range of newsletters
	 */
	public java.util.List<Newsletter> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the newsletters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newsletters
	 */
	public java.util.List<Newsletter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newsletters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters
	 * @param end the upper bound of the range of newsletters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of newsletters
	 */
	public java.util.List<Newsletter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Newsletter>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the newsletters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of newsletters.
	 *
	 * @return the number of newsletters
	 */
	public int countAll();

}