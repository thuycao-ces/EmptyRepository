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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.newsletter.service.http.NewslettersArticlesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewslettersArticlesSoap implements Serializable {

	public static NewslettersArticlesSoap toSoapModel(
		NewslettersArticles model) {

		NewslettersArticlesSoap soapModel = new NewslettersArticlesSoap();

		soapModel.setNewslettersArticlesId(model.getNewslettersArticlesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIssueNumber(model.getIssueNumber());
		soapModel.setTitle(model.getTitle());
		soapModel.setContent(model.getContent());

		return soapModel;
	}

	public static NewslettersArticlesSoap[] toSoapModels(
		NewslettersArticles[] models) {

		NewslettersArticlesSoap[] soapModels =
			new NewslettersArticlesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewslettersArticlesSoap[][] toSoapModels(
		NewslettersArticles[][] models) {

		NewslettersArticlesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new NewslettersArticlesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewslettersArticlesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewslettersArticlesSoap[] toSoapModels(
		List<NewslettersArticles> models) {

		List<NewslettersArticlesSoap> soapModels =
			new ArrayList<NewslettersArticlesSoap>(models.size());

		for (NewslettersArticles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new NewslettersArticlesSoap[soapModels.size()]);
	}

	public NewslettersArticlesSoap() {
	}

	public long getPrimaryKey() {
		return _newslettersArticlesId;
	}

	public void setPrimaryKey(long pk) {
		setNewslettersArticlesId(pk);
	}

	public long getNewslettersArticlesId() {
		return _newslettersArticlesId;
	}

	public void setNewslettersArticlesId(long newslettersArticlesId) {
		_newslettersArticlesId = newslettersArticlesId;
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

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	private long _newslettersArticlesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _author;
	private Date _createDate;
	private Date _modifiedDate;
	private Integer _issueNumber;
	private String _title;
	private String _content;

}