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

package com.liferay.training.news.letter.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.news.letter.exception.NoSuchNewsLetterException;
import com.liferay.training.news.letter.model.NewsLetter;
import com.liferay.training.news.letter.model.impl.NewsLetterImpl;
import com.liferay.training.news.letter.model.impl.NewsLetterModelImpl;
import com.liferay.training.news.letter.service.persistence.NewsLetterPersistence;
import com.liferay.training.news.letter.service.persistence.impl.constants.NEWSLETTERPersistenceConstants;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the news letter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NewsLetterPersistence.class)
public class NewsLetterPersistenceImpl
	extends BasePersistenceImpl<NewsLetter> implements NewsLetterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewsLetterUtil</code> to access the news letter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewsLetterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public NewsLetterPersistenceImpl() {
		setModelClass(NewsLetter.class);

		setModelImplClass(NewsLetterImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the news letter in the entity cache if it is enabled.
	 *
	 * @param newsLetter the news letter
	 */
	@Override
	public void cacheResult(NewsLetter newsLetter) {
		entityCache.putResult(
			entityCacheEnabled, NewsLetterImpl.class,
			newsLetter.getPrimaryKey(), newsLetter);

		newsLetter.resetOriginalValues();
	}

	/**
	 * Caches the news letters in the entity cache if it is enabled.
	 *
	 * @param newsLetters the news letters
	 */
	@Override
	public void cacheResult(List<NewsLetter> newsLetters) {
		for (NewsLetter newsLetter : newsLetters) {
			if (entityCache.getResult(
					entityCacheEnabled, NewsLetterImpl.class,
					newsLetter.getPrimaryKey()) == null) {

				cacheResult(newsLetter);
			}
			else {
				newsLetter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all news letters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsLetterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the news letter.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewsLetter newsLetter) {
		entityCache.removeResult(
			entityCacheEnabled, NewsLetterImpl.class,
			newsLetter.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NewsLetter> newsLetters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewsLetter newsLetter : newsLetters) {
			entityCache.removeResult(
				entityCacheEnabled, NewsLetterImpl.class,
				newsLetter.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, NewsLetterImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new news letter with the primary key. Does not add the news letter to the database.
	 *
	 * @param newsletterId the primary key for the new news letter
	 * @return the new news letter
	 */
	@Override
	public NewsLetter create(long newsletterId) {
		NewsLetter newsLetter = new NewsLetterImpl();

		newsLetter.setNew(true);
		newsLetter.setPrimaryKey(newsletterId);

		newsLetter.setCompanyId(CompanyThreadLocal.getCompanyId());

		return newsLetter;
	}

	/**
	 * Removes the news letter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter that was removed
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	@Override
	public NewsLetter remove(long newsletterId)
		throws NoSuchNewsLetterException {

		return remove((Serializable)newsletterId);
	}

	/**
	 * Removes the news letter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the news letter
	 * @return the news letter that was removed
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	@Override
	public NewsLetter remove(Serializable primaryKey)
		throws NoSuchNewsLetterException {

		Session session = null;

		try {
			session = openSession();

			NewsLetter newsLetter = (NewsLetter)session.get(
				NewsLetterImpl.class, primaryKey);

			if (newsLetter == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsLetterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsLetter);
		}
		catch (NoSuchNewsLetterException noSuchEntityException) {
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
	protected NewsLetter removeImpl(NewsLetter newsLetter) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsLetter)) {
				newsLetter = (NewsLetter)session.get(
					NewsLetterImpl.class, newsLetter.getPrimaryKeyObj());
			}

			if (newsLetter != null) {
				session.delete(newsLetter);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsLetter != null) {
			clearCache(newsLetter);
		}

		return newsLetter;
	}

	@Override
	public NewsLetter updateImpl(NewsLetter newsLetter) {
		boolean isNew = newsLetter.isNew();

		Session session = null;

		try {
			session = openSession();

			if (newsLetter.isNew()) {
				session.save(newsLetter);

				newsLetter.setNew(false);
			}
			else {
				newsLetter = (NewsLetter)session.merge(newsLetter);
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
			entityCacheEnabled, NewsLetterImpl.class,
			newsLetter.getPrimaryKey(), newsLetter, false);

		newsLetter.resetOriginalValues();

		return newsLetter;
	}

	/**
	 * Returns the news letter with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the news letter
	 * @return the news letter
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	@Override
	public NewsLetter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsLetterException {

		NewsLetter newsLetter = fetchByPrimaryKey(primaryKey);

		if (newsLetter == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsLetterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsLetter;
	}

	/**
	 * Returns the news letter with the primary key or throws a <code>NoSuchNewsLetterException</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter
	 * @throws NoSuchNewsLetterException if a news letter with the primary key could not be found
	 */
	@Override
	public NewsLetter findByPrimaryKey(long newsletterId)
		throws NoSuchNewsLetterException {

		return findByPrimaryKey((Serializable)newsletterId);
	}

	/**
	 * Returns the news letter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletterId the primary key of the news letter
	 * @return the news letter, or <code>null</code> if a news letter with the primary key could not be found
	 */
	@Override
	public NewsLetter fetchByPrimaryKey(long newsletterId) {
		return fetchByPrimaryKey((Serializable)newsletterId);
	}

	/**
	 * Returns all the news letters.
	 *
	 * @return the news letters
	 */
	@Override
	public List<NewsLetter> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<NewsLetter> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<NewsLetter> findAll(
		int start, int end, OrderByComparator<NewsLetter> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<NewsLetter> findAll(
		int start, int end, OrderByComparator<NewsLetter> orderByComparator,
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

		List<NewsLetter> list = null;

		if (useFinderCache) {
			list = (List<NewsLetter>)finderCache.getResult(
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

				sql = sql.concat(NewsLetterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NewsLetter>)QueryUtil.list(
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
	 * Removes all the news letters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NewsLetter newsLetter : findAll()) {
			remove(newsLetter);
		}
	}

	/**
	 * Returns the number of news letters.
	 *
	 * @return the number of news letters
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
		return NewsLetterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the news letter persistence.
	 */
	@Activate
	public void activate() {
		NewsLetterModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		NewsLetterModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsLetterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, NewsLetterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NewsLetterImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.liferay.training.news.letter.model.NewsLetter"),
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
		"SELECT newsLetter FROM NewsLetter newsLetter";

	private static final String _SQL_COUNT_NEWSLETTER =
		"SELECT COUNT(newsLetter) FROM NewsLetter newsLetter";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsLetter.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NewsLetter exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		NewsLetterPersistenceImpl.class);

	static {
		try {
			Class.forName(NEWSLETTERPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}