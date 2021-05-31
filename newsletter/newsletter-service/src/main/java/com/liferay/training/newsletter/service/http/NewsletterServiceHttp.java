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
import com.liferay.training.newsletter.service.NewsletterServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>NewsletterServiceUtil</code> service
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
 * @see NewsletterServiceSoap
 * @generated
 */
public class NewsletterServiceHttp {

	public static com.liferay.training.newsletter.model.Newsletter
			addNewsletter(
				HttpPrincipal httpPrincipal, long journalArticleId,
				int issueNumber, String title, String description,
				java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterServiceUtil.class, "addNewsletter",
				_addNewsletterParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, journalArticleId, issueNumber, title, description,
				issueDate);

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

			return (com.liferay.training.newsletter.model.Newsletter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteNewsletterByJournalArticleId(
			HttpPrincipal httpPrincipal, long journalArticleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterServiceUtil.class,
				"deleteNewsletterByJournalArticleId",
				_deleteNewsletterByJournalArticleIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, journalArticleId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
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
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.Newsletter
		getNewsletterByIssueNumber(
			HttpPrincipal httpPrincipal, int issueNumber) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterServiceUtil.class, "getNewsletterByIssueNumber",
				_getNewsletterByIssueNumberParameterTypes2);

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

			return (com.liferay.training.newsletter.model.Newsletter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.Newsletter
		getNewsletterByJournalActicleId(
			HttpPrincipal httpPrincipal, long journalArticleId) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterServiceUtil.class, "getNewsletterByJournalActicleId",
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

			return (com.liferay.training.newsletter.model.Newsletter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.newsletter.model.Newsletter
			updateNewsletter(
				HttpPrincipal httpPrincipal, long newsletterId, int issueNumber,
				String title, String description, java.util.Date issueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsletterServiceUtil.class, "updateNewsletter",
				_updateNewsletterParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, newsletterId, issueNumber, title, description,
				issueDate);

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

			return (com.liferay.training.newsletter.model.Newsletter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewsletterServiceHttp.class);

	private static final Class<?>[] _addNewsletterParameterTypes0 =
		new Class[] {
			long.class, int.class, String.class, String.class,
			java.util.Date.class
		};
	private static final Class<?>[]
		_deleteNewsletterByJournalArticleIdParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getNewsletterByIssueNumberParameterTypes2 =
		new Class[] {int.class};
	private static final Class<?>[]
		_getNewsletterByJournalActicleIdParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateNewsletterParameterTypes4 =
		new Class[] {
			long.class, int.class, String.class, String.class,
			java.util.Date.class
		};

}