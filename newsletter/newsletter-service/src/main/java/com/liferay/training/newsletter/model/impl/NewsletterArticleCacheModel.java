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
import com.liferay.training.newsletter.model.NewsletterArticle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsletterArticle in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsletterArticleCacheModel
	implements CacheModel<NewsletterArticle>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsletterArticleCacheModel)) {
			return false;
		}

		NewsletterArticleCacheModel newsletterArticleCacheModel =
			(NewsletterArticleCacheModel)obj;

		if (newsletterArticleId ==
				newsletterArticleCacheModel.newsletterArticleId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsletterArticleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{newsletterArticleId=");
		sb.append(newsletterArticleId);
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
		sb.append(", journalArticleId=");
		sb.append(journalArticleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewsletterArticle toEntityModel() {
		NewsletterArticleImpl newsletterArticleImpl =
			new NewsletterArticleImpl();

		newsletterArticleImpl.setNewsletterArticleId(newsletterArticleId);
		newsletterArticleImpl.setGroupId(groupId);
		newsletterArticleImpl.setCompanyId(companyId);
		newsletterArticleImpl.setUserId(userId);

		if (author == null) {
			newsletterArticleImpl.setAuthor("");
		}
		else {
			newsletterArticleImpl.setAuthor(author);
		}

		if (createDate == Long.MIN_VALUE) {
			newsletterArticleImpl.setCreateDate(null);
		}
		else {
			newsletterArticleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			newsletterArticleImpl.setModifiedDate(null);
		}
		else {
			newsletterArticleImpl.setModifiedDate(new Date(modifiedDate));
		}

		newsletterArticleImpl.setIssueNumber(issueNumber);

		if (title == null) {
			newsletterArticleImpl.setTitle("");
		}
		else {
			newsletterArticleImpl.setTitle(title);
		}

		if (content == null) {
			newsletterArticleImpl.setContent("");
		}
		else {
			newsletterArticleImpl.setContent(content);
		}

		newsletterArticleImpl.setJournalArticleId(journalArticleId);

		newsletterArticleImpl.resetOriginalValues();

		return newsletterArticleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newsletterArticleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		author = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		issueNumber = objectInput.readInt();
		title = objectInput.readUTF();
		content = objectInput.readUTF();

		journalArticleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(newsletterArticleId);

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

		objectOutput.writeLong(journalArticleId);
	}

	public long newsletterArticleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String author;
	public long createDate;
	public long modifiedDate;
	public int issueNumber;
	public String title;
	public String content;
	public long journalArticleId;

}