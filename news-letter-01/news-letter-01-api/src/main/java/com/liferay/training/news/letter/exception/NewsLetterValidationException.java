package com.liferay.training.news.letter.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class NewsLetterValidationException extends PortalException {

	public NewsLetterValidationException() {
	}

	public NewsLetterValidationException(String msg) {
		super(msg);
	}

	public NewsLetterValidationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NewsLetterValidationException(Throwable cause) {
		super(cause);
	}

	private static final long serialVersionUID = 1L;
	
	public static class TitleMustNotBeNull extends NewsLetterValidationException {

		public TitleMustNotBeNull() {
			super("Title must not be null");
		}

	}
	
	public static class DescriptionMustNotBeNull extends NewsLetterValidationException {

		public DescriptionMustNotBeNull() {
			super("Description must not be null");
		}

	}
	
	public static class IssueNumberMustNotBeNull extends NewsLetterValidationException {

		public IssueNumberMustNotBeNull() {
			super("Issue number must not be null");
		}

	}
	
	public static class IssueNumberMustNotBeDuplicate extends NewsLetterValidationException {

		public IssueNumberMustNotBeDuplicate(int issueNumber) {
			super(
				String.format(
					"Title %s must not be duplicate but is already", issueNumber));
			
			this.issueNumber = issueNumber;
		}

		public final int issueNumber;

	}
	
	public static class IssueNumberMustBeANumber extends NewsLetterValidationException {

		public IssueNumberMustBeANumber() {
			super("Issue number must be null a number");
		}

	}
}
