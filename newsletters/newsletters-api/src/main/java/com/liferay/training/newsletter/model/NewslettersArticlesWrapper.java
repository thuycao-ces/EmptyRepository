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

package com.liferay.training.newsletter.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NewslettersArticles}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticles
 * @generated
 */
public class NewslettersArticlesWrapper
	extends BaseModelWrapper<NewslettersArticles>
	implements ModelWrapper<NewslettersArticles>, NewslettersArticles {

	public NewslettersArticlesWrapper(NewslettersArticles newslettersArticles) {
		super(newslettersArticles);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newslettersArticlesId", getNewslettersArticlesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("author", getAuthor());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newslettersArticlesId = (Long)attributes.get(
			"newslettersArticlesId");

		if (newslettersArticlesId != null) {
			setNewslettersArticlesId(newslettersArticlesId);
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

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer issueNumber = (Integer)attributes.get("issueNumber");

		if (issueNumber != null) {
			setIssueNumber(issueNumber);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	/**
	 * Returns the author of this newsletters articles.
	 *
	 * @return the author of this newsletters articles
	 */
	@Override
	public String getAuthor() {
		return model.getAuthor();
	}

	/**
	 * Returns the company ID of this newsletters articles.
	 *
	 * @return the company ID of this newsletters articles
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the content of this newsletters articles.
	 *
	 * @return the content of this newsletters articles
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the create date of this newsletters articles.
	 *
	 * @return the create date of this newsletters articles
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this newsletters articles.
	 *
	 * @return the group ID of this newsletters articles
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue number of this newsletters articles.
	 *
	 * @return the issue number of this newsletters articles
	 */
	@Override
	public Integer getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the modified date of this newsletters articles.
	 *
	 * @return the modified date of this newsletters articles
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the newsletters articles ID of this newsletters articles.
	 *
	 * @return the newsletters articles ID of this newsletters articles
	 */
	@Override
	public long getNewslettersArticlesId() {
		return model.getNewslettersArticlesId();
	}

	/**
	 * Returns the primary key of this newsletters articles.
	 *
	 * @return the primary key of this newsletters articles
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this newsletters articles.
	 *
	 * @return the title of this newsletters articles
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this newsletters articles.
	 *
	 * @return the user ID of this newsletters articles
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this newsletters articles.
	 *
	 * @return the user uuid of this newsletters articles
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
	 * Sets the author of this newsletters articles.
	 *
	 * @param author the author of this newsletters articles
	 */
	@Override
	public void setAuthor(String author) {
		model.setAuthor(author);
	}

	/**
	 * Sets the company ID of this newsletters articles.
	 *
	 * @param companyId the company ID of this newsletters articles
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this newsletters articles.
	 *
	 * @param content the content of this newsletters articles
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the create date of this newsletters articles.
	 *
	 * @param createDate the create date of this newsletters articles
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this newsletters articles.
	 *
	 * @param groupId the group ID of this newsletters articles
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue number of this newsletters articles.
	 *
	 * @param issueNumber the issue number of this newsletters articles
	 */
	@Override
	public void setIssueNumber(Integer issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the modified date of this newsletters articles.
	 *
	 * @param modifiedDate the modified date of this newsletters articles
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the newsletters articles ID of this newsletters articles.
	 *
	 * @param newslettersArticlesId the newsletters articles ID of this newsletters articles
	 */
	@Override
	public void setNewslettersArticlesId(long newslettersArticlesId) {
		model.setNewslettersArticlesId(newslettersArticlesId);
	}

	/**
	 * Sets the primary key of this newsletters articles.
	 *
	 * @param primaryKey the primary key of this newsletters articles
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this newsletters articles.
	 *
	 * @param title the title of this newsletters articles
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this newsletters articles.
	 *
	 * @param userId the user ID of this newsletters articles
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this newsletters articles.
	 *
	 * @param userUuid the user uuid of this newsletters articles
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewslettersArticlesWrapper wrap(
		NewslettersArticles newslettersArticles) {

		return new NewslettersArticlesWrapper(newslettersArticles);
	}

}