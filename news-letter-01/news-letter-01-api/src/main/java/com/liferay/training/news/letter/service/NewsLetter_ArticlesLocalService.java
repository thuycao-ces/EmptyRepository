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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.news.letter.model.NewsLetter_Articles;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for NewsLetter_Articles. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface NewsLetter_ArticlesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsLetter_ArticlesLocalServiceUtil} to access the news letter_ articles local service. Add custom service methods to <code>com.liferay.training.news.letter.service.impl.NewsLetter_ArticlesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public NewsLetter_Articles addNewsLetter_Articles(
			long newsletterId, long articlesId, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the news letter_ articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NewsLetter_Articles addNewsLetter_Articles(
		NewsLetter_Articles newsLetter_Articles);

	/**
	 * Creates a new news letter_ articles with the primary key. Does not add the news letter_ articles to the database.
	 *
	 * @param newsletter_articles_Id the primary key for the new news letter_ articles
	 * @return the new news letter_ articles
	 */
	@Transactional(enabled = false)
	public NewsLetter_Articles createNewsLetter_Articles(
		long newsletter_articles_Id);

	/**
	 * Deletes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public NewsLetter_Articles deleteNewsLetter_Articles(
			long newsletter_articles_Id)
		throws PortalException;

	/**
	 * Deletes the news letter_ articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public NewsLetter_Articles deleteNewsLetter_Articles(
		NewsLetter_Articles newsLetter_Articles);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NewsLetter_Articles fetchNewsLetter_Articles(
		long newsletter_articles_Id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NewsLetter_Articles> getNewsLetter_Articles();

	/**
	 * Returns the news letter_ articles with the primary key.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws PortalException if a news letter_ articles with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NewsLetter_Articles getNewsLetter_Articles(
			long newsletter_articles_Id)
		throws PortalException;

	/**
	 * Returns a range of all the news letter_ articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of news letter_ articleses
	 * @param end the upper bound of the range of news letter_ articleses (not inclusive)
	 * @return the range of news letter_ articleses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NewsLetter_Articles> getNewsLetter_Articleses(
		int start, int end);

	/**
	 * Returns the number of news letter_ articleses.
	 *
	 * @return the number of news letter_ articleses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getNewsLetter_ArticlesesCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public NewsLetter_Articles updateNewsLetter_Articles(
			long newsletter_articles_Id, long newsletterId, long articlesId,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the news letter_ articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 * @return the news letter_ articles that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NewsLetter_Articles updateNewsLetter_Articles(
		NewsLetter_Articles newsLetter_Articles);

}