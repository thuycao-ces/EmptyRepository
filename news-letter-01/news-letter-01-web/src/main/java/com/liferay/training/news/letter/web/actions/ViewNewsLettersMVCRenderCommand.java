package com.liferay.training.news.letter.web.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class ViewNewsLettersMVCRenderCommand implements  MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		System.out.println("AAAAAAAAAAA");
		return "/view.jsp";
	}

}
