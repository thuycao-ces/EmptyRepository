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
 * This class is a wrapper for {@link Newsletter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Newsletter
 * @generated
 */
public class NewsletterWrapper
	extends BaseModelWrapper<Newsletter>
	implements ModelWrapper<Newsletter>, Newsletter {

	public NewsletterWrapper(Newsletter newsletter) {
		super(newsletter);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newsletterId", getNewsletterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("issueDate", getIssueDate());
		attributes.put("resourcePrimKey", getResourcePrimKey());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newsletterId = (Long)attributes.get("newsletterId");

		if (newsletterId != null) {
			setNewsletterId(newsletterId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
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
	 * Returns the company ID of this newsletter.
	 *
	 * @return the company ID of this newsletter
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this newsletter.
	 *
	 * @return the create date of this newsletter
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this newsletter.
	 *
	 * @return the description of this newsletter
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this newsletter.
	 *
	 * @return the group ID of this newsletter
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this newsletter.
	 *
	 * @return the issue date of this newsletter
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the issue number of this newsletter.
	 *
	 * @return the issue number of this newsletter
	 */
	@Override
	public Integer getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the modified date of this newsletter.
	 *
	 * @return the modified date of this newsletter
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the newsletter ID of this newsletter.
	 *
	 * @return the newsletter ID of this newsletter
	 */
	@Override
	public long getNewsletterId() {
		return model.getNewsletterId();
	}

	/**
	 * Returns the primary key of this newsletter.
	 *
	 * @return the primary key of this newsletter
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the resource prim key of this newsletter.
	 *
	 * @return the resource prim key of this newsletter
	 */
	@Override
	public long getResourcePrimKey() {
		return model.getResourcePrimKey();
	}

	/**
	 * Returns the status of this newsletter.
	 *
	 * @return the status of this newsletter
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the title of this newsletter.
	 *
	 * @return the title of this newsletter
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this newsletter.
	 *
	 * @return the user ID of this newsletter
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this newsletter.
	 *
	 * @return the user name of this newsletter
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this newsletter.
	 *
	 * @return the user uuid of this newsletter
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
	 * Sets the company ID of this newsletter.
	 *
	 * @param companyId the company ID of this newsletter
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this newsletter.
	 *
	 * @param createDate the create date of this newsletter
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this newsletter.
	 *
	 * @param description the description of this newsletter
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this newsletter.
	 *
	 * @param groupId the group ID of this newsletter
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this newsletter.
	 *
	 * @param issueDate the issue date of this newsletter
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the issue number of this newsletter.
	 *
	 * @param issueNumber the issue number of this newsletter
	 */
	@Override
	public void setIssueNumber(Integer issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the modified date of this newsletter.
	 *
	 * @param modifiedDate the modified date of this newsletter
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the newsletter ID of this newsletter.
	 *
	 * @param newsletterId the newsletter ID of this newsletter
	 */
	@Override
	public void setNewsletterId(long newsletterId) {
		model.setNewsletterId(newsletterId);
	}

	/**
	 * Sets the primary key of this newsletter.
	 *
	 * @param primaryKey the primary key of this newsletter
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the resource prim key of this newsletter.
	 *
	 * @param resourcePrimKey the resource prim key of this newsletter
	 */
	@Override
	public void setResourcePrimKey(long resourcePrimKey) {
		model.setResourcePrimKey(resourcePrimKey);
	}

	/**
	 * Sets the status of this newsletter.
	 *
	 * @param status the status of this newsletter
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the title of this newsletter.
	 *
	 * @param title the title of this newsletter
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this newsletter.
	 *
	 * @param userId the user ID of this newsletter
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this newsletter.
	 *
	 * @param userName the user name of this newsletter
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this newsletter.
	 *
	 * @param userUuid the user uuid of this newsletter
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewsletterWrapper wrap(Newsletter newsletter) {
		return new NewsletterWrapper(newsletter);
	}

}