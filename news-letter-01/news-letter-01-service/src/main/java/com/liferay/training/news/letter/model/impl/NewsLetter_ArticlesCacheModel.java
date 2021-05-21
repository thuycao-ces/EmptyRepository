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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.news.letter.model.NewsLetter_Articles;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsLetter_Articles in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsLetter_ArticlesCacheModel
	implements CacheModel<NewsLetter_Articles>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsLetter_ArticlesCacheModel)) {
			return false;
		}

		NewsLetter_ArticlesCacheModel newsLetter_ArticlesCacheModel =
			(NewsLetter_ArticlesCacheModel)obj;

		if (newsletter_articles_Id ==
				newsLetter_ArticlesCacheModel.newsletter_articles_Id) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsletter_articles_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{newsletter_articles_Id=");
		sb.append(newsletter_articles_Id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", newsletterId=");
		sb.append(newsletterId);
		sb.append(", articlesId=");
		sb.append(articlesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewsLetter_Articles toEntityModel() {
		NewsLetter_ArticlesImpl newsLetter_ArticlesImpl =
			new NewsLetter_ArticlesImpl();

		newsLetter_ArticlesImpl.setNewsletter_articles_Id(
			newsletter_articles_Id);
		newsLetter_ArticlesImpl.setGroupId(groupId);
		newsLetter_ArticlesImpl.setCompanyId(companyId);
		newsLetter_ArticlesImpl.setUserId(userId);

		if (userName == null) {
			newsLetter_ArticlesImpl.setUserName("");
		}
		else {
			newsLetter_ArticlesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			newsLetter_ArticlesImpl.setCreateDate(null);
		}
		else {
			newsLetter_ArticlesImpl.setCreateDate(new Date(createDate));
		}

		if (issueDate == Long.MIN_VALUE) {
			newsLetter_ArticlesImpl.setIssueDate(null);
		}
		else {
			newsLetter_ArticlesImpl.setIssueDate(new Date(issueDate));
		}

		newsLetter_ArticlesImpl.setNewsletterId(newsletterId);
		newsLetter_ArticlesImpl.setArticlesId(articlesId);

		newsLetter_ArticlesImpl.resetOriginalValues();

		return newsLetter_ArticlesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newsletter_articles_Id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		issueDate = objectInput.readLong();

		newsletterId = objectInput.readLong();

		articlesId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(newsletter_articles_Id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(issueDate);

		objectOutput.writeLong(newsletterId);

		objectOutput.writeLong(articlesId);
	}

	public long newsletter_articles_Id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long issueDate;
	public long newsletterId;
	public long articlesId;

}