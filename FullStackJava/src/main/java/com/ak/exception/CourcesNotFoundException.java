package com.ak.exception;

public class CourcesNotFoundException extends Exception {

	/* Exception without msg */
	public CourcesNotFoundException() {
		super();
	}

	/* Exception with msg */
	public CourcesNotFoundException(String msg) {
		super(msg);
	}
}
