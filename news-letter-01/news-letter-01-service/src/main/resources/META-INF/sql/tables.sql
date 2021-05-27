create table NEWSLETTER_NewsLetter (
	newsletterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	issueDate DATE null,
	issueNumber INTEGER,
	title VARCHAR(300) null,
	description VARCHAR(300) null
);

create table NEWSLETTER_NewsLetter_Articles (
	newsletter_articles_Id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	issueDate DATE null,
	newsletterId LONG,
	articlesId LONG
);