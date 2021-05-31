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
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.newsletter.model.NewslettersArticles;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for NewslettersArticles. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface NewslettersArticlesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewslettersArticlesLocalServiceUtil} to access the newsletters articles local service. Add custom service methods to <code>com.liferay.training.newsletter.service.impl.NewslettersArticlesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public NewslettersArticles addNewslettersArticles(
			int issueNumber, String title, String content, long userId)
		throws PortalException;

	/**
	 * Adds the newsletters articles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NewslettersArticles addNewslettersArticles(
		NewslettersArticles newslettersArticles);

	/**
	 * Creates a new newsletters articles with the primary key. Does not add the newsletters articles to the database.
	 *
	 * @param newslettersArticlesId the primary key for the new newsletters articles
	 * @return the new newsletters articles
	 */
	@Transactional(enabled = false)
	public NewslettersArticles createNewslettersArticles(
		long newslettersArticlesId);

	/**
	 * Deletes the newsletters articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles that was removed
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public NewslettersArticles deleteNewslettersArticles(
			long newslettersArticlesId)
		throws PortalException;

	/**
	 * Deletes the newsletters articles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public NewslettersArticles deleteNewslettersArticles(
		NewslettersArticles newslettersArticles);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
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
	public NewslettersArticles fetchNewslettersArticles(
		long newslettersArticlesId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NewslettersArticles> getNewslettersArticles();

	/**
	 * Returns the newsletters articles with the primary key.
	 *
	 * @param newslettersArticlesId the primary key of the newsletters articles
	 * @return the newsletters articles
	 * @throws PortalException if a newsletters articles with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NewslettersArticles getNewslettersArticles(
			long newslettersArticlesId)
		throws PortalException;

	/**
	 * Returns a range of all the newsletters articleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.newsletter.model.impl.NewslettersArticlesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletters articleses
	 * @param end the upper bound of the range of newsletters articleses (not inclusive)
	 * @return the range of newsletters articleses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NewslettersArticles> getNewslettersArticleses(
		int start, int end);

	/**
	 * Returns the number of newsletters articleses.
	 *
	 * @return the number of newsletters articleses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getNewslettersArticlesesCount();

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

	public NewslettersArticles updateNewslettersArticles(
			long newsletterArticlesId, int issueNumber, String title,
			String content)
		throws PortalException;

	/**
	 * Updates the newsletters articles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersArticles the newsletters articles
	 * @return the newsletters articles that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NewslettersArticles updateNewslettersArticles(
		NewslettersArticles newslettersArticles);

}