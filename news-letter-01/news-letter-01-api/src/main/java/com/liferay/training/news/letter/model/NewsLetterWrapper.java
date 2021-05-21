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
 * This class is a wrapper for {@link NewsLetter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsLetter
 * @generated
 */
public class NewsLetterWrapper
	extends BaseModelWrapper<NewsLetter>
	implements ModelWrapper<NewsLetter>, NewsLetter {

	public NewsLetterWrapper(NewsLetter newsLetter) {
		super(newsLetter);
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
		attributes.put("issueDate", getIssueDate());
		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());

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

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
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
	}

	/**
	 * Returns the company ID of this news letter.
	 *
	 * @return the company ID of this news letter
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this news letter.
	 *
	 * @return the create date of this news letter
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this news letter.
	 *
	 * @return the description of this news letter
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this news letter.
	 *
	 * @return the group ID of this news letter
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this news letter.
	 *
	 * @return the issue date of this news letter
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the issue number of this news letter.
	 *
	 * @return the issue number of this news letter
	 */
	@Override
	public Integer getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the newsletter ID of this news letter.
	 *
	 * @return the newsletter ID of this news letter
	 */
	@Override
	public long getNewsletterId() {
		return model.getNewsletterId();
	}

	/**
	 * Returns the primary key of this news letter.
	 *
	 * @return the primary key of this news letter
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this news letter.
	 *
	 * @return the title of this news letter
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this news letter.
	 *
	 * @return the user ID of this news letter
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this news letter.
	 *
	 * @return the user name of this news letter
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this news letter.
	 *
	 * @return the user uuid of this news letter
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
	 * Sets the company ID of this news letter.
	 *
	 * @param companyId the company ID of this news letter
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this news letter.
	 *
	 * @param createDate the create date of this news letter
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this news letter.
	 *
	 * @param description the description of this news letter
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this news letter.
	 *
	 * @param groupId the group ID of this news letter
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this news letter.
	 *
	 * @param issueDate the issue date of this news letter
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the issue number of this news letter.
	 *
	 * @param issueNumber the issue number of this news letter
	 */
	@Override
	public void setIssueNumber(Integer issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the newsletter ID of this news letter.
	 *
	 * @param newsletterId the newsletter ID of this news letter
	 */
	@Override
	public void setNewsletterId(long newsletterId) {
		model.setNewsletterId(newsletterId);
	}

	/**
	 * Sets the primary key of this news letter.
	 *
	 * @param primaryKey the primary key of this news letter
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this news letter.
	 *
	 * @param title the title of this news letter
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this news letter.
	 *
	 * @param userId the user ID of this news letter
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this news letter.
	 *
	 * @param userName the user name of this news letter
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this news letter.
	 *
	 * @param userUuid the user uuid of this news letter
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected NewsLetterWrapper wrap(NewsLetter newsLetter) {
		return new NewsLetterWrapper(newsLetter);
	}

}