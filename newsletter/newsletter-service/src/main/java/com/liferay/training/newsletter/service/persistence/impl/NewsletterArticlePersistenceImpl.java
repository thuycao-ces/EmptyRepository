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

package com.liferay.training.newsletter.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.newsletter.exception.NoSuchNewsletterArticleException;
import com.liferay.training.newsletter.model.NewsletterArticle;
import com.liferay.training.newsletter.model.impl.NewsletterArticleImpl;
import com.liferay.training.newsletter.model.impl.NewsletterArticleModelImpl;
import com.liferay.training.newsletter.service.persistence.NewsletterArticlePersistence;
import com.liferay.training.newsletter.service.persistence.impl.constants.NEWSLETTERPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the newsletter article service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NewsletterArticlePersistence.class)
public class NewsletterArticlePersistenceImpl
	extends BasePersistenceImpl<NewsletterArticle>
	implements NewsletterArticlePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewsletterArticleUtil</code> to access the newsletter article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewsletterArticleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByResourcePrimKey;
	private FinderPath _finderPathWithoutPaginationFindByResourcePrimKey;
	private FinderPath _finderPathCountByResourcePrimKey;

	/**
	 * Returns all the newsletter articles where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the matching newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findByResourcePrimKey(long resourcePrimKey) {
		return findByResourcePrimKey(
			resourcePrimKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the newsletter articles where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @return the range of matching newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findByResourcePrimKey(
		long resourcePrimKey, int start, int end) {

		return findByResourcePrimKey(resourcePrimKey, start, end, null);
	}

	/**
	 * Returns an ordered range of all the newsletter articles where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		OrderByComparator<NewsletterArticle> orderByComparator) {

		return findByResourcePrimKey(
			resourcePrimKey, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the newsletter articles where resourcePrimKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		OrderByComparator<NewsletterArticle> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByResourcePrimKey;
				finderArgs = new Object[] {resourcePrimKey};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByResourcePrimKey;
			finderArgs = new Object[] {
				resourcePrimKey, start, end, orderByComparator
			};
		}

		List<NewsletterArticle> list = null;

		if (useFinderCache) {
			list = (List<NewsletterArticle>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NewsletterArticle newsletterArticle : list) {
					if (resourcePrimKey !=
							newsletterArticle.getResourcePrimKey()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_NEWSLETTERARTICLE_WHERE);

			sb.append(_FINDER_COLUMN_RESOURCEPRIMKEY_RESOURCEPRIMKEY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NewsletterArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(resourcePrimKey);

				list = (List<NewsletterArticle>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first newsletter article in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter article
	 * @throws NoSuchNewsletterArticleException if a matching newsletter article could not be found
	 */
	@Override
	public NewsletterArticle findByResourcePrimKey_First(
			long resourcePrimKey,
			OrderByComparator<NewsletterArticle> orderByComparator)
		throws NoSuchNewsletterArticleException {

		NewsletterArticle newsletterArticle = fetchByResourcePrimKey_First(
			resourcePrimKey, orderByComparator);

		if (newsletterArticle != null) {
			return newsletterArticle;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("resourcePrimKey=");
		sb.append(resourcePrimKey);

		sb.append("}");

		throw new NoSuchNewsletterArticleException(sb.toString());
	}

	/**
	 * Returns the first newsletter article in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter article, or <code>null</code> if a matching newsletter article could not be found
	 */
	@Override
	public NewsletterArticle fetchByResourcePrimKey_First(
		long resourcePrimKey,
		OrderByComparator<NewsletterArticle> orderByComparator) {

		List<NewsletterArticle> list = findByResourcePrimKey(
			resourcePrimKey, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last newsletter article in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter article
	 * @throws NoSuchNewsletterArticleException if a matching newsletter article could not be found
	 */
	@Override
	public NewsletterArticle findByResourcePrimKey_Last(
			long resourcePrimKey,
			OrderByComparator<NewsletterArticle> orderByComparator)
		throws NoSuchNewsletterArticleException {

		NewsletterArticle newsletterArticle = fetchByResourcePrimKey_Last(
			resourcePrimKey, orderByComparator);

		if (newsletterArticle != null) {
			return newsletterArticle;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("resourcePrimKey=");
		sb.append(resourcePrimKey);

		sb.append("}");

		throw new NoSuchNewsletterArticleException(sb.toString());
	}

	/**
	 * Returns the last newsletter article in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter article, or <code>null</code> if a matching newsletter article could not be found
	 */
	@Override
	public NewsletterArticle fetchByResourcePrimKey_Last(
		long resourcePrimKey,
		OrderByComparator<NewsletterArticle> orderByComparator) {

		int count = countByResourcePrimKey(resourcePrimKey);

		if (count == 0) {
			return null;
		}

		List<NewsletterArticle> list = findByResourcePrimKey(
			resourcePrimKey, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the newsletter articles before and after the current newsletter article in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param newsletterArticleId the primary key of the current newsletter article
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next newsletter article
	 * @throws NoSuchNewsletterArticleException if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle[] findByResourcePrimKey_PrevAndNext(
			long newsletterArticleId, long resourcePrimKey,
			OrderByComparator<NewsletterArticle> orderByComparator)
		throws NoSuchNewsletterArticleException {

		NewsletterArticle newsletterArticle = findByPrimaryKey(
			newsletterArticleId);

		Session session = null;

		try {
			session = openSession();

			NewsletterArticle[] array = new NewsletterArticleImpl[3];

			array[0] = getByResourcePrimKey_PrevAndNext(
				session, newsletterArticle, resourcePrimKey, orderByComparator,
				true);

			array[1] = newsletterArticle;

			array[2] = getByResourcePrimKey_PrevAndNext(
				session, newsletterArticle, resourcePrimKey, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NewsletterArticle getByResourcePrimKey_PrevAndNext(
		Session session, NewsletterArticle newsletterArticle,
		long resourcePrimKey,
		OrderByComparator<NewsletterArticle> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NEWSLETTERARTICLE_WHERE);

		sb.append(_FINDER_COLUMN_RESOURCEPRIMKEY_RESOURCEPRIMKEY_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(NewsletterArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(resourcePrimKey);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						newsletterArticle)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NewsletterArticle> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the newsletter articles where resourcePrimKey = &#63; from the database.
	 *
	 * @param resourcePrimKey the resource prim key
	 */
	@Override
	public void removeByResourcePrimKey(long resourcePrimKey) {
		for (NewsletterArticle newsletterArticle :
				findByResourcePrimKey(
					resourcePrimKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(newsletterArticle);
		}
	}

	/**
	 * Returns the number of newsletter articles where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the number of matching newsletter articles
	 */
	@Override
	public int countByResourcePrimKey(long resourcePrimKey) {
		FinderPath finderPath = _finderPathCountByResourcePrimKey;

		Object[] finderArgs = new Object[] {resourcePrimKey};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NEWSLETTERARTICLE_WHERE);

			sb.append(_FINDER_COLUMN_RESOURCEPRIMKEY_RESOURCEPRIMKEY_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(resourcePrimKey);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_RESOURCEPRIMKEY_RESOURCEPRIMKEY_2 =
			"newsletterArticle.resourcePrimKey = ?";

	public NewsletterArticlePersistenceImpl() {
		setModelClass(NewsletterArticle.class);

		setModelImplClass(NewsletterArticleImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the newsletter article in the entity cache if it is enabled.
	 *
	 * @param newsletterArticle the newsletter article
	 */
	@Override
	public void cacheResult(NewsletterArticle newsletterArticle) {
		entityCache.putResult(
			entityCacheEnabled, NewsletterArticleImpl.class,
			newsletterArticle.getPrimaryKey(), newsletterArticle);

		newsletterArticle.resetOriginalValues();
	}

	/**
	 * Caches the newsletter articles in the entity cache if it is enabled.
	 *
	 * @param newsletterArticles the newsletter articles
	 */
	@Override
	public void cacheResult(List<NewsletterArticle> newsletterArticles) {
		for (NewsletterArticle newsletterArticle : newsletterArticles) {
			if (entityCache.getResult(
					entityCacheEnabled, NewsletterArticleImpl.class,
					newsletterArticle.getPrimaryKey()) == null) {

				cacheResult(newsletterArticle);
			}
			else {
				newsletterArticle.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all newsletter articles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsletterArticleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the newsletter article.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewsletterArticle newsletterArticle) {
		entityCache.removeResult(
			entityCacheEnabled, NewsletterArticleImpl.class,
			newsletterArticle.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NewsletterArticle> newsletterArticles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewsletterArticle newsletterArticle : newsletterArticles) {
			entityCache.removeResult(
				entityCacheEnabled, NewsletterArticleImpl.class,
				newsletterArticle.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, NewsletterArticleImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new newsletter article with the primary key. Does not add the newsletter article to the database.
	 *
	 * @param newsletterArticleId the primary key for the new newsletter article
	 * @return the new newsletter article
	 */
	@Override
	public NewsletterArticle create(long newsletterArticleId) {
		NewsletterArticle newsletterArticle = new NewsletterArticleImpl();

		newsletterArticle.setNew(true);
		newsletterArticle.setPrimaryKey(newsletterArticleId);

		newsletterArticle.setCompanyId(CompanyThreadLocal.getCompanyId());

		return newsletterArticle;
	}

	/**
	 * Removes the newsletter article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterArticleId the primary key of the newsletter article
	 * @return the newsletter article that was removed
	 * @throws NoSuchNewsletterArticleException if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle remove(long newsletterArticleId)
		throws NoSuchNewsletterArticleException {

		return remove((Serializable)newsletterArticleId);
	}

	/**
	 * Removes the newsletter article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the newsletter article
	 * @return the newsletter article that was removed
	 * @throws NoSuchNewsletterArticleException if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle remove(Serializable primaryKey)
		throws NoSuchNewsletterArticleException {

		Session session = null;

		try {
			session = openSession();

			NewsletterArticle newsletterArticle =
				(NewsletterArticle)session.get(
					NewsletterArticleImpl.class, primaryKey);

			if (newsletterArticle == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsletterArticleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsletterArticle);
		}
		catch (NoSuchNewsletterArticleException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NewsletterArticle removeImpl(
		NewsletterArticle newsletterArticle) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsletterArticle)) {
				newsletterArticle = (NewsletterArticle)session.get(
					NewsletterArticleImpl.class,
					newsletterArticle.getPrimaryKeyObj());
			}

			if (newsletterArticle != null) {
				session.delete(newsletterArticle);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsletterArticle != null) {
			clearCache(newsletterArticle);
		}

		return newsletterArticle;
	}

	@Override
	public NewsletterArticle updateImpl(NewsletterArticle newsletterArticle) {
		boolean isNew = newsletterArticle.isNew();

		if (!(newsletterArticle instanceof NewsletterArticleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(newsletterArticle.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					newsletterArticle);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in newsletterArticle proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NewsletterArticle implementation " +
					newsletterArticle.getClass());
		}

		NewsletterArticleModelImpl newsletterArticleModelImpl =
			(NewsletterArticleModelImpl)newsletterArticle;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (newsletterArticle.getCreateDate() == null)) {
			if (serviceContext == null) {
				newsletterArticle.setCreateDate(now);
			}
			else {
				newsletterArticle.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!newsletterArticleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				newsletterArticle.setModifiedDate(now);
			}
			else {
				newsletterArticle.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (newsletterArticle.isNew()) {
				session.save(newsletterArticle);

				newsletterArticle.setNew(false);
			}
			else {
				newsletterArticle = (NewsletterArticle)session.merge(
					newsletterArticle);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				newsletterArticleModelImpl.getResourcePrimKey()
			};

			finderCache.removeResult(_finderPathCountByResourcePrimKey, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByResourcePrimKey, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((newsletterArticleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByResourcePrimKey.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					newsletterArticleModelImpl.getOriginalResourcePrimKey()
				};

				finderCache.removeResult(
					_finderPathCountByResourcePrimKey, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResourcePrimKey, args);

				args = new Object[] {
					newsletterArticleModelImpl.getResourcePrimKey()
				};

				finderCache.removeResult(
					_finderPathCountByResourcePrimKey, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResourcePrimKey, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, NewsletterArticleImpl.class,
			newsletterArticle.getPrimaryKey(), newsletterArticle, false);

		newsletterArticle.resetOriginalValues();

		return newsletterArticle;
	}

	/**
	 * Returns the newsletter article with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the newsletter article
	 * @return the newsletter article
	 * @throws NoSuchNewsletterArticleException if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsletterArticleException {

		NewsletterArticle newsletterArticle = fetchByPrimaryKey(primaryKey);

		if (newsletterArticle == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsletterArticleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsletterArticle;
	}

	/**
	 * Returns the newsletter article with the primary key or throws a <code>NoSuchNewsletterArticleException</code> if it could not be found.
	 *
	 * @param newsletterArticleId the primary key of the newsletter article
	 * @return the newsletter article
	 * @throws NoSuchNewsletterArticleException if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle findByPrimaryKey(long newsletterArticleId)
		throws NoSuchNewsletterArticleException {

		return findByPrimaryKey((Serializable)newsletterArticleId);
	}

	/**
	 * Returns the newsletter article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterArticleId the primary key of the newsletter article
	 * @return the newsletter article, or <code>null</code> if a newsletter article with the primary key could not be found
	 */
	@Override
	public NewsletterArticle fetchByPrimaryKey(long newsletterArticleId) {
		return fetchByPrimaryKey((Serializable)newsletterArticleId);
	}

	/**
	 * Returns all the newsletter articles.
	 *
	 * @return the newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the newsletter articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @return the range of newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the newsletter articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findAll(
		int start, int end,
		OrderByComparator<NewsletterArticle> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the newsletter articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NewsletterArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of newsletter articles
	 * @param end the upper bound of the range of newsletter articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of newsletter articles
	 */
	@Override
	public List<NewsletterArticle> findAll(
		int start, int end,
		OrderByComparator<NewsletterArticle> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<NewsletterArticle> list = null;

		if (useFinderCache) {
			list = (List<NewsletterArticle>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEWSLETTERARTICLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSLETTERARTICLE;

				sql = sql.concat(NewsletterArticleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NewsletterArticle>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the newsletter articles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NewsletterArticle newsletterArticle : findAll()) {
			remove(newsletterArticle);
		}
	}

	/**
	 * Returns the number of newsletter articles.
	 *
	 * @return the number of newsletter articles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NEWSLETTERARTICLE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "newsletterArticleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEWSLETTERARTICLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewsletterArticleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the newsletter article persistence.
	 */
	@Activate
	public void activate() {
		NewsletterArticleModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		NewsletterArticleModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByResourcePrimKey",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResourcePrimKey",
			new String[] {Long.class.getName()},
			NewsletterArticleModelImpl.RESOURCEPRIMKEY_COLUMN_BITMASK);

		_finderPathCountByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByResourcePrimKey",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NewsletterArticleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = NEWSLETTERPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.training.newsletter.model.NewsletterArticle"),
			true);
	}

	@Override
	@Reference(
		target = NEWSLETTERPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NEWSLETTERPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NEWSLETTERARTICLE =
		"SELECT newsletterArticle FROM NewsletterArticle newsletterArticle";

	private static final String _SQL_SELECT_NEWSLETTERARTICLE_WHERE =
		"SELECT newsletterArticle FROM NewsletterArticle newsletterArticle WHERE ";

	private static final String _SQL_COUNT_NEWSLETTERARTICLE =
		"SELECT COUNT(newsletterArticle) FROM NewsletterArticle newsletterArticle";

	private static final String _SQL_COUNT_NEWSLETTERARTICLE_WHERE =
		"SELECT COUNT(newsletterArticle) FROM NewsletterArticle newsletterArticle WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsletterArticle.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NewsletterArticle exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NewsletterArticle exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NewsletterArticlePersistenceImpl.class);

	static {
		try {
			Class.forName(NEWSLETTERPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}