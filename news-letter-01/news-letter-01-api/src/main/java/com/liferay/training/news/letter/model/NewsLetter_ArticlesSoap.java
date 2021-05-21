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
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.news.letter.service.http.NewsLetter_ArticlesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsLetter_ArticlesSoap implements Serializable {

	public static NewsLetter_ArticlesSoap toSoapModel(
		NewsLetter_Articles model) {

		NewsLetter_ArticlesSoap soapModel = new NewsLetter_ArticlesSoap();

		soapModel.setNewsletter_articles_Id(model.getNewsletter_articles_Id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setNewsletterId(model.getNewsletterId());
		soapModel.setArticlesId(model.getArticlesId());

		return soapModel;
	}

	public static NewsLetter_ArticlesSoap[] toSoapModels(
		NewsLetter_Articles[] models) {

		NewsLetter_ArticlesSoap[] soapModels =
			new NewsLetter_ArticlesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewsLetter_ArticlesSoap[][] toSoapModels(
		NewsLetter_Articles[][] models) {

		NewsLetter_ArticlesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new NewsLetter_ArticlesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewsLetter_ArticlesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewsLetter_ArticlesSoap[] toSoapModels(
		List<NewsLetter_Articles> models) {

		List<NewsLetter_ArticlesSoap> soapModels =
			new ArrayList<NewsLetter_ArticlesSoap>(models.size());

		for (NewsLetter_Articles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new NewsLetter_ArticlesSoap[soapModels.size()]);
	}

	public NewsLetter_ArticlesSoap() {
	}

	public long getPrimaryKey() {
		return _newsletter_articles_Id;
	}

	public void setPrimaryKey(long pk) {
		setNewsletter_articles_Id(pk);
	}

	public long getNewsletter_articles_Id() {
		return _newsletter_articles_Id;
	}

	public void setNewsletter_articles_Id(long newsletter_articles_Id) {
		_newsletter_articles_Id = newsletter_articles_Id;
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

	public long getNewsletterId() {
		return _newsletterId;
	}

	public void setNewsletterId(long newsletterId) {
		_newsletterId = newsletterId;
	}

	public long getArticlesId() {
		return _articlesId;
	}

	public void setArticlesId(long articlesId) {
		_articlesId = articlesId;
	}

	private long _newsletter_articles_Id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _issueDate;
	private long _newsletterId;
	private long _articlesId;

}