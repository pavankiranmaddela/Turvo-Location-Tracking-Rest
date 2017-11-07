package com.turvo.locationtracking.rest.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.locationtracking.rest.entity.Assert;

/**
 * The Interface TrackingAssertRepository.
 */
public interface  TrackingAssertRepository extends MongoRepository<Assert, Long>{

	/**
	 * Find byassert identification.
	 *
	 * @param assertIdentification the assert identification
	 * @return the assert
	 */
	public Assert findByassertIdentification(String assertIdentification);
	
	}
