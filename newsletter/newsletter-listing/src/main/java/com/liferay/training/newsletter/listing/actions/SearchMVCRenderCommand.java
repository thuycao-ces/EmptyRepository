package com.liferay.training.newsletter.listing.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.training.newsletter.listing.constants.MVCCommandNames;
import com.liferay.training.newsletter.listing.constants.NewsletterListingPortletKeys;
import com.liferay.training.newsletter.listing.util.NewsLetterListingUtil;
import com.liferay.training.newsletter.model.Newsletter;
import com.liferay.training.newsletter.model.NewsletterArticle;
import com.liferay.training.newsletter.service.NewsletterArticleLocalService;
import com.liferay.training.newsletter.service.NewsletterLocalService;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + NewsletterListingPortletKeys.NEWSLETTERLISTING,
		"mvc.command.name=" + MVCCommandNames.SEARCH },
	service = MVCRenderCommand.class
)
public class SearchMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		try {
			preForSearchIndex(renderRequest, renderResponse);
		} catch (PortalException e) {
			if (_log.isInfoEnabled()) {
				_log.info(e.getMessage());
			}
		}

		renderRequest.setAttribute("formater", newsLetterListingUtil.formatDateTimes("MMMM dd yyyy"));

		return "/newsletter/view_search.jsp";
	}

	private void preForSearchIndex(RenderRequest renderRequest, RenderResponse renderResponse) throws PortalException {

		HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(renderRequest);

		String keywords = ParamUtil.getString(httpServletRequest, "keywords");

		SearchContext searchContext = SearchContextFactory.getInstance(httpServletRequest);

		searchContext.setKeywords(keywords);
		searchContext.setAttribute("paginationType", "more");
		searchContext.setStart(0);
		searchContext.setEnd(10);

		Indexer indexerForNewsletter = IndexerRegistryUtil.getIndexer(Newsletter.class);

		Indexer indexerForNewsletterArticle = IndexerRegistryUtil.getIndexer(NewsletterArticle.class);

		Hits hitsForNewsletter = indexerForNewsletter.search(searchContext);

		Hits hitsForNewsletterArticle = indexerForNewsletterArticle.search(searchContext);

		Set<Long> resourcePrimKeys = new LinkedHashSet<Long>();

		if (!searchContext.getKeywords().isEmpty()) {

			for (int i = 0; i < hitsForNewsletter.getDocs().length; i++) {

				Document doc = hitsForNewsletter.doc(i);

				long resourcePrimKey = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

				Newsletter newsletter = null;

				newsletter = newsletterLocalService.getByResourcePrimKey(resourcePrimKey);

				resourcePrimKeys.add(newsletter.getResourcePrimKey());

			}
			for (int i = 0; i < hitsForNewsletterArticle.getDocs().length; i++) {

				Document doc = hitsForNewsletterArticle.doc(i);

				long resourcePrimKey = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

				NewsletterArticle newsletterArticle = null;

				newsletterArticle = newsletterArticleLocalService.getByResourcePrimKey(resourcePrimKey);

				resourcePrimKeys.add(newsletterArticle.getResourcePrimKey());
			}
		}

		renderRequest.setAttribute("keywords", searchContext.getKeywords());
		renderRequest.setAttribute("newsletterResults", _getNewsletterResult(resourcePrimKeys));
	}

	private List<Newsletter> _getNewsletterResult(Set<Long> resourcePrimKeys) {

		List<Newsletter> newsletters = newsLetterListingUtil.getNewsletters();
		List<NewsletterArticle> newsletterArticles = newsLetterListingUtil.getNewsletterArticles();

		List<Newsletter> newsletterResults = new ArrayList<Newsletter>();

		for (Newsletter newsletter : newsletters) {
			if (resourcePrimKeys.contains(newsletter.getResourcePrimKey())) {
				newsletterResults.add(newsletter);
			} else {
				for (NewsletterArticle newsletterArticle : newsletterArticles) {
					if (newsletter.getIssueNumber() == newsletterArticle.getIssueNumber()) {
						if (resourcePrimKeys.contains(newsletterArticle.getResourcePrimKey())) {
							if (!newsletterResults.contains(newsletter)) {
								newsletterResults.add(newsletter);
							}
						}
					}
				}
			}
		}

		return newsletterResults;
	}

	private static Log _log = LogFactoryUtil.getLog(SearchMVCRenderCommand.class);

	@Reference
	NewsLetterListingUtil newsLetterListingUtil;

	@Reference
	NewsletterLocalService newsletterLocalService;

	@Reference
	NewsletterArticleLocalService newsletterArticleLocalService;
}
