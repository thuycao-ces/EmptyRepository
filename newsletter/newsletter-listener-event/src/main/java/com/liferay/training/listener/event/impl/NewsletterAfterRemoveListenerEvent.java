package com.liferay.training.listener.event.impl;

import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalService;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.util.JournalConverter;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.training.listener.event.constants.ListenerCommandNames;
import com.liferay.training.newsletter.service.NewsletterArticleService;
import com.liferay.training.newsletter.service.NewsletterService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ModelListener.class)
public class NewsletterAfterRemoveListenerEvent extends BaseModelListener<JournalArticle> {

	@Override
	public void onAfterRemove(JournalArticle journalArticle) throws ModelListenerException {

		DDMStructure structure;

		if (!journalArticle.getDDMStructureKey().equals(ListenerCommandNames.BASIC_WEB_CONTENT)) {

			try {
				structure = ddmStructureLocalService.getStructure(journalArticle.getGroupId(),
						classNameLocalService.getClassNameId(JournalArticle.class.getName()),
						journalArticle.getStructureId());

				if (structure.getNameCurrentValue().equals(ListenerCommandNames.NEWSLETTERS)) {
					newsletterService.deleteNewsletterByJournalArticleId(journalArticle.getId());
				} else if (structure.getNameCurrentValue().equals(ListenerCommandNames.NEWSLETTER_ARTICLES)) {
					newsletterArticleService.deleteNewsletterArticleByJournalArticleId(journalArticle.getId());
				}

			} catch (PortalException e) {
				e.printStackTrace();
			}

		}
		super.onAfterRemove(journalArticle);
	}

	@Reference
	ClassNameLocalService classNameLocalService;

	@Reference
	JournalConverter journalConverter;

	@Reference
	NewsletterService newsletterService;

	@Reference
	NewsletterArticleService newsletterArticleService;

	@Reference
	DDMStructureLocalService ddmStructureLocalService;

}
