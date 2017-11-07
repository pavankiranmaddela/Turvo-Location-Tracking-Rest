package com.turvo.locationtracking.rest.exception;

/**
 * The Class TrackingException.
 */
public class TrackingException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	
	/** The message. */
	private String message;

	/**
	 * Instantiates a new tracking exception.
	 *
	 * @param message the message
	 */
	public TrackingException(String message) {
		super();
		this.message = message;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}



	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}



	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "TrackingException [message=" + message + "]";
	}
	
	
	
	
}
