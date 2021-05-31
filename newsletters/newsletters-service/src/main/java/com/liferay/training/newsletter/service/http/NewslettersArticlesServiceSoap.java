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

package com.liferay.training.newsletter.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.newsletter.service.NewslettersArticlesServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>NewslettersArticlesServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.newsletter.model.NewslettersArticlesSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.newsletter.model.NewslettersArticles</code>, that is translated to a
 * <code>com.liferay.training.newsletter.model.NewslettersArticlesSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesServiceHttp
 * @generated
 */
public class NewslettersArticlesServiceSoap {

	public static com.liferay.training.newsletter.model.NewslettersArticlesSoap
			addNewslettersArticles(
				int issueNumber, String title, String content, long userId)
		throws RemoteException {

		try {
			com.liferay.training.newsletter.model.NewslettersArticles
				returnValue =
					NewslettersArticlesServiceUtil.addNewslettersArticles(
						issueNumber, title, content, userId);

			return com.liferay.training.newsletter.model.
				NewslettersArticlesSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static
		com.liferay.training.newsletter.model.NewslettersArticlesSoap[]
				getNewslettersArticlesByIssueNumber(int issueNumber)
			throws RemoteException {

		try {
			java.util.List
				<com.liferay.training.newsletter.model.NewslettersArticles>
					returnValue =
						NewslettersArticlesServiceUtil.
							getNewslettersArticlesByIssueNumber(issueNumber);

			return com.liferay.training.newsletter.model.
				NewslettersArticlesSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.newsletter.model.NewslettersArticlesSoap
			updateNewslettersArticles(
				long newsletterArticlesId, int issueNumber, String title,
				String content)
		throws RemoteException {

		try {
			com.liferay.training.newsletter.model.NewslettersArticles
				returnValue =
					NewslettersArticlesServiceUtil.updateNewslettersArticles(
						newsletterArticlesId, issueNumber, title, content);

			return com.liferay.training.newsletter.model.
				NewslettersArticlesSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewslettersArticlesServiceSoap.class);

}