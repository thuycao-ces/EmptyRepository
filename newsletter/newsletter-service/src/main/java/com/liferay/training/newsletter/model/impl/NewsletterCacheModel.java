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
import com.liferay.training.newsletter.model.Newsletter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Newsletter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsletterCacheModel
	implements CacheModel<Newsletter>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsletterCacheModel)) {
			return false;
		}

		NewsletterCacheModel newsletterCacheModel = (NewsletterCacheModel)obj;

		if (newsletterId == newsletterCacheModel.newsletterId) {
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
		StringBundler sb = new StringBundler(23);

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
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", issueNumber=");
		sb.append(issueNumber);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Newsletter toEntityModel() {
		NewsletterImpl newsletterImpl = new NewsletterImpl();

		newsletterImpl.setNewsletterId(newsletterId);
		newsletterImpl.setGroupId(groupId);
		newsletterImpl.setCompanyId(companyId);
		newsletterImpl.setUserId(userId);

		if (userName == null) {
			newsletterImpl.setUserName("");
		}
		else {
			newsletterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			newsletterImpl.setCreateDate(null);
		}
		else {
			newsletterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			newsletterImpl.setModifiedDate(null);
		}
		else {
			newsletterImpl.setModifiedDate(new Date(modifiedDate));
		}

		newsletterImpl.setIssueNumber(issueNumber);

		if (title == null) {
			newsletterImpl.setTitle("");
		}
		else {
			newsletterImpl.setTitle(title);
		}

		if (description == null) {
			newsletterImpl.setDescription("");
		}
		else {
			newsletterImpl.setDescription(description);
		}

		if (issueDate == Long.MIN_VALUE) {
			newsletterImpl.setIssueDate(null);
		}
		else {
			newsletterImpl.setIssueDate(new Date(issueDate));
		}

		newsletterImpl.resetOriginalValues();

		return newsletterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newsletterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		issueNumber = objectInput.readInt();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		issueDate = objectInput.readLong();
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
		objectOutput.writeLong(modifiedDate);

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

		objectOutput.writeLong(issueDate);
	}

	public long newsletterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int issueNumber;
	public String title;
	public String description;
	public long issueDate;

}