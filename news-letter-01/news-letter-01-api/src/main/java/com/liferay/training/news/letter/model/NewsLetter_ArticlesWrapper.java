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

package com.liferay.training.news.letter.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NewsLetter_Articles}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter_Articles
 * @generated
 */
public class NewsLetter_ArticlesWrapper
	extends BaseModelWrapper<NewsLetter_Articles>
	implements ModelWrapper<NewsLetter_Articles>, NewsLetter_Articles {

	public NewsLetter_ArticlesWrapper(NewsLetter_Articles newsLetter_Articles) {
		super(newsLetter_Articles);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newsletter_articles_Id", getNewsletter_articles_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("issueDate", getIssueDate());
		attributes.put("newsletterId", getNewsletterId());
		attributes.put("articlesId", getArticlesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newsletter_articles_Id = (Long)attributes.get(
			"newsletter_articles_Id");

		if (newsletter_articles_Id != null) {
			setNewsletter_articles_Id(newsletter_articles_Id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Long newsletterId = (Long)attributes.get("newsletterId");

		if (newsletterId != null) {
			setNewsletterId(newsletterId);
		}

		Long articlesId = (Long)attributes.get("articlesId");

		if (articlesId != null) {
			setArticlesId(articlesId);
		}
	}

	/**
	 * Returns the articles ID of this news letter_ articles.
	 *
	 * @return the articles ID of this news letter_ articles
	 */
	@Override
	public long getArticlesId() {
		return model.getArticlesId();
	}

	/**
	 * Returns the company ID of this news letter_ articles.
	 *
	 * @return the company ID of this news letter_ articles
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this news letter_ articles.
	 *
	 * @return the create date of this news letter_ articles
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this news letter_ articles.
	 *
	 * @return the group ID of this news letter_ articles
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this news letter_ articles.
	 *
	 * @return the issue date of this news letter_ articles
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the newsletter_articles_ ID of this news letter_ articles.
	 *
	 * @return the newsletter_articles_ ID of this news letter_ articles
	 */
	@Override
	public long getNewsletter_articles_Id() {
		return model.getNewsletter_articles_Id();
	}

	/**
	 * Returns the newsletter ID of this news letter_ articles.
	 *
	 * @return the newsletter ID of this news letter_ articles
	 */
	@Override
	public long getNewsletterId() {
		return model.getNewsletterId();
	}

	/**
	 * Returns the primary key of this news letter_ articles.
	 *
	 * @return the primary key of this news letter_ articles
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this news letter_ articles.
	 *
	 * @return the user ID of this news letter_ articles
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this news letter_ articles.
	 *
	 * @return the user name of this news letter_ articles
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this news letter_ articles.
	 *
	 * @return the user uuid of this news letter_ articles
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the articles ID of this news letter_ articles.
	 *
	 * @param articlesId the articles ID of this news letter_ articles
	 */
	@Override
	public void setArticlesId(long articlesId) {
		model.setArticlesId(articlesId);
	}

	/**
	 * Sets the company ID of this news letter_ articles.
	 *
	 * @param companyId the company ID of this news letter_ articles
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this news letter_ articles.
	 *
	 * @param createDate the create date of this news letter_ articles
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this news letter_ articles.
	 *
	 * @param groupId the group ID of this news letter_ articles
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this news letter_ articles.
	 *
	 * @param issueDate the issue date of this news letter_ articles
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the newsletter_articles_ ID of this news letter_ articles.
	 *
	 * @param newsletter_articles_Id the newsletter_articles_ ID of this news letter_ articles
	 */
	@Override
	public void setNewsletter_articles_Id(long newsletter_articles_Id) {
		model.setNewsletter_articles_Id(newsletter_articles_Id);
	}

	/**
	 * Sets the newsletter ID of this news letter_ articles.
	 *
	 * @param newsletterId the newsletter ID of this news letter_ articles
	 */
	@Override
	public void setNewsletterId(long newsletterId) {
		model.setNewsletterId(newsletterId);
	}

	/**
	 * Sets the primary key of this news letter_ articles.
	 *
	 * @param primaryKey the primary key of this news letter_ articles
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this news letter_ articles.
	 *
	 * @param userId the user ID of this news letter_ articles
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this news letter_ articles.
	 *
	 * @param userName the user name of this news letter_ articles
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this news letter_ articles.
	 *
	 * @param userUuid the user uuid of this news letter_ articles
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewsLetter_ArticlesWrapper wrap(
		NewsLetter_Articles newsLetter_Articles) {

		return new NewsLetter_ArticlesWrapper(newsLetter_Articles);
	}

}