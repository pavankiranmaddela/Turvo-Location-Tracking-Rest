package com.turvo.locationtracking.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.locationtracking.rest.entity.Person;

/**
 * The Interface TrackingPersonRepository.
 */
public interface TrackingPersonRepository extends MongoRepository<Person, Long>{

     /**
      * Find byperson id.
      *
      * @param personId the person id
      * @return the person
      */
     public Person findBypersonId(String personId);
	
}
