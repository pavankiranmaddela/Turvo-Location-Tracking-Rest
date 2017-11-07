package com.turvo.locationtracking.rest.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turvo.locationtracking.rest.entity.Assert;
import com.turvo.locationtracking.rest.entity.Person;
import com.turvo.locationtracking.rest.repository.TrackingAssertRepository;
import com.turvo.locationtracking.rest.repository.TrackingPersonRepository;
import com.turvo.locationtracking.rest.repository.TrackingRepositoryImpl;



/**
 * The Class TrackingService.
 */
@Service
public class TrackingService {

	/** The assert repository. */
	@Autowired
	TrackingAssertRepository assertRepository;
	
	/** The custom repository impl. */
	@Autowired
	TrackingRepositoryImpl customRepositoryImpl;
	
	/** The person repository. */
	@Autowired
	TrackingPersonRepository personRepository;
	
	
	/**
	 * Gets the assert.
	 *
	 * @param id the id
	 * @return the assert
	 */
	public Assert getAssert(long id) {
		return assertRepository.findOne(id);
	}
	
	/**
	 * Gets the all asserts.
	 *
	 * @return the all asserts
	 */
	public List<Assert> getAllAsserts(){
		return assertRepository.findAll();
	}
	
	/**
	 * Gets the assert by number.
	 *
	 * @param assertNumber the assert number
	 * @param fromDate the from date
	 * @param toDate the to date
	 * @return the assert by number
	 */
	public List<Assert> getAssertByNumber(String assertNumber, Date fromDate, Date toDate) {
		
		if(fromDate!=null&toDate!=null) {
		
			return customRepositoryImpl.getAssertByNumberAndTime(assertNumber, fromDate, toDate);
			
		}
		return null;
		//return assertRepository.findByassertIdentification(assertNumber);
	}
	
	
	/**
	 * Gets the person by id.
	 *
	 * @param personId the person id
	 * @param fromDate the from date
	 * @param toDate the to date
	 * @return the person by id
	 */
	public List<Person> getPersonById(String personId, Date fromDate, Date toDate) {
		
		if(fromDate!=null&toDate!=null) {
			return customRepositoryImpl.getPersonByIdAndTime(personId, fromDate, toDate);
		}
		return null;
		//return personRepository.findBypersonId(personId);
		
	}
	
	/**
	 * Gets the all persons.
	 *
	 * @return the all persons
	 */
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	
	
}
