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
import com.liferay.training.newsletter.exception.NoSuchNewsletterException;
import com.liferay.training.newsletter.model.Newsletter;
import com.liferay.training.newsletter.model.impl.NewsletterImpl;
import com.liferay.training.newsletter.model.impl.NewsletterModelImpl;
import com.liferay.training.newsletter.service.persistence.NewsletterPersistence;
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
 * The persistence implementation for the newsletter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NewsletterPersistence.class)
public class NewsletterPersistenceImpl
	extends BasePersistenceImpl<Newsletter> implements NewsletterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewsletterUtil</code> to access the newsletter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewsletterImpl.class.getName();

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
	 * Returns all the newsletters where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the matching newsletters
	 */
	@Override
	public List<Newsletter> findByResourcePrimKey(long resourcePrimKey) {
		return findByResourcePrimKey(
			resourcePrimKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end) {

		return findByResourcePrimKey(resourcePrimKey, start, end, null);
	}

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
	@Override
	public List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		OrderByComparator<Newsletter> orderByComparator) {

		return findByResourcePrimKey(
			resourcePrimKey, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Newsletter> findByResourcePrimKey(
		long resourcePrimKey, int start, int end,
		OrderByComparator<Newsletter> orderByComparator,
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

		List<Newsletter> list = null;

		if (useFinderCache) {
			list = (List<Newsletter>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Newsletter newsletter : list) {
					if (resourcePrimKey != newsletter.getResourcePrimKey()) {
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

			sb.append(_SQL_SELECT_NEWSLETTER_WHERE);

			sb.append(_FINDER_COLUMN_RESOURCEPRIMKEY_RESOURCEPRIMKEY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NewsletterModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(resourcePrimKey);

				list = (List<Newsletter>)QueryUtil.list(
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
	 * Returns the first newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter
	 * @throws NoSuchNewsletterException if a matching newsletter could not be found
	 */
	@Override
	public Newsletter findByResourcePrimKey_First(
			long resourcePrimKey,
			OrderByComparator<Newsletter> orderByComparator)
		throws NoSuchNewsletterException {

		Newsletter newsletter = fetchByResourcePrimKey_First(
			resourcePrimKey, orderByComparator);

		if (newsletter != null) {
			return newsletter;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("resourcePrimKey=");
		sb.append(resourcePrimKey);

		sb.append("}");

		throw new NoSuchNewsletterException(sb.toString());
	}

	/**
	 * Returns the first newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching newsletter, or <code>null</code> if a matching newsletter could not be found
	 */
	@Override
	public Newsletter fetchByResourcePrimKey_First(
		long resourcePrimKey, OrderByComparator<Newsletter> orderByComparator) {

		List<Newsletter> list = findByResourcePrimKey(
			resourcePrimKey, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter
	 * @throws NoSuchNewsletterException if a matching newsletter could not be found
	 */
	@Override
	public Newsletter findByResourcePrimKey_Last(
			long resourcePrimKey,
			OrderByComparator<Newsletter> orderByComparator)
		throws NoSuchNewsletterException {

		Newsletter newsletter = fetchByResourcePrimKey_Last(
			resourcePrimKey, orderByComparator);

		if (newsletter != null) {
			return newsletter;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("resourcePrimKey=");
		sb.append(resourcePrimKey);

		sb.append("}");

		throw new NoSuchNewsletterException(sb.toString());
	}

	/**
	 * Returns the last newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching newsletter, or <code>null</code> if a matching newsletter could not be found
	 */
	@Override
	public Newsletter fetchByResourcePrimKey_Last(
		long resourcePrimKey, OrderByComparator<Newsletter> orderByComparator) {

		int count = countByResourcePrimKey(resourcePrimKey);

		if (count == 0) {
			return null;
		}

		List<Newsletter> list = findByResourcePrimKey(
			resourcePrimKey, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the newsletters before and after the current newsletter in the ordered set where resourcePrimKey = &#63;.
	 *
	 * @param newsletterId the primary key of the current newsletter
	 * @param resourcePrimKey the resource prim key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next newsletter
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter[] findByResourcePrimKey_PrevAndNext(
			long newsletterId, long resourcePrimKey,
			OrderByComparator<Newsletter> orderByComparator)
		throws NoSuchNewsletterException {

		Newsletter newsletter = findByPrimaryKey(newsletterId);

		Session session = null;

		try {
			session = openSession();

			Newsletter[] array = new NewsletterImpl[3];

			array[0] = getByResourcePrimKey_PrevAndNext(
				session, newsletter, resourcePrimKey, orderByComparator, true);

			array[1] = newsletter;

			array[2] = getByResourcePrimKey_PrevAndNext(
				session, newsletter, resourcePrimKey, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Newsletter getByResourcePrimKey_PrevAndNext(
		Session session, Newsletter newsletter, long resourcePrimKey,
		OrderByComparator<Newsletter> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NEWSLETTER_WHERE);

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
			sb.append(NewsletterModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(resourcePrimKey);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(newsletter)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Newsletter> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the newsletters where resourcePrimKey = &#63; from the database.
	 *
	 * @param resourcePrimKey the resource prim key
	 */
	@Override
	public void removeByResourcePrimKey(long resourcePrimKey) {
		for (Newsletter newsletter :
				findByResourcePrimKey(
					resourcePrimKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(newsletter);
		}
	}

	/**
	 * Returns the number of newsletters where resourcePrimKey = &#63;.
	 *
	 * @param resourcePrimKey the resource prim key
	 * @return the number of matching newsletters
	 */
	@Override
	public int countByResourcePrimKey(long resourcePrimKey) {
		FinderPath finderPath = _finderPathCountByResourcePrimKey;

		Object[] finderArgs = new Object[] {resourcePrimKey};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NEWSLETTER_WHERE);

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
			"newsletter.resourcePrimKey = ?";

	public NewsletterPersistenceImpl() {
		setModelClass(Newsletter.class);

		setModelImplClass(NewsletterImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the newsletter in the entity cache if it is enabled.
	 *
	 * @param newsletter the newsletter
	 */
	@Override
	public void cacheResult(Newsletter newsletter) {
		entityCache.putResult(
			entityCacheEnabled, NewsletterImpl.class,
			newsletter.getPrimaryKey(), newsletter);

		newsletter.resetOriginalValues();
	}

	/**
	 * Caches the newsletters in the entity cache if it is enabled.
	 *
	 * @param newsletters the newsletters
	 */
	@Override
	public void cacheResult(List<Newsletter> newsletters) {
		for (Newsletter newsletter : newsletters) {
			if (entityCache.getResult(
					entityCacheEnabled, NewsletterImpl.class,
					newsletter.getPrimaryKey()) == null) {

				cacheResult(newsletter);
			}
			else {
				newsletter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all newsletters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsletterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the newsletter.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Newsletter newsletter) {
		entityCache.removeResult(
			entityCacheEnabled, NewsletterImpl.class,
			newsletter.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Newsletter> newsletters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Newsletter newsletter : newsletters) {
			entityCache.removeResult(
				entityCacheEnabled, NewsletterImpl.class,
				newsletter.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, NewsletterImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new newsletter with the primary key. Does not add the newsletter to the database.
	 *
	 * @param newsletterId the primary key for the new newsletter
	 * @return the new newsletter
	 */
	@Override
	public Newsletter create(long newsletterId) {
		Newsletter newsletter = new NewsletterImpl();

		newsletter.setNew(true);
		newsletter.setPrimaryKey(newsletterId);

		newsletter.setCompanyId(CompanyThreadLocal.getCompanyId());

		return newsletter;
	}

	/**
	 * Removes the newsletter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter that was removed
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter remove(long newsletterId)
		throws NoSuchNewsletterException {

		return remove((Serializable)newsletterId);
	}

	/**
	 * Removes the newsletter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the newsletter
	 * @return the newsletter that was removed
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter remove(Serializable primaryKey)
		throws NoSuchNewsletterException {

		Session session = null;

		try {
			session = openSession();

			Newsletter newsletter = (Newsletter)session.get(
				NewsletterImpl.class, primaryKey);

			if (newsletter == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsletterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsletter);
		}
		catch (NoSuchNewsletterException noSuchEntityException) {
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
	protected Newsletter removeImpl(Newsletter newsletter) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsletter)) {
				newsletter = (Newsletter)session.get(
					NewsletterImpl.class, newsletter.getPrimaryKeyObj());
			}

			if (newsletter != null) {
				session.delete(newsletter);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsletter != null) {
			clearCache(newsletter);
		}

		return newsletter;
	}

	@Override
	public Newsletter updateImpl(Newsletter newsletter) {
		boolean isNew = newsletter.isNew();

		if (!(newsletter instanceof NewsletterModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(newsletter.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(newsletter);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in newsletter proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Newsletter implementation " +
					newsletter.getClass());
		}

		NewsletterModelImpl newsletterModelImpl =
			(NewsletterModelImpl)newsletter;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (newsletter.getCreateDate() == null)) {
			if (serviceContext == null) {
				newsletter.setCreateDate(now);
			}
			else {
				newsletter.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!newsletterModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				newsletter.setModifiedDate(now);
			}
			else {
				newsletter.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (newsletter.isNew()) {
				session.save(newsletter);

				newsletter.setNew(false);
			}
			else {
				newsletter = (Newsletter)session.merge(newsletter);
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
				newsletterModelImpl.getResourcePrimKey()
			};

			finderCache.removeResult(_finderPathCountByResourcePrimKey, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByResourcePrimKey, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((newsletterModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByResourcePrimKey.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					newsletterModelImpl.getOriginalResourcePrimKey()
				};

				finderCache.removeResult(
					_finderPathCountByResourcePrimKey, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResourcePrimKey, args);

				args = new Object[] {newsletterModelImpl.getResourcePrimKey()};

				finderCache.removeResult(
					_finderPathCountByResourcePrimKey, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResourcePrimKey, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, NewsletterImpl.class,
			newsletter.getPrimaryKey(), newsletter, false);

		newsletter.resetOriginalValues();

		return newsletter;
	}

	/**
	 * Returns the newsletter with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the newsletter
	 * @return the newsletter
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsletterException {

		Newsletter newsletter = fetchByPrimaryKey(primaryKey);

		if (newsletter == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsletterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsletter;
	}

	/**
	 * Returns the newsletter with the primary key or throws a <code>NoSuchNewsletterException</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter
	 * @throws NoSuchNewsletterException if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter findByPrimaryKey(long newsletterId)
		throws NoSuchNewsletterException {

		return findByPrimaryKey((Serializable)newsletterId);
	}

	/**
	 * Returns the newsletter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the newsletter
	 * @return the newsletter, or <code>null</code> if a newsletter with the primary key could not be found
	 */
	@Override
	public Newsletter fetchByPrimaryKey(long newsletterId) {
		return fetchByPrimaryKey((Serializable)newsletterId);
	}

	/**
	 * Returns all the newsletters.
	 *
	 * @return the newsletters
	 */
	@Override
	public List<Newsletter> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Newsletter> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Newsletter> findAll(
		int start, int end, OrderByComparator<Newsletter> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Newsletter> findAll(
		int start, int end, OrderByComparator<Newsletter> orderByComparator,
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

		List<Newsletter> list = null;

		if (useFinderCache) {
			list = (List<Newsletter>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEWSLETTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSLETTER;

				sql = sql.concat(NewsletterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Newsletter>)QueryUtil.list(
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
	 * Removes all the newsletters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Newsletter newsletter : findAll()) {
			remove(newsletter);
		}
	}

	/**
	 * Returns the number of newsletters.
	 *
	 * @return the number of newsletters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NEWSLETTER);

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
		return "newsletterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEWSLETTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewsletterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the newsletter persistence.
	 */
	@Activate
	public void activate() {
		NewsletterModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		NewsletterModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByResourcePrimKey",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsletterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResourcePrimKey",
			new String[] {Long.class.getName()},
			NewsletterModelImpl.RESOURCEPRIMKEY_COLUMN_BITMASK);

		_finderPathCountByResourcePrimKey = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByResourcePrimKey",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NewsletterImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.liferay.training.newsletter.model.Newsletter"),
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

	private static final String _SQL_SELECT_NEWSLETTER =
		"SELECT newsletter FROM Newsletter newsletter";

	private static final String _SQL_SELECT_NEWSLETTER_WHERE =
		"SELECT newsletter FROM Newsletter newsletter WHERE ";

	private static final String _SQL_COUNT_NEWSLETTER =
		"SELECT COUNT(newsletter) FROM Newsletter newsletter";

	private static final String _SQL_COUNT_NEWSLETTER_WHERE =
		"SELECT COUNT(newsletter) FROM Newsletter newsletter WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsletter.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Newsletter exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Newsletter exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NewsletterPersistenceImpl.class);

	static {
		try {
			Class.forName(NEWSLETTERPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}