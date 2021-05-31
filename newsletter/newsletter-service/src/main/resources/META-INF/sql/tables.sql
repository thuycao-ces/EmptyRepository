create table NEWSLETTER_Newsletter (
	newsletterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	issueNumber INTEGER,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	issueDate DATE null,
	journalArticleId LONG
);

create table NEWSLETTER_NewsletterArticle (
	newsletterArticleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	author VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	issueNumber INTEGER,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	journalArticleId LONG
);