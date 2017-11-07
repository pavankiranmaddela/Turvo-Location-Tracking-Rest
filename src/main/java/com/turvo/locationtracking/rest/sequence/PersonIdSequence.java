package com.turvo.locationtracking.rest.sequence;

/**
 * The Class PersonIdSequence.
 */
public class PersonIdSequence {
	
	/**
	 * Gets the next sequence.
	 *
	 * @return the next sequence
	 */
	public static long getNextSequence() {
		SequenceDaoImpl daoImpl=new SequenceDaoImpl();
		
		return daoImpl.getNextSequenceId("personid");
	}
}
