package com.turvo.locationtracking.rest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.turvo.locationtracking.rest.entity.Assert;
import com.turvo.locationtracking.rest.entity.Person;


/**
 * The Class TrackingRepositoryImpl.
 */
@Repository
public class TrackingRepositoryImpl {

	
	/** The mongo template. */
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	/**
	 * Gets the assert by number and time.
	 *
	 * @param assertNumber the assert number
	 * @param fromDate the from date
	 * @param toDate the to date
	 * @return the assert by number and time
	 */
	public List<Assert> getAssertByNumberAndTime(String assertNumber, Date fromDate, Date toDate) {
		Query assertQuery = new Query().addCriteria(Criteria.where("tracks.trackTime").gt(fromDate).lte(toDate).
				andOperator(Criteria.where("assertIdentification").is(assertNumber)));
         List<Assert> asserts=mongoTemplate.find(assertQuery, Assert.class);
         return asserts;
	}
	
	/**
	 * Gets the person by id and time.
	 *
	 * @param personID the person ID
	 * @param fromDate the from date
	 * @param toDate the to date
	 * @return the person by id and time
	 */
	public List<Person> getPersonByIdAndTime(String personId, Date fromDate, Date toDate) {
		Query personQuery = new Query().addCriteria(Criteria.where("tracks.trackTime").gt(fromDate).lte(toDate).
				andOperator(Criteria.where("personId").is(personId)));
         List<Person> persons=mongoTemplate.find(personQuery, Person.class);
         return persons;
	}
}
