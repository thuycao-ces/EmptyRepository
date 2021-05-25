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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.news.letter.service.NewsLetter_ArticlesServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>NewsLetter_ArticlesServiceUtil</code> service
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
 * @see NewsLetter_ArticlesServiceSoap
 * @generated
 */
public class NewsLetter_ArticlesServiceHttp {

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			addNewsLetter_Articles(
				HttpPrincipal httpPrincipal, long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsLetter_ArticlesServiceUtil.class, "addNewsLetter_Articles",
				_addNewsLetter_ArticlesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, newsletterId, articlesId, serviceContext);

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

			return (com.liferay.training.news.letter.model.NewsLetter_Articles)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			deleteNewsLetter_Articles(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsLetter_ArticlesServiceUtil.class,
				"deleteNewsLetter_Articles",
				_deleteNewsLetter_ArticlesParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

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

			return (com.liferay.training.news.letter.model.NewsLetter_Articles)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_Articles(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsLetter_ArticlesServiceUtil.class, "getNewsLetter_Articles",
				_getNewsLetter_ArticlesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.news.letter.model.NewsLetter_Articles>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.training.news.letter.model.NewsLetter_Articles>
			getNewsLetter_ArticlesByNewsletterId(
				HttpPrincipal httpPrincipal, long newsletterId) {

		try {
			MethodKey methodKey = new MethodKey(
				NewsLetter_ArticlesServiceUtil.class,
				"getNewsLetter_ArticlesByNewsletterId",
				_getNewsLetter_ArticlesByNewsletterIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, newsletterId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.training.news.letter.model.NewsLetter_Articles>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.news.letter.model.NewsLetter_Articles
			updateNewsLetter_Articles(
				HttpPrincipal httpPrincipal, long newsletter_articles_Id,
				long newsletterId, long articlesId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				NewsLetter_ArticlesServiceUtil.class,
				"updateNewsLetter_Articles",
				_updateNewsLetter_ArticlesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, newsletter_articles_Id, newsletterId, articlesId,
				serviceContext);

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

			return (com.liferay.training.news.letter.model.NewsLetter_Articles)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		NewsLetter_ArticlesServiceHttp.class);

	private static final Class<?>[] _addNewsLetter_ArticlesParameterTypes0 =
		new Class[] {
			long.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteNewsLetter_ArticlesParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getNewsLetter_ArticlesParameterTypes2 =
		new Class[] {};
	private static final Class<?>[]
		_getNewsLetter_ArticlesByNewsletterIdParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateNewsLetter_ArticlesParameterTypes4 =
		new Class[] {
			long.class, long.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};

}