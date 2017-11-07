package com.turvo.locationtracking.rest.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * The Class Track.
 */
@Document(collection="tracks")
public class Track {


	/** The latitude. */
	private long latitude;
	
	/** The longitude. */
	private long longitude;
	
	/** The speed. */
	private float speed;
	
	/** The location. */
	private String location;
	
	/** The track time. */
	@Indexed
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date trackTime;

	/**
	 * Instantiates a new track.
	 */
	public Track() {
		super();
	}

	/**
	 * Instantiates a new track.
	 *
	 * @param latitude the latitude
	 * @param longitude the longitude
	 * @param speed the speed
	 * @param location the location
	 * @throws ParseException the parse exception
	 */
	public Track(long latitude, long longitude, float speed, String location) throws ParseException {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.location = location;
		this.trackTime=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2017-11-06T13:53:09.145Z");
	}

	
	
	/**
	 * Gets the track time.
	 *
	 * @return the track time
	 */
	public Date getTrackTime() {
		return trackTime;
	}

	/**
	 * Sets the track time.
	 *
	 * @param trackTime the new track time
	 */
	public void setTrackTime(Date trackTime) {
		this.trackTime = trackTime;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public long getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public long getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed.
	 *
	 * @param speed the new speed
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
