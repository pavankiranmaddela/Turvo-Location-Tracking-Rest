package com.turvo.locationtracking.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.turvo.locationtracking.rest.entity.Assert;
import com.turvo.locationtracking.rest.entity.Person;
import com.turvo.locationtracking.rest.entity.Track;
import com.turvo.locationtracking.rest.repository.TrackingAssertRepository;
import com.turvo.locationtracking.rest.repository.TrackingPersonRepository;
import com.turvo.locationtracking.rest.sequence.PersonIdSequence;
import com.turvo.locationtracking.rest.sequence.SequenceDaoImpl;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Filters.elemMatch;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;





/**
 * The Class TurvoLocationTrackingRestApplication.
 *
 * @author pavank
 */
@SpringBootApplication
public class TurvoLocationTrackingRestApplication {

	/** The assert repository. */
	@Autowired
	TrackingAssertRepository assertRepository;
	
	/** The person repository. */
	@Autowired
	TrackingPersonRepository personRepository;
	
	/** The mongo template. */
	@Autowired
	MongoTemplate mongoTemplate;
	
	/** The sequence dao impl. */
	@Autowired
	SequenceDaoImpl sequenceDaoImpl;
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(TurvoLocationTrackingRestApplication.class, args);
	}
	
}
