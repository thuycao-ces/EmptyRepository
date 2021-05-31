package com.liferay.training.model.listener.impl;

import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalService;
import com.liferay.dynamic.data.mapping.storage.Field;
import com.liferay.dynamic.data.mapping.storage.Fields;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.util.JournalConverter;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.training.model.listener.constants.CommandNames;
import com.liferay.training.newsletter.service.NewslettersArticlesLocalService;
import com.liferay.training.newsletter.service.NewslettersLocalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ModelListener.class)
public class JournalArticleModelListener extends BaseModelListener<JournalArticle> {

	@Override
	public void onAfterCreate(JournalArticle journalArticle) throws ModelListenerException {

		Map<String, Object> attributes = new HashMap<String, Object>();

		DDMStructure structure;

		Fields fields = null;

		if (!journalArticle.getDDMStructureKey().equals(CommandNames.BASIC_WEB_CONTENT)) {

			try {
				structure = ddmStructureLocalService.getStructure(journalArticle.getGroupId(),
						classNameLocalService.getClassNameId(JournalArticle.class.getName()),
						journalArticle.getStructureId());

				fields = journalConverter.getDDMFields(structure, journalArticle.getContent());

				for (Field field : fields) {
					attributes.put(field.getName(), field.getValue());
				}

				if (structure.getNameCurrentValue().equals(CommandNames.NEWSLETTERS)) {
					_addNewsletters(attributes);
				} else if (structure.getNameCurrentValue().equals(CommandNames.NEWSLETTER_ARTICLES)) {
					_addNewsletterArticles(attributes, structure.getUserId());
				}

			} catch (PortalException | ParseException e) {
				e.printStackTrace();
			}
		}

		super.onAfterCreate(journalArticle);
	}

	private void _addNewsletters(Map<String, Object> attributes) throws PortalException, ParseException {

		int issueNumber = (int) attributes.get("issueNumber");

		String title = (String) attributes.get("title");

		String description = (String) attributes.get("description");

		String stringIssueDate = (String) attributes.get("issueDate");

		Date issueDate = new SimpleDateFormat("yyyy-MM-dd").parse(stringIssueDate);

		newslettersLocalService.addNewsletters(issueNumber, title, description, issueDate);

	}

	private void _addNewsletterArticles(Map<String, Object> attributes, long userId)
			throws PortalException, ParseException {

		int issueNumber = (int) attributes.get("issueNumber");

		String title = (String) attributes.get("title");

		String content = (String) attributes.get("content");

		newslettersArticlesLocalService.addNewslettersArticles(issueNumber, title, content, userId);

	}

	@Reference
	ClassNameLocalService classNameLocalService;

	@Reference
	JournalConverter journalConverter;

	@Reference
	NewslettersLocalService newslettersLocalService;

	@Reference
	NewslettersArticlesLocalService newslettersArticlesLocalService;

	@Reference
	DDMStructureLocalService ddmStructureLocalService;
}
