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
import com.liferay.training.newsletter.exception.NoSuchNewslettersException;
import com.liferay.training.newsletter.model.Newsletters;
import com.liferay.training.newsletter.model.impl.NewslettersImpl;
import com.liferay.training.newsletter.model.impl.NewslettersModelImpl;
import com.liferay.training.newsletter.service.persistence.NewslettersPersistence;
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
 * The persistence implementation for the newsletters service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NewslettersPersistence.class)
public class NewslettersPersistenceImpl
	extends BasePersistenceImpl<Newsletters> implements NewslettersPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewslettersUtil</code> to access the newsletters persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewslettersImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public NewslettersPersistenceImpl() {
		setModelClass(Newsletters.class);

		setModelImplClass(NewslettersImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the newsletters in the entity cache if it is enabled.
	 *
	 * @param newsletters the newsletters
	 */
	@Override
	public void cacheResult(Newsletters newsletters) {
		entityCache.putResult(
			entityCacheEnabled, NewslettersImpl.class,
			newsletters.getPrimaryKey(), newsletters);

		newsletters.resetOriginalValues();
	}

	/**
	 * Caches the newsletterses in the entity cache if it is enabled.
	 *
	 * @param newsletterses the newsletterses
	 */
	@Override
	public void cacheResult(List<Newsletters> newsletterses) {
		for (Newsletters newsletters : newsletterses) {
			if (entityCache.getResult(
					entityCacheEnabled, NewslettersImpl.class,
					newsletters.getPrimaryKey()) == null) {

				cacheResult(newsletters);
			}
			else {
				newsletters.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all newsletterses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewslettersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the newsletters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Newsletters newsletters) {
		entityCache.removeResult(
			entityCacheEnabled, NewslettersImpl.class,
			newsletters.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Newsletters> newsletterses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Newsletters newsletters : newsletterses) {
			entityCache.removeResult(
				entityCacheEnabled, NewslettersImpl.class,
				newsletters.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, NewslettersImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new newsletters with the primary key. Does not add the newsletters to the database.
	 *
	 * @param newslettersId the primary key for the new newsletters
	 * @return the new newsletters
	 */
	@Override
	public Newsletters create(long newslettersId) {
		Newsletters newsletters = new NewslettersImpl();

		newsletters.setNew(true);
		newsletters.setPrimaryKey(newslettersId);

		newsletters.setCompanyId(CompanyThreadLocal.getCompanyId());

		return newsletters;
	}

	/**
	 * Removes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	@Override
	public Newsletters remove(long newslettersId)
		throws NoSuchNewslettersException {

		return remove((Serializable)newslettersId);
	}

	/**
	 * Removes the newsletters with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the newsletters
	 * @return the newsletters that was removed
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	@Override
	public Newsletters remove(Serializable primaryKey)
		throws NoSuchNewslettersException {

		Session session = null;

		try {
			session = openSession();

			Newsletters newsletters = (Newsletters)session.get(
				NewslettersImpl.class, primaryKey);

			if (newsletters == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewslettersException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsletters);
		}
		catch (NoSuchNewslettersException noSuchEntityException) {
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
	protected Newsletters removeImpl(Newsletters newsletters) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsletters)) {
				newsletters = (Newsletters)session.get(
					NewslettersImpl.class, newsletters.getPrimaryKeyObj());
			}

			if (newsletters != null) {
				session.delete(newsletters);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsletters != null) {
			clearCache(newsletters);
		}

		return newsletters;
	}

	@Override
	public Newsletters updateImpl(Newsletters newsletters) {
		boolean isNew = newsletters.isNew();

		if (!(newsletters instanceof NewslettersModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(newsletters.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(newsletters);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in newsletters proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Newsletters implementation " +
					newsletters.getClass());
		}

		NewslettersModelImpl newslettersModelImpl =
			(NewslettersModelImpl)newsletters;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (newsletters.getCreateDate() == null)) {
			if (serviceContext == null) {
				newsletters.setCreateDate(now);
			}
			else {
				newsletters.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!newslettersModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				newsletters.setModifiedDate(now);
			}
			else {
				newsletters.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (newsletters.isNew()) {
				session.save(newsletters);

				newsletters.setNew(false);
			}
			else {
				newsletters = (Newsletters)session.merge(newsletters);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, NewslettersImpl.class,
			newsletters.getPrimaryKey(), newsletters, false);

		newsletters.resetOriginalValues();

		return newsletters;
	}

	/**
	 * Returns the newsletters with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the newsletters
	 * @return the newsletters
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	@Override
	public Newsletters findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewslettersException {

		Newsletters newsletters = fetchByPrimaryKey(primaryKey);

		if (newsletters == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewslettersException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsletters;
	}

	/**
	 * Returns the newsletters with the primary key or throws a <code>NoSuchNewslettersException</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters
	 * @throws NoSuchNewslettersException if a newsletters with the primary key could not be found
	 */
	@Override
	public Newsletters findByPrimaryKey(long newslettersId)
		throws NoSuchNewslettersException {

		return findByPrimaryKey((Serializable)newslettersId);
	}

	/**
	 * Returns the newsletters with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newslettersId the primary key of the newsletters
	 * @return the newsletters, or <code>null</code> if a newsletters with the primary key could not be found
	 */
	@Override
	public Newsletters fetchByPrimaryKey(long newslettersId) {
		return fetchByPrimaryKey((Serializable)newslettersId);
	}

	/**
	 * Returns all the newsletterses.
	 *
	 * @return the newsletterses
	 */
	@Override
	public List<Newsletters> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Newsletters> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Newsletters> findAll(
		int start, int end, OrderByComparator<Newsletters> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Newsletters> findAll(
		int start, int end, OrderByComparator<Newsletters> orderByComparator,
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

		List<Newsletters> list = null;

		if (useFinderCache) {
			list = (List<Newsletters>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEWSLETTERS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSLETTERS;

				sql = sql.concat(NewslettersModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Newsletters>)QueryUtil.list(
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
	 * Removes all the newsletterses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Newsletters newsletters : findAll()) {
			remove(newsletters);
		}
	}

	/**
	 * Returns the number of newsletterses.
	 *
	 * @return the number of newsletterses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NEWSLETTERS);

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
		return "newslettersId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEWSLETTERS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewslettersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the newsletters persistence.
	 */
	@Activate
	public void activate() {
		NewslettersModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		NewslettersModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewslettersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewslettersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NewslettersImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.liferay.training.newsletter.model.Newsletters"),
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

	private static final String _SQL_SELECT_NEWSLETTERS =
		"SELECT newsletters FROM Newsletters newsletters";

	private static final String _SQL_COUNT_NEWSLETTERS =
		"SELECT COUNT(newsletters) FROM Newsletters newsletters";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsletters.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Newsletters exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		NewslettersPersistenceImpl.class);

	static {
		try {
			Class.forName(NEWSLETTERPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}