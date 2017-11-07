package com.turvo.locationtracking.rest.sequence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class SequenceId.
 */
@Document(collection = "sequence")
public class SequenceId {

	/** The id. */
	@Id
	private String id;

	/** The seq. */
	private long seq;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the seq.
	 *
	 * @return the seq
	 */
	public long getSeq() {
		return seq;
	}

	/**
	 * Sets the seq.
	 *
	 * @param seq the new seq
	 */
	public void setSeq(long seq) {
		this.seq = seq;
	}

	
	
	
}
