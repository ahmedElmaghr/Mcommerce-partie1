package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.METHOD_NOT_ALLOWED)
public class ProduitGratuitException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ProduitGratuitException() {
		super();
	}

	public ProduitGratuitException(String message) {
		super(message);
	}

	public ProduitGratuitException(Throwable cause) {
		super(cause);
	}

}
