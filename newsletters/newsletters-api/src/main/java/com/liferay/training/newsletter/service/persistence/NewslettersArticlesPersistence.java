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
import com.liferay.training.newsletter.exception.NoSuchNewslettersArticlesException;
import com.liferay.training.newsletter.model.NewslettersArticles;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the newsletters articles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesUtil
 * @generated
 */
@ProviderType
public interface NewslettersArticlesPersistence
	extends BasePersistence<NewslettersArticles> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewslettersArticlesUtil} to access the newsletters articles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the newsletters articles in the entity cache if it is enabled.
	 *
	 * @param newslettersArticles the newsletters articles
	 */
	public void cacheResult(NewslettersArticles newslettersArticles);

	/**
	 * Caches the newsletters articleses in the entity cache if it is enabled.
	 *
	 * @param newslettersArticleses the newsletters articleses
	 */
	public void cacheResult(
		java.util.List<NewslettersArticles> newslettersArticleses);

	/**
	 * Creates a new newsletters articles with the primary key. Does not add the newsletters articles to the database.
	 *
	 * @param newslettersArticlesId the primary key for the new newsletters articles
	 * @return the new newsletters articles
	 */
	public NewslettersArticles create(long newslettersArticlesId);

	/**
	 * Removes the newsletters articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles that was removed
	 * @throws NoSuchNewslettersArticlesException if a newsletters articles with the primary key could not be found
	 */
	public NewslettersArticles remove(long newslettersArticlesId)
		throws NoSuchNewslettersArticlesException;

	public NewslettersArticles updateImpl(
		NewslettersArticles newslettersArticles);

	/**
	 * Returns the newsletters articles with the primary key or throws a <code>NoSuchNewslettersArticlesException</code> if it could not be found.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles
	 * @throws NoSuchNewslettersArticlesException if a newsletters articles with the primary key could not be found
	 */
	public NewslettersArticles findByPrimaryKey(long newslettersArticlesId)
		throws NoSuchNewslettersArticlesException;

	/**
	 * Returns the newsletters articles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles, or <code>null</code> if a newsletters articles with the primary key could not be found
	 */
	public NewslettersArticles fetchByPrimaryKey(long newslettersArticlesId);

	/**
	 * Returns all the newsletters articleses.
	 *
	 * @return the newsletters articleses
	 */
	public java.util.List<NewslettersArticles> findAll();

	/**
	 * Returns a range of all the newsletters articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters articleses
	 * @param end the upper bound of the range of newsletters articleses (not inclusive)
	 * @return the range of newsletters articleses
	 */
	public java.util.List<NewslettersArticles> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the newsletters articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters articleses
	 * @param end the upper bound of the range of newsletters articleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newsletters articleses
	 */
	public java.util.List<NewslettersArticles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewslettersArticles>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newsletters articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters articleses
	 * @param end the upper bound of the range of newsletters articleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of newsletters articleses
	 */
	public java.util.List<NewslettersArticles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewslettersArticles>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the newsletters articleses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of newsletters articleses.
	 *
	 * @return the number of newsletters articleses
	 */
	public int countAll();

}