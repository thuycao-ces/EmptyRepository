package com.liferay.training.newsletter.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.newsletter.model.Newsletters;
import com.liferay.training.newsletter.service.base.NewslettersServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	property = {
		"json.web.service.context.name=newsletter",
		"json.web.service.context.path=Newsletters"
	},
	service = AopService.class
)
public class NewslettersServiceImpl extends NewslettersServiceBaseImpl {

	public Newsletters addNewsletters(int issueNumber, String title, String description, Date issueDate) throws PortalException {

		return newslettersLocalService.addNewsletters(issueNumber, title, description, issueDate);
	}
	
	public Newsletters updateNewsletters(long newsletterId, int issueNumber, String title, String description, Date issueDate) throws PortalException {

		return newslettersLocalService.updateNewsletters(newsletterId, issueNumber, title, description, issueDate);
	}
	
	public Newsletters getNewslettersByIssueNumber(int issueNumber) {
		
		List<Newsletters> newsletters = newslettersLocalService.getNewsletters();
		
		for(Newsletters newsletter: newsletters) {
			if(newsletter.getIssueNumber() == issueNumber) {
				return newsletter;
			}
		}
		
		return null;
	}

}