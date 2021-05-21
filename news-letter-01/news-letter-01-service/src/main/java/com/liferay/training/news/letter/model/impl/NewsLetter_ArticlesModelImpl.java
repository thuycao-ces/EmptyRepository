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

package com.liferay.training.news.letter.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.news.letter.model.NewsLetter_Articles;
import com.liferay.training.news.letter.model.NewsLetter_ArticlesModel;
import com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the NewsLetter_Articles service. Represents a row in the &quot;NEWSLETTER_NewsLetter_Articles&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NewsLetter_ArticlesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NewsLetter_ArticlesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_ArticlesImpl
 * @generated
 */
@JSON(strict = true)
public class NewsLetter_ArticlesModelImpl
	extends BaseModelImpl<NewsLetter_Articles>
	implements NewsLetter_ArticlesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a news letter_ articles model instance should use the <code>NewsLetter_Articles</code> interface instead.
	 */
	public static final String TABLE_NAME = "NEWSLETTER_NewsLetter_Articles";

	public static final Object[][] TABLE_COLUMNS = {
		{"newsletter_articles_Id", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"issueDate", Types.TIMESTAMP}, {"newsletterId", Types.BIGINT},
		{"articlesId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("newsletter_articles_Id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("issueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("newsletterId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("articlesId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table NEWSLETTER_NewsLetter_Articles (newsletter_articles_Id LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,issueDate DATE null,newsletterId LONG,articlesId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table NEWSLETTER_NewsLetter_Articles";

	public static final String ORDER_BY_JPQL =
		" ORDER BY newsLetter_Articles.newsletter_articles_Id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY NEWSLETTER_NewsLetter_Articles.newsletter_articles_Id ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static NewsLetter_Articles toModel(
		NewsLetter_ArticlesSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		NewsLetter_Articles model = new NewsLetter_ArticlesImpl();

		model.setNewsletter_articles_Id(soapModel.getNewsletter_articles_Id());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setIssueDate(soapModel.getIssueDate());
		model.setNewsletterId(soapModel.getNewsletterId());
		model.setArticlesId(soapModel.getArticlesId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<NewsLetter_Articles> toModels(
		NewsLetter_ArticlesSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<NewsLetter_Articles> models = new ArrayList<NewsLetter_Articles>(
			soapModels.length);

		for (NewsLetter_ArticlesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public NewsLetter_ArticlesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _newsletter_articles_Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNewsletter_articles_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _newsletter_articles_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NewsLetter_Articles.class;
	}

	@Override
	public String getModelClassName() {
		return NewsLetter_Articles.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NewsLetter_Articles, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NewsLetter_Articles, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NewsLetter_Articles, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NewsLetter_Articles)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NewsLetter_Articles, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NewsLetter_Articles, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NewsLetter_Articles)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NewsLetter_Articles, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NewsLetter_Articles, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, NewsLetter_Articles>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			NewsLetter_Articles.class.getClassLoader(),
			NewsLetter_Articles.class, ModelWrapper.class);

		try {
			Constructor<NewsLetter_Articles> constructor =
				(Constructor<NewsLetter_Articles>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<NewsLetter_Articles, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<NewsLetter_Articles, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<NewsLetter_Articles, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<NewsLetter_Articles, Object>>();
		Map<String, BiConsumer<NewsLetter_Articles, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<NewsLetter_Articles, ?>>();

		attributeGetterFunctions.put(
			"newsletter_articles_Id",
			NewsLetter_Articles::getNewsletter_articles_Id);
		attributeSetterBiConsumers.put(
			"newsletter_articles_Id",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setNewsletter_articles_Id);
		attributeGetterFunctions.put(
			"groupId", NewsLetter_Articles::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setGroupId);
		attributeGetterFunctions.put(
			"companyId", NewsLetter_Articles::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setCompanyId);
		attributeGetterFunctions.put("userId", NewsLetter_Articles::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setUserId);
		attributeGetterFunctions.put(
			"userName", NewsLetter_Articles::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<NewsLetter_Articles, String>)
				NewsLetter_Articles::setUserName);
		attributeGetterFunctions.put(
			"createDate", NewsLetter_Articles::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<NewsLetter_Articles, Date>)
				NewsLetter_Articles::setCreateDate);
		attributeGetterFunctions.put(
			"issueDate", NewsLetter_Articles::getIssueDate);
		attributeSetterBiConsumers.put(
			"issueDate",
			(BiConsumer<NewsLetter_Articles, Date>)
				NewsLetter_Articles::setIssueDate);
		attributeGetterFunctions.put(
			"newsletterId", NewsLetter_Articles::getNewsletterId);
		attributeSetterBiConsumers.put(
			"newsletterId",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setNewsletterId);
		attributeGetterFunctions.put(
			"articlesId", NewsLetter_Articles::getArticlesId);
		attributeSetterBiConsumers.put(
			"articlesId",
			(BiConsumer<NewsLetter_Articles, Long>)
				NewsLetter_Articles::setArticlesId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getNewsletter_articles_Id() {
		return _newsletter_articles_Id;
	}

	@Override
	public void setNewsletter_articles_Id(long newsletter_articles_Id) {
		_newsletter_articles_Id = newsletter_articles_Id;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	@JSON
	@Override
	public long getNewsletterId() {
		return _newsletterId;
	}

	@Override
	public void setNewsletterId(long newsletterId) {
		_newsletterId = newsletterId;
	}

	@JSON
	@Override
	public long getArticlesId() {
		return _articlesId;
	}

	@Override
	public void setArticlesId(long articlesId) {
		_articlesId = articlesId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), NewsLetter_Articles.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NewsLetter_Articles toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NewsLetter_Articles>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NewsLetter_ArticlesImpl newsLetter_ArticlesImpl =
			new NewsLetter_ArticlesImpl();

		newsLetter_ArticlesImpl.setNewsletter_articles_Id(
			getNewsletter_articles_Id());
		newsLetter_ArticlesImpl.setGroupId(getGroupId());
		newsLetter_ArticlesImpl.setCompanyId(getCompanyId());
		newsLetter_ArticlesImpl.setUserId(getUserId());
		newsLetter_ArticlesImpl.setUserName(getUserName());
		newsLetter_ArticlesImpl.setCreateDate(getCreateDate());
		newsLetter_ArticlesImpl.setIssueDate(getIssueDate());
		newsLetter_ArticlesImpl.setNewsletterId(getNewsletterId());
		newsLetter_ArticlesImpl.setArticlesId(getArticlesId());

		newsLetter_ArticlesImpl.resetOriginalValues();

		return newsLetter_ArticlesImpl;
	}

	@Override
	public int compareTo(NewsLetter_Articles newsLetter_Articles) {
		long primaryKey = newsLetter_Articles.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsLetter_Articles)) {
			return false;
		}

		NewsLetter_Articles newsLetter_Articles = (NewsLetter_Articles)obj;

		long primaryKey = newsLetter_Articles.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<NewsLetter_Articles> toCacheModel() {
		NewsLetter_ArticlesCacheModel newsLetter_ArticlesCacheModel =
			new NewsLetter_ArticlesCacheModel();

		newsLetter_ArticlesCacheModel.newsletter_articles_Id =
			getNewsletter_articles_Id();

		newsLetter_ArticlesCacheModel.groupId = getGroupId();

		newsLetter_ArticlesCacheModel.companyId = getCompanyId();

		newsLetter_ArticlesCacheModel.userId = getUserId();

		newsLetter_ArticlesCacheModel.userName = getUserName();

		String userName = newsLetter_ArticlesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			newsLetter_ArticlesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			newsLetter_ArticlesCacheModel.createDate = createDate.getTime();
		}
		else {
			newsLetter_ArticlesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date issueDate = getIssueDate();

		if (issueDate != null) {
			newsLetter_ArticlesCacheModel.issueDate = issueDate.getTime();
		}
		else {
			newsLetter_ArticlesCacheModel.issueDate = Long.MIN_VALUE;
		}

		newsLetter_ArticlesCacheModel.newsletterId = getNewsletterId();

		newsLetter_ArticlesCacheModel.articlesId = getArticlesId();

		return newsLetter_ArticlesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NewsLetter_Articles, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NewsLetter_Articles, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NewsLetter_Articles, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((NewsLetter_Articles)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<NewsLetter_Articles, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<NewsLetter_Articles, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NewsLetter_Articles, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((NewsLetter_Articles)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, NewsLetter_Articles>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _newsletter_articles_Id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _issueDate;
	private long _newsletterId;
	private long _articlesId;
	private NewsLetter_Articles _escapedModel;

}