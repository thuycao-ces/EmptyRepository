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
import com.liferay.training.news.letter.exception.NoSuchNewsLetter_ArticlesException;
import com.liferay.training.news.letter.model.NewsLetter_Articles;
import com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesImpl;
import com.liferay.training.news.letter.model.impl.NewsLetter_ArticlesModelImpl;
import com.liferay.training.news.letter.service.persistence.NewsLetter_ArticlesPersistence;
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
 * The persistence implementation for the news letter_ articles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NewsLetter_ArticlesPersistence.class)
public class NewsLetter_ArticlesPersistenceImpl
	extends BasePersistenceImpl<NewsLetter_Articles>
	implements NewsLetter_ArticlesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NewsLetter_ArticlesUtil</code> to access the news letter_ articles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NewsLetter_ArticlesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public NewsLetter_ArticlesPersistenceImpl() {
		setModelClass(NewsLetter_Articles.class);

		setModelImplClass(NewsLetter_ArticlesImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the news letter_ articles in the entity cache if it is enabled.
	 *
	 * @param newsLetter_Articles the news letter_ articles
	 */
	@Override
	public void cacheResult(NewsLetter_Articles newsLetter_Articles) {
		entityCache.putResult(
			entityCacheEnabled, NewsLetter_ArticlesImpl.class,
			newsLetter_Articles.getPrimaryKey(), newsLetter_Articles);

		newsLetter_Articles.resetOriginalValues();
	}

	/**
	 * Caches the news letter_ articleses in the entity cache if it is enabled.
	 *
	 * @param newsLetter_Articleses the news letter_ articleses
	 */
	@Override
	public void cacheResult(List<NewsLetter_Articles> newsLetter_Articleses) {
		for (NewsLetter_Articles newsLetter_Articles : newsLetter_Articleses) {
			if (entityCache.getResult(
					entityCacheEnabled, NewsLetter_ArticlesImpl.class,
					newsLetter_Articles.getPrimaryKey()) == null) {

				cacheResult(newsLetter_Articles);
			}
			else {
				newsLetter_Articles.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all news letter_ articleses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsLetter_ArticlesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the news letter_ articles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewsLetter_Articles newsLetter_Articles) {
		entityCache.removeResult(
			entityCacheEnabled, NewsLetter_ArticlesImpl.class,
			newsLetter_Articles.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NewsLetter_Articles> newsLetter_Articleses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewsLetter_Articles newsLetter_Articles : newsLetter_Articleses) {
			entityCache.removeResult(
				entityCacheEnabled, NewsLetter_ArticlesImpl.class,
				newsLetter_Articles.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, NewsLetter_ArticlesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new news letter_ articles with the primary key. Does not add the news letter_ articles to the database.
	 *
	 * @param newsletter_articles_Id the primary key for the new news letter_ articles
	 * @return the new news letter_ articles
	 */
	@Override
	public NewsLetter_Articles create(long newsletter_articles_Id) {
		NewsLetter_Articles newsLetter_Articles = new NewsLetter_ArticlesImpl();

		newsLetter_Articles.setNew(true);
		newsLetter_Articles.setPrimaryKey(newsletter_articles_Id);

		newsLetter_Articles.setCompanyId(CompanyThreadLocal.getCompanyId());

		return newsLetter_Articles;
	}

	/**
	 * Removes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public NewsLetter_Articles remove(long newsletter_articles_Id)
		throws NoSuchNewsLetter_ArticlesException {

		return remove((Serializable)newsletter_articles_Id);
	}

	/**
	 * Removes the news letter_ articles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the news letter_ articles
	 * @return the news letter_ articles that was removed
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public NewsLetter_Articles remove(Serializable primaryKey)
		throws NoSuchNewsLetter_ArticlesException {

		Session session = null;

		try {
			session = openSession();

			NewsLetter_Articles newsLetter_Articles =
				(NewsLetter_Articles)session.get(
					NewsLetter_ArticlesImpl.class, primaryKey);

			if (newsLetter_Articles == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsLetter_ArticlesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(newsLetter_Articles);
		}
		catch (NoSuchNewsLetter_ArticlesException noSuchEntityException) {
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
	protected NewsLetter_Articles removeImpl(
		NewsLetter_Articles newsLetter_Articles) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsLetter_Articles)) {
				newsLetter_Articles = (NewsLetter_Articles)session.get(
					NewsLetter_ArticlesImpl.class,
					newsLetter_Articles.getPrimaryKeyObj());
			}

			if (newsLetter_Articles != null) {
				session.delete(newsLetter_Articles);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (newsLetter_Articles != null) {
			clearCache(newsLetter_Articles);
		}

		return newsLetter_Articles;
	}

	@Override
	public NewsLetter_Articles updateImpl(
		NewsLetter_Articles newsLetter_Articles) {

		boolean isNew = newsLetter_Articles.isNew();

		Session session = null;

		try {
			session = openSession();

			if (newsLetter_Articles.isNew()) {
				session.save(newsLetter_Articles);

				newsLetter_Articles.setNew(false);
			}
			else {
				newsLetter_Articles = (NewsLetter_Articles)session.merge(
					newsLetter_Articles);
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
			entityCacheEnabled, NewsLetter_ArticlesImpl.class,
			newsLetter_Articles.getPrimaryKey(), newsLetter_Articles, false);

		newsLetter_Articles.resetOriginalValues();

		return newsLetter_Articles;
	}

	/**
	 * Returns the news letter_ articles with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public NewsLetter_Articles findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsLetter_ArticlesException {

		NewsLetter_Articles newsLetter_Articles = fetchByPrimaryKey(primaryKey);

		if (newsLetter_Articles == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsLetter_ArticlesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return newsLetter_Articles;
	}

	/**
	 * Returns the news letter_ articles with the primary key or throws a <code>NoSuchNewsLetter_ArticlesException</code> if it could not be found.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles
	 * @throws NoSuchNewsLetter_ArticlesException if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public NewsLetter_Articles findByPrimaryKey(long newsletter_articles_Id)
		throws NoSuchNewsLetter_ArticlesException {

		return findByPrimaryKey((Serializable)newsletter_articles_Id);
	}

	/**
	 * Returns the news letter_ articles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsletter_articles_Id the primary key of the news letter_ articles
	 * @return the news letter_ articles, or <code>null</code> if a news letter_ articles with the primary key could not be found
	 */
	@Override
	public NewsLetter_Articles fetchByPrimaryKey(long newsletter_articles_Id) {
		return fetchByPrimaryKey((Serializable)newsletter_articles_Id);
	}

	/**
	 * Returns all the news letter_ articleses.
	 *
	 * @return the news letter_ articleses
	 */
	@Override
	public List<NewsLetter_Articles> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<NewsLetter_Articles> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<NewsLetter_Articles> findAll(
		int start, int end,
		OrderByComparator<NewsLetter_Articles> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<NewsLetter_Articles> findAll(
		int start, int end,
		OrderByComparator<NewsLetter_Articles> orderByComparator,
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

		List<NewsLetter_Articles> list = null;

		if (useFinderCache) {
			list = (List<NewsLetter_Articles>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NEWSLETTER_ARTICLES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSLETTER_ARTICLES;

				sql = sql.concat(NewsLetter_ArticlesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NewsLetter_Articles>)QueryUtil.list(
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
	 * Removes all the news letter_ articleses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NewsLetter_Articles newsLetter_Articles : findAll()) {
			remove(newsLetter_Articles);
		}
	}

	/**
	 * Returns the number of news letter_ articleses.
	 *
	 * @return the number of news letter_ articleses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_NEWSLETTER_ARTICLES);

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
		return "newsletter_articles_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NEWSLETTER_ARTICLES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewsLetter_ArticlesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the news letter_ articles persistence.
	 */
	@Activate
	public void activate() {
		NewsLetter_ArticlesModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		NewsLetter_ArticlesModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			NewsLetter_ArticlesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			NewsLetter_ArticlesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(NewsLetter_ArticlesImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.liferay.training.news.letter.model.NewsLetter_Articles"),
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

	private static final String _SQL_SELECT_NEWSLETTER_ARTICLES =
		"SELECT newsLetter_Articles FROM NewsLetter_Articles newsLetter_Articles";

	private static final String _SQL_COUNT_NEWSLETTER_ARTICLES =
		"SELECT COUNT(newsLetter_Articles) FROM NewsLetter_Articles newsLetter_Articles";

	private static final String _ORDER_BY_ENTITY_ALIAS = "newsLetter_Articles.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NewsLetter_Articles exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		NewsLetter_ArticlesPersistenceImpl.class);

	static {
		try {
			Class.forName(NEWSLETTERPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}