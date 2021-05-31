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
 * This class is a wrapper for {@link Newsletters}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Newsletters
 * @generated
 */
public class NewslettersWrapper
	extends BaseModelWrapper<Newsletters>
	implements ModelWrapper<Newsletters>, Newsletters {

	public NewslettersWrapper(Newsletters newsletters) {
		super(newsletters);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newslettersId", getNewslettersId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newslettersId = (Long)attributes.get("newslettersId");

		if (newslettersId != null) {
			setNewslettersId(newslettersId);
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
	}

	/**
	 * Returns the company ID of this newsletters.
	 *
	 * @return the company ID of this newsletters
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this newsletters.
	 *
	 * @return the create date of this newsletters
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this newsletters.
	 *
	 * @return the description of this newsletters
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this newsletters.
	 *
	 * @return the group ID of this newsletters
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this newsletters.
	 *
	 * @return the issue date of this newsletters
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the issue number of this newsletters.
	 *
	 * @return the issue number of this newsletters
	 */
	@Override
	public Integer getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the modified date of this newsletters.
	 *
	 * @return the modified date of this newsletters
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the newsletters ID of this newsletters.
	 *
	 * @return the newsletters ID of this newsletters
	 */
	@Override
	public long getNewslettersId() {
		return model.getNewslettersId();
	}

	/**
	 * Returns the primary key of this newsletters.
	 *
	 * @return the primary key of this newsletters
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this newsletters.
	 *
	 * @return the title of this newsletters
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this newsletters.
	 *
	 * @return the user ID of this newsletters
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this newsletters.
	 *
	 * @return the user name of this newsletters
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this newsletters.
	 *
	 * @return the user uuid of this newsletters
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
	 * Sets the company ID of this newsletters.
	 *
	 * @param companyId the company ID of this newsletters
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this newsletters.
	 *
	 * @param createDate the create date of this newsletters
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this newsletters.
	 *
	 * @param description the description of this newsletters
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this newsletters.
	 *
	 * @param groupId the group ID of this newsletters
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this newsletters.
	 *
	 * @param issueDate the issue date of this newsletters
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the issue number of this newsletters.
	 *
	 * @param issueNumber the issue number of this newsletters
	 */
	@Override
	public void setIssueNumber(Integer issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the modified date of this newsletters.
	 *
	 * @param modifiedDate the modified date of this newsletters
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the newsletters ID of this newsletters.
	 *
	 * @param newslettersId the newsletters ID of this newsletters
	 */
	@Override
	public void setNewslettersId(long newslettersId) {
		model.setNewslettersId(newslettersId);
	}

	/**
	 * Sets the primary key of this newsletters.
	 *
	 * @param primaryKey the primary key of this newsletters
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this newsletters.
	 *
	 * @param title the title of this newsletters
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this newsletters.
	 *
	 * @param userId the user ID of this newsletters
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this newsletters.
	 *
	 * @param userName the user name of this newsletters
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this newsletters.
	 *
	 * @param userUuid the user uuid of this newsletters
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewslettersWrapper wrap(Newsletters newsletters) {
		return new NewslettersWrapper(newsletters);
	}

}