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

package com.liferay.training.news.letter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.news.letter.model.NewsLetter;
import com.liferay.training.news.letter.service.base.NewsLetterLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "model.class.name=com.liferay.training.news.letter.model.NewsLetter",
	service = AopService.class
)
public class NewsLetterLocalServiceImpl extends NewsLetterLocalServiceBaseImpl {


}