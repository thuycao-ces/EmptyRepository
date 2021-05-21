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
import com.liferay.training.news.letter.model.NewsLetter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsLetter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsLetterCacheModel
	implements CacheModel<NewsLetter>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsLetterCacheModel)) {
			return false;
		}

		NewsLetterCacheModel newsLetterCacheModel = (NewsLetterCacheModel)obj;

		if (newsletterId == newsLetterCacheModel.newsletterId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsletterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{newsletterId=");
		sb.append(newsletterId);
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
		sb.append(", issueNumber=");
		sb.append(issueNumber);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewsLetter toEntityModel() {
		NewsLetterImpl newsLetterImpl = new NewsLetterImpl();

		newsLetterImpl.setNewsletterId(newsletterId);
		newsLetterImpl.setGroupId(groupId);
		newsLetterImpl.setCompanyId(companyId);
		newsLetterImpl.setUserId(userId);

		if (userName == null) {
			newsLetterImpl.setUserName("");
		}
		else {
			newsLetterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			newsLetterImpl.setCreateDate(null);
		}
		else {
			newsLetterImpl.setCreateDate(new Date(createDate));
		}

		if (issueDate == Long.MIN_VALUE) {
			newsLetterImpl.setIssueDate(null);
		}
		else {
			newsLetterImpl.setIssueDate(new Date(issueDate));
		}

		newsLetterImpl.setIssueNumber(issueNumber);

		if (title == null) {
			newsLetterImpl.setTitle("");
		}
		else {
			newsLetterImpl.setTitle(title);
		}

		if (description == null) {
			newsLetterImpl.setDescription("");
		}
		else {
			newsLetterImpl.setDescription(description);
		}

		newsLetterImpl.resetOriginalValues();

		return newsLetterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newsletterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		issueDate = objectInput.readLong();

		issueNumber = objectInput.readInt();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(newsletterId);

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

		objectOutput.writeInt(issueNumber);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long newsletterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long issueDate;
	public int issueNumber;
	public String title;
	public String description;

}