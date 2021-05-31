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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.newsletter.service.NewslettersArticlesServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>NewslettersArticlesServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewslettersArticlesServiceSoap
 * @generated
 */
public class NewslettersArticlesServiceHttp {

	public static com.liferay.training.newsletter.model.NewslettersArticles
			addNewslettersArticles(
				HttpPrincipal httpPrincipal, int issueNumber, String title,
				String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewslettersArticlesServiceUtil.class, "addNewslettersArticles",
				_addNewslettersArticlesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, issueNumber, title, content, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.newsletter.model.NewslettersArticles)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.newsletter.model.NewslettersArticles>
			getNewslettersArticlesByIssueNumber(
				HttpPrincipal httpPrincipal, int issueNumber) {

		try {
			MethodKey methodKey = new MethodKey(
				NewslettersArticlesServiceUtil.class,
				"getNewslettersArticlesByIssueNumber",
				_getNewslettersArticlesByIssueNumberParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, issueNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.newsletter.model.NewslettersArticles>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.NewslettersArticles
			updateNewslettersArticles(
				HttpPrincipal httpPrincipal, long newsletterArticlesId,
				int issueNumber, String title, String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewslettersArticlesServiceUtil.class,
				"updateNewslettersArticles",
				_updateNewslettersArticlesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, newsletterArticlesId, issueNumber, title, content);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.newsletter.model.NewslettersArticles)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewslettersArticlesServiceHttp.class);

	private static final Class<?>[] _addNewslettersArticlesParameterTypes0 =
		new Class[] {int.class, String.class, String.class, long.class};
	private static final Class<?>[]
		_getNewslettersArticlesByIssueNumberParameterTypes1 = new Class[] {
			int.class
		};
	private static final Class<?>[] _updateNewslettersArticlesParameterTypes2 =
		new Class[] {long.class, int.class, String.class, String.class};

}