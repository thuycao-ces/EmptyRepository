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
 * This class is a wrapper for {@link NewsletterArticle}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsletterArticle
 * @generated
 */
public class NewsletterArticleWrapper
	extends BaseModelWrapper<NewsletterArticle>
	implements ModelWrapper<NewsletterArticle>, NewsletterArticle {

	public NewsletterArticleWrapper(NewsletterArticle newsletterArticle) {
		super(newsletterArticle);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newsletterArticleId", getNewsletterArticleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("author", getAuthor());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("resourcePrimKey", getResourcePrimKey());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newsletterArticleId = (Long)attributes.get("newsletterArticleId");

		if (newsletterArticleId != null) {
			setNewsletterArticleId(newsletterArticleId);
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

		Long resourcePrimKey = (Long)attributes.get("resourcePrimKey");

		if (resourcePrimKey != null) {
			setResourcePrimKey(resourcePrimKey);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the author of this newsletter article.
	 *
	 * @return the author of this newsletter article
	 */
	@Override
	public String getAuthor() {
		return model.getAuthor();
	}

	/**
	 * Returns the company ID of this newsletter article.
	 *
	 * @return the company ID of this newsletter article
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the content of this newsletter article.
	 *
	 * @return the content of this newsletter article
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the create date of this newsletter article.
	 *
	 * @return the create date of this newsletter article
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this newsletter article.
	 *
	 * @return the group ID of this newsletter article
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue number of this newsletter article.
	 *
	 * @return the issue number of this newsletter article
	 */
	@Override
	public Integer getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the modified date of this newsletter article.
	 *
	 * @return the modified date of this newsletter article
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the newsletter article ID of this newsletter article.
	 *
	 * @return the newsletter article ID of this newsletter article
	 */
	@Override
	public long getNewsletterArticleId() {
		return model.getNewsletterArticleId();
	}

	/**
	 * Returns the primary key of this newsletter article.
	 *
	 * @return the primary key of this newsletter article
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the resource prim key of this newsletter article.
	 *
	 * @return the resource prim key of this newsletter article
	 */
	@Override
	public long getResourcePrimKey() {
		return model.getResourcePrimKey();
	}

	/**
	 * Returns the status of this newsletter article.
	 *
	 * @return the status of this newsletter article
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the title of this newsletter article.
	 *
	 * @return the title of this newsletter article
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this newsletter article.
	 *
	 * @return the user ID of this newsletter article
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this newsletter article.
	 *
	 * @return the user uuid of this newsletter article
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public boolean isResourceMain() {
		return model.isResourceMain();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the author of this newsletter article.
	 *
	 * @param author the author of this newsletter article
	 */
	@Override
	public void setAuthor(String author) {
		model.setAuthor(author);
	}

	/**
	 * Sets the company ID of this newsletter article.
	 *
	 * @param companyId the company ID of this newsletter article
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this newsletter article.
	 *
	 * @param content the content of this newsletter article
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the create date of this newsletter article.
	 *
	 * @param createDate the create date of this newsletter article
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this newsletter article.
	 *
	 * @param groupId the group ID of this newsletter article
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue number of this newsletter article.
	 *
	 * @param issueNumber the issue number of this newsletter article
	 */
	@Override
	public void setIssueNumber(Integer issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the modified date of this newsletter article.
	 *
	 * @param modifiedDate the modified date of this newsletter article
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the newsletter article ID of this newsletter article.
	 *
	 * @param newsletterArticleId the newsletter article ID of this newsletter article
	 */
	@Override
	public void setNewsletterArticleId(long newsletterArticleId) {
		model.setNewsletterArticleId(newsletterArticleId);
	}

	/**
	 * Sets the primary key of this newsletter article.
	 *
	 * @param primaryKey the primary key of this newsletter article
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the resource prim key of this newsletter article.
	 *
	 * @param resourcePrimKey the resource prim key of this newsletter article
	 */
	@Override
	public void setResourcePrimKey(long resourcePrimKey) {
		model.setResourcePrimKey(resourcePrimKey);
	}

	/**
	 * Sets the status of this newsletter article.
	 *
	 * @param status the status of this newsletter article
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the title of this newsletter article.
	 *
	 * @param title the title of this newsletter article
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this newsletter article.
	 *
	 * @param userId the user ID of this newsletter article
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this newsletter article.
	 *
	 * @param userUuid the user uuid of this newsletter article
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewsletterArticleWrapper wrap(
		NewsletterArticle newsletterArticle) {

		return new NewsletterArticleWrapper(newsletterArticle);
	}

}