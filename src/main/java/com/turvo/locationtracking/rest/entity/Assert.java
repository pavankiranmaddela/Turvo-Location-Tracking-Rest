package com.turvo.locationtracking.rest.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Assert.
 */
@Document(collection="asserts")
public class Assert {

	/** The id. */
	@Id
	private long id;
	
	/** The assert type. */
	private String assertType;
	
	/** The assert identification. */
	@Indexed
	private String assertIdentification;
	
	
    /** The tracks. */
    private List<Track> tracks;
	
	
	/**
	 * Instantiates a new assert.
	 */
	public Assert() {
		super();
	}

	/**
	 * Instantiates a new assert.
	 *
	 * @param id the id
	 * @param assertType the assert type
	 * @param assertIdentification the assert identification
	 * @param tracks the tracks
	 */
	public Assert(long id, String assertType, String assertIdentification, List<Track> tracks) {
		super();
		this.id = id;
		this.assertType = assertType;
		this.assertIdentification = assertIdentification;
		this.tracks = tracks;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the assert type.
	 *
	 * @return the assert type
	 */
	public String getAssertType() {
		return assertType;
	}

	/**
	 * Sets the assert type.
	 *
	 * @param assertType the new assert type
	 */
	public void setAssertType(String assertType) {
		this.assertType = assertType;
	}

	/**
	 * Gets the assert identification.
	 *
	 * @return the assert identification
	 */
	public String getAssertIdentification() {
		return assertIdentification;
	}

	/**
	 * Sets the assert identification.
	 *
	 * @param assertIdentification the new assert identification
	 */
	public void setAssertIdentification(String assertIdentification) {
		this.assertIdentification = assertIdentification;
	}

	/**
	 * Gets the tracks.
	 *
	 * @return the tracks
	 */
	public List<Track> getTracks() {
		return tracks;
	}

	/**
	 * Sets the tracks.
	 *
	 * @param tracks the new tracks
	 */
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	
	
	
}
