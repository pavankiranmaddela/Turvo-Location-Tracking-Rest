package com.turvo.locationtracking.rest.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Person.
 */
@Document(collection="persons")
public class Person {

	/** The id. */
	@Id
	private long id;
	
	/** The person id. */
	@Indexed
	private String personId;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The vechicle number. */
	private String vechicleNumber;
	
	/** The tracks. */
	private List<Track> tracks;

	/**
	 * Instantiates a new person.
	 */
	public Person() {
		super();
	}

	/**
	 * Instantiates a new person.
	 *
	 * @param id the id
	 * @param personID the person ID
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param vechicleNumber the vechicle number
	 * @param tracks the tracks
	 */
	public Person(long id,String personID, String firstName, String lastName, String vechicleNumber, List<Track> tracks) {
		super();
		this.id=id;
		this.personId = personID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vechicleNumber = vechicleNumber;
		this.tracks = tracks;
	}
	
	

	/**
	 * Gets the person id.
	 *
	 * @return the person id
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * Sets the person id.
	 *
	 * @param personId the new person id
	 */
	public void setPersonId(String personId) {
		this.personId = personId;
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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the vechicle number.
	 *
	 * @return the vechicle number
	 */
	public String getVechicleNumber() {
		return vechicleNumber;
	}

	/**
	 * Sets the vechicle number.
	 *
	 * @param vechicleNumber the new vechicle number
	 */
	public void setVechicleNumber(String vechicleNumber) {
		this.vechicleNumber = vechicleNumber;
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
