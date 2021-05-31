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

package com.liferay.training.newsletter.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.newsletter.model.NewslettersArticles;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewslettersArticles in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewslettersArticlesCacheModel
	implements CacheModel<NewslettersArticles>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewslettersArticlesCacheModel)) {
			return false;
		}

		NewslettersArticlesCacheModel newslettersArticlesCacheModel =
			(NewslettersArticlesCacheModel)obj;

		if (newslettersArticlesId ==
				newslettersArticlesCacheModel.newslettersArticlesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newslettersArticlesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{newslettersArticlesId=");
		sb.append(newslettersArticlesId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", author=");
		sb.append(author);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", issueNumber=");
		sb.append(issueNumber);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewslettersArticles toEntityModel() {
		NewslettersArticlesImpl newslettersArticlesImpl =
			new NewslettersArticlesImpl();

		newslettersArticlesImpl.setNewslettersArticlesId(newslettersArticlesId);
		newslettersArticlesImpl.setGroupId(groupId);
		newslettersArticlesImpl.setCompanyId(companyId);
		newslettersArticlesImpl.setUserId(userId);

		if (author == null) {
			newslettersArticlesImpl.setAuthor("");
		}
		else {
			newslettersArticlesImpl.setAuthor(author);
		}

		if (createDate == Long.MIN_VALUE) {
			newslettersArticlesImpl.setCreateDate(null);
		}
		else {
			newslettersArticlesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			newslettersArticlesImpl.setModifiedDate(null);
		}
		else {
			newslettersArticlesImpl.setModifiedDate(new Date(modifiedDate));
		}

		newslettersArticlesImpl.setIssueNumber(issueNumber);

		if (title == null) {
			newslettersArticlesImpl.setTitle("");
		}
		else {
			newslettersArticlesImpl.setTitle(title);
		}

		if (content == null) {
			newslettersArticlesImpl.setContent("");
		}
		else {
			newslettersArticlesImpl.setContent(content);
		}

		newslettersArticlesImpl.resetOriginalValues();

		return newslettersArticlesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newslettersArticlesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		author = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		issueNumber = objectInput.readInt();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(newslettersArticlesId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (author == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(author);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(issueNumber);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}
	}

	public long newslettersArticlesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String author;
	public long createDate;
	public long modifiedDate;
	public int issueNumber;
	public String title;
	public String content;

}