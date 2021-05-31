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
import com.liferay.training.newsletter.service.NewsletterArticleServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>NewsletterArticleServiceUtil</code> service
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
 * @see NewsletterArticleServiceSoap
 * @generated
 */
public class NewsletterArticleServiceHttp {

	public static com.liferay.training.newsletter.model.NewsletterArticle
			addNewsletterArticle(
				HttpPrincipal httpPrincipal, long journalArticleId,
				int issueNumber, String title, String content, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterArticleServiceUtil.class, "addNewsletterArticle",
				_addNewsletterArticleParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, journalArticleId, issueNumber, title, content,
				userId);

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

			return (com.liferay.training.newsletter.model.NewsletterArticle)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.NewsletterArticle
			deleteNewsletterArticleByJournalArticleId(
				HttpPrincipal httpPrincipal, long journalArticleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterArticleServiceUtil.class,
				"deleteNewsletterArticleByJournalArticleId",
				_deleteNewsletterArticleByJournalArticleIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, journalArticleId);

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

			return (com.liferay.training.newsletter.model.NewsletterArticle)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.newsletter.model.NewsletterArticle>
			getNewsletterArticleByIssueNumber(
				HttpPrincipal httpPrincipal, int issueNumber) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterArticleServiceUtil.class,
				"getNewsletterArticleByIssueNumber",
				_getNewsletterArticleByIssueNumberParameterTypes2);

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
				<com.liferay.training.newsletter.model.NewsletterArticle>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.NewsletterArticle
		getNewsletterByJournalActicleId(
			HttpPrincipal httpPrincipal, long journalArticleId) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterArticleServiceUtil.class,
				"getNewsletterByJournalActicleId",
				_getNewsletterByJournalActicleIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, journalArticleId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.newsletter.model.NewsletterArticle)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.NewsletterArticle
			updateNewsletterArticle(
				HttpPrincipal httpPrincipal, long newsletterArticlesId,
				int issueNumber, String title, String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterArticleServiceUtil.class, "updateNewsletterArticle",
				_updateNewsletterArticleParameterTypes4);

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

			return (com.liferay.training.newsletter.model.NewsletterArticle)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewsletterArticleServiceHttp.class);

	private static final Class<?>[] _addNewsletterArticleParameterTypes0 =
		new Class[] {
			long.class, int.class, String.class, String.class, long.class
		};
	private static final Class<?>[]
		_deleteNewsletterArticleByJournalArticleIdParameterTypes1 =
			new Class[] {long.class};
	private static final Class<?>[]
		_getNewsletterArticleByIssueNumberParameterTypes2 = new Class[] {
			int.class
		};
	private static final Class<?>[]
		_getNewsletterByJournalActicleIdParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateNewsletterArticleParameterTypes4 =
		new Class[] {long.class, int.class, String.class, String.class};

}