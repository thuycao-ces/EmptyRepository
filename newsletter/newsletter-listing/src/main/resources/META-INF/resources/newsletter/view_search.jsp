<%@ include file="/init.jsp"%>

<%@ page import="javax.portlet.PortletURL" %>

<%@ page import="com.liferay.training.newsletter.service.NewsletterLocalServiceUtil" %>
<%@ page import="com.liferay.training.newsletter.service.NewsletterArticleLocalServiceUtil" %>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.SEARCH%>" />
</liferay-portlet:renderURL>

<aui:form
	action="<%=searchURL%>"
	method="get"
	name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

	<div class="search-form">
	   <aui:input
	        label=""
	        name="keywords"
	        size="30"
	        title="search-entries"
	        type="text" />

        <aui:button
           cssClass="button-search-style"
	       type="submit"
	       value="search" />
	</div>
	

</aui:form>

<c:forEach items="${newsletterResult}" var="newsletter">

	<portlet:renderURL var="viewNewsletterURL">
	    <portlet:param name="mvcRenderCommandName" value="<%=MVCCommandNames.VIEW_NEWSLETTER_ARTICLES%>" />
	    <portlet:param name="issueNumber" value="${newsletter.issueNumber}" />
	    <portlet:param name="redirect" value="${themeDisplay.getURLCurrent()}" />
	</portlet:renderURL>
	<div class="container">
	
	    <div class="newsletter-container">
	    
		    <p>Issue: #${newsletter.issueNumber},
		        ${formater.format(newsletter.issueDate)}</p>
			 <p class="text-title text-newsletter">
			     <aui:a href="${viewNewsletterURL}"> ${newsletter.title} </aui:a>
			 </p>
	
	    </div>
	</div>
               
</c:forEach>
                