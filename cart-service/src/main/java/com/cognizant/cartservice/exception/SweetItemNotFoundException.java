package com.cognizant.cartservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "SweetItem not found.")
public class SweetItemNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SweetItemNotFoundException() {
		super("SweetItem Id not Available.");
	}
}