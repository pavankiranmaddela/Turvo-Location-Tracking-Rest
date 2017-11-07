package com.turvo.locationtracking.rest.utility;

import java.util.Collection;
import org.springframework.util.CollectionUtils;

import com.turvo.locationtracking.rest.exception.VerifierException;

/**
 * The Class Verifier.
 */
public class Verifier {

	
	
	/**
	 * Instantiates a new verifier.
	 */
	private Verifier() {
		super();
	}

	/**
	 * Verify null.
	 *
	 * @param verifyObject the verify object
	 * @return true, if successful
	 * @throws VerifierException the verifier exception
	 */
	public static boolean verifyNull(Object verifyObject) throws VerifierException {
		if(verifyObject==null) {
			throw new VerifierException("Object is Null");
		}
		
		return false;
	}
	
	/**
	 * Verify null and empty collection.
	 *
	 * @param collection the collection
	 * @return true, if successful
	 * @throws VerifierException the verifier exception
	 */
	public static boolean verifyNullAndEmptyCollection(Collection<?> collection) throws VerifierException {
		
		verifyNull(collection);
		
		if(CollectionUtils.isEmpty(collection)) {
			throw new VerifierException("collection is Empty");
		}
		
		return false;
	}
	
}
