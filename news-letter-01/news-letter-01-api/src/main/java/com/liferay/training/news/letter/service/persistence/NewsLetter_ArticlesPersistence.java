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
import com.liferay.training.news.letter.exception.NoSuchNewsLetter_ArticlesException;
import com.liferay.training.news.letter.model.NewsLetter_Articles;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the news letter_ articles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesUtil
 * @generated
 */
@ProviderType
public interface NewsLetter_ArticlesPersistence
	extends BasePersistence<NewsLetter_Articles> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsLetter_ArticlesUtil} to access the news letter_ articles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the news letter_ articles in the entity cache if it is enabled.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 */
	public void cacheResult(NewsLetter_Articles newsLetter_Articles);

	/**
	 * Caches the news letter_ articleses in the entity cache if it is enabled.
	 *
	 * @param newsLetter_Articleses the news letter_ articleses
	 */
	public void cacheResult(
		java.util.List<NewsLetter_Articles> newsLetter_Articleses);

	/**
	 * Creates a new news letter_ articles with the primary key. Does not add the news letter_ articles to the database.
	 *
	 * @param newsletter_articles_Id the primary key for the new news letter_ articles
	 * @return the new news letter_ articles
	 */
	public NewsLetter_Articles create(long newsletter_articles_Id);

	/**
	 * Removes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	public NewsLetter_Articles remove(long newsletter_articles_Id)
		throws NoSuchNewsLetter_ArticlesException;

	public NewsLetter_Articles updateImpl(
		NewsLetter_Articles newsLetter_Articles);

	/**
	 * Returns the news letter_ articles with the primary key or throws a <code>NoSuchNewsLetter_ArticlesException</code> if it could not be found.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	public NewsLetter_Articles findByPrimaryKey(long newsletter_articles_Id)
		throws NoSuchNewsLetter_ArticlesException;

	/**
	 * Returns the news letter_ articles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles, or <code>null</code> if a news letter_ articles with the primary key could not be found
	 */
	public NewsLetter_Articles fetchByPrimaryKey(long newsletter_articles_Id);

	/**
	 * Returns all the news letter_ articleses.
	 *
	 * @return the news letter_ articleses
	 */
	public java.util.List<NewsLetter_Articles> findAll();

	/**
	 * Returns a range of all the news letter_ articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letter_ articleses
	 * @param end the upper bound of the range of news letter_ articleses (not inclusive)
	 * @return the range of news letter_ articleses
	 */
	public java.util.List<NewsLetter_Articles> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the news letter_ articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letter_ articleses
	 * @param end the upper bound of the range of news letter_ articleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of news letter_ articleses
	 */
	public java.util.List<NewsLetter_Articles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsLetter_Articles>
			orderByComparator);

	/**
	 * Returns an ordered range of all the news letter_ articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letter_ articleses
	 * @param end the upper bound of the range of news letter_ articleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of news letter_ articleses
	 */
	public java.util.List<NewsLetter_Articles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsLetter_Articles>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the news letter_ articleses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of news letter_ articleses.
	 *
	 * @return the number of news letter_ articleses
	 */
	public int countAll();

}