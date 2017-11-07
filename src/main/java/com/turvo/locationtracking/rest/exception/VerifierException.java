package com.turvo.locationtracking.rest.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class VerifierException.
 */
public class VerifierException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	

	/** The message. */
	private String message;

	/**
	 * Instantiates a new verifier exception.
	 *
	 * @param message the message
	 */
	public VerifierException(String message) {
		super();
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "VerifierException [message=" + message + "]";
	}	

	
	
}
