package com.turvo.locationtracking.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turvo.locationtracking.rest.constants.TrackingConstants;
import com.turvo.locationtracking.rest.entity.Assert;
import com.turvo.locationtracking.rest.entity.Person;
import com.turvo.locationtracking.rest.entity.Response;
import com.turvo.locationtracking.rest.exception.VerifierException;
import com.turvo.locationtracking.rest.service.TrackingService;
import static com.turvo.locationtracking.rest.utility.Verifier.verifyNullAndEmptyCollection;

/**
 * The Class TrackingController.
 *
 * @author pavank
 */
@RestController
public class TrackingController {

	/** The tracking service. */
	@Autowired
	TrackingService trackingService;

	/**
	 * Gets the all asserts.
	 *
	 * @return the all asserts
	 */
	@GetMapping("asserts")
	public ResponseEntity<?> getAllAssert() {

		List<Assert> responsList = trackingService.getAllAsserts();
		Response response = new Response();

		try {
			verifyNullAndEmptyCollection(responsList);
		} catch (VerifierException e) {
			response.setMessage(e.getMessage());
			response.setStatus(TrackingConstants.FAILED);
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (responsList.isEmpty()) {
			response.setMessage("No Records found");
			response.setStatus(TrackingConstants.FAILED);
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<Assert>>(responsList, HttpStatus.OK);
	}

	/**
	 * Gets the assert.
	 *
	 * @param assertNumber
	 *            the assert number
	 * @param fromDate
	 *            the from date
	 * @param toDate
	 *            the to date
	 * @return the assert
	 */
	@GetMapping("asserts/{assertNumber}")
	public ResponseEntity<?> getAssert(@PathVariable String assertNumber,
			@RequestParam(value = "fromDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam(value = "toDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate) {
		List<Assert> responseList = trackingService.getAssertByNumber(assertNumber, fromDate, toDate);

		Response response = new Response();
		if (responseList.isEmpty()) {
			response.setMessage("No Asserts found");
			response.setStatus("Failed");
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<Assert>>(responseList, HttpStatus.OK);
	}

	/**
	 * Gets the all persons.
	 *
	 * @return the all persons
	 */
	@GetMapping("persons")
	public ResponseEntity<?> getAllPersons() {

		List<Person> personsResponseList = trackingService.getAllPersons();
		Response response = new Response();
		if (personsResponseList.isEmpty()) {
			response.setMessage("No records found");
			response.setStatus("Failed");
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<List<Person>>(personsResponseList, HttpStatus.OK);
	}

	/**
	 * Gets the user.
	 *
	 * @param personId
	 *            the person id
	 * @param fromDate
	 *            the from date
	 * @param toDate
	 *            the to date
	 * @return the user
	 */
	@GetMapping("/persons/{personId}")
	public ResponseEntity<?> getUser(@PathVariable String personId,
			@RequestParam(value = "fromDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
			@RequestParam(value = "toDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate) {

		List<Person> personResponseList = trackingService.getPersonById(personId, fromDate, toDate);
		Response response = new Response();
		if (personResponseList.isEmpty()) {
			response.setMessage("No records found");
			response.setStatus("Failed");
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Person>>(personResponseList, HttpStatus.OK);
	}

}
