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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.news.letter.service.http.NewsLetterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsLetterSoap implements Serializable {

	public static NewsLetterSoap toSoapModel(NewsLetter model) {
		NewsLetterSoap soapModel = new NewsLetterSoap();

		soapModel.setNewsletterId(model.getNewsletterId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setIssueNumber(model.getIssueNumber());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static NewsLetterSoap[] toSoapModels(NewsLetter[] models) {
		NewsLetterSoap[] soapModels = new NewsLetterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewsLetterSoap[][] toSoapModels(NewsLetter[][] models) {
		NewsLetterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NewsLetterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewsLetterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewsLetterSoap[] toSoapModels(List<NewsLetter> models) {
		List<NewsLetterSoap> soapModels = new ArrayList<NewsLetterSoap>(
			models.size());

		for (NewsLetter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NewsLetterSoap[soapModels.size()]);
	}

	public NewsLetterSoap() {
	}

	public long getPrimaryKey() {
		return _newsletterId;
	}

	public void setPrimaryKey(long pk) {
		setNewsletterId(pk);
	}

	public long getNewsletterId() {
		return _newsletterId;
	}

	public void setNewsletterId(long newsletterId) {
		_newsletterId = newsletterId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public Integer getIssueNumber() {
		return _issueNumber;
	}

	public void setIssueNumber(Integer issueNumber) {
		_issueNumber = issueNumber;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _newsletterId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _issueDate;
	private Integer _issueNumber;
	private String _title;
	private String _description;

}