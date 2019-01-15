package com.lbs.re.exception.localized;

public class OperationNotAuthedException extends LocalizedException {

	private static final long serialVersionUID = 1L;

	public OperationNotAuthedException() {
		super("localized.exception.notauthed");
	}

}
