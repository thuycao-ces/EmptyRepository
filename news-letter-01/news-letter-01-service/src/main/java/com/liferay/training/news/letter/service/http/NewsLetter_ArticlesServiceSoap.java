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

package com.liferay.training.news.letter.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.news.letter.service.NewsLetter_ArticlesServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>NewsLetter_ArticlesServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.news.letter.model.NewsLetter_Articles</code>, that is translated to a
 * <code>com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap</code>. Methods that SOAP
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
 * @see NewsLetter_ArticlesServiceHttp
 * @generated
 */
public class NewsLetter_ArticlesServiceSoap {

	public static com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap
			addNewsLetter_Articles(
				long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.news.letter.model.NewsLetter_Articles
				returnValue =
					NewsLetter_ArticlesServiceUtil.addNewsLetter_Articles(
						newsletterId, articlesId, serviceContext);

			return com.liferay.training.news.letter.model.
				NewsLetter_ArticlesSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap
			deleteNewsLetter_Articles(long id)
		throws RemoteException {

		try {
			com.liferay.training.news.letter.model.NewsLetter_Articles
				returnValue =
					NewsLetter_ArticlesServiceUtil.deleteNewsLetter_Articles(
						id);

			return com.liferay.training.news.letter.model.
				NewsLetter_ArticlesSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static
		com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap[]
				getNewsLetter_Articles()
			throws RemoteException {

		try {
			java.util.List
				<com.liferay.training.news.letter.model.NewsLetter_Articles>
					returnValue =
						NewsLetter_ArticlesServiceUtil.getNewsLetter_Articles();

			return com.liferay.training.news.letter.model.
				NewsLetter_ArticlesSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static
		com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap[]
				getNewsLetter_ArticlesByNewsletterId(long newsletterId)
			throws RemoteException {

		try {
			java.util.List
				<com.liferay.training.news.letter.model.NewsLetter_Articles>
					returnValue =
						NewsLetter_ArticlesServiceUtil.
							getNewsLetter_ArticlesByNewsletterId(newsletterId);

			return com.liferay.training.news.letter.model.
				NewsLetter_ArticlesSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.news.letter.model.NewsLetter_ArticlesSoap
			updateNewsLetter_Articles(
				long newsletter_articles_Id, long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.news.letter.model.NewsLetter_Articles
				returnValue =
					NewsLetter_ArticlesServiceUtil.updateNewsLetter_Articles(
						newsletter_articles_Id, newsletterId, articlesId,
						serviceContext);

			return com.liferay.training.news.letter.model.
				NewsLetter_ArticlesSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewsLetter_ArticlesServiceSoap.class);

}