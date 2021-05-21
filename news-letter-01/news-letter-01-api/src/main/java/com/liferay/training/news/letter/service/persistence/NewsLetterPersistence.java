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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.news.letter.exception.NoSuchNewsLetterException;
import com.liferay.training.news.letter.model.NewsLetter;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the news letter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetterUtil
 * @generated
 */
@ProviderType
public interface NewsLetterPersistence extends BasePersistence<NewsLetter> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsLetterUtil} to access the news letter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the news letter in the entity cache if it is enabled.
	 *
	 * @param newsLetter the news letter
	 */
	public void cacheResult(NewsLetter newsLetter);

	/**
	 * Caches the news letters in the entity cache if it is enabled.
	 *
	 * @param newsLetters the news letters
	 */
	public void cacheResult(java.util.List<NewsLetter> newsLetters);

	/**
	 * Creates a new news letter with the primary key. Does not add the news letter to the database.
	 *
	 * @param newsletterId the primary key for the new news letter
	 * @return the new news letter
	 */
	public NewsLetter create(long newsletterId);

	/**
	 * Removes the news letter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter that was removed
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	public NewsLetter remove(long newsletterId)
		throws NoSuchNewsLetterException;

	public NewsLetter updateImpl(NewsLetter newsLetter);

	/**
	 * Returns the news letter with the primary key or throws a <code>NoSuchNewsLetterException</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	public NewsLetter findByPrimaryKey(long newsletterId)
		throws NoSuchNewsLetterException;

	/**
	 * Returns the news letter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter, or <code>null</code> if a news letter with the primary key could not be found
	 */
	public NewsLetter fetchByPrimaryKey(long newsletterId);

	/**
	 * Returns all the news letters.
	 *
	 * @return the news letters
	 */
	public java.util.List<NewsLetter> findAll();

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
	public java.util.List<NewsLetter> findAll(int start, int end);

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
	public java.util.List<NewsLetter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsLetter>
			orderByComparator);

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
	public java.util.List<NewsLetter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsLetter>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the news letters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of news letters.
	 *
	 * @return the number of news letters
	 */
	public int countAll();

}