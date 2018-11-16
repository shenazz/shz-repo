/**
 * 
 */
package com.shz.starter.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shz.starter.model.MotorBike;
import com.shz.starter.model.TestMessage;
import com.shz.starter.repo.IMotorBikeRepo;

/**
 * @author shenaz
 *
 */
@RestController
public class TestController {

	@Autowired
	IMotorBikeRepo motorBikeRepo;

	private final AtomicLong counter = new AtomicLong();

	/**
	 * @return
	 */
	@RequestMapping(path = "/testme", method = RequestMethod.GET)
	public ResponseEntity<TestMessage> testMe(@RequestParam(value = "msg", defaultValue = "Hello World") String message) {
		return new ResponseEntity<>(new TestMessage(counter.incrementAndGet(), message), HttpStatus.OK);
	}

	/**
	 * @return
	 */
	@RequestMapping(path = "/createbike", method = RequestMethod.POST)
	public ResponseEntity<String> createBike(@RequestBody MotorBike motorBike) {
		return new ResponseEntity<>(motorBikeRepo.save(motorBike).getId(), HttpStatus.OK);
	}

	/**
	 * @return
	 */
	@RequestMapping(path = "/getbikes", method = RequestMethod.GET)
	public ResponseEntity<List<MotorBike>> getBikes(@RequestParam(value = "manufacturer") String manufacturer) {
		return new ResponseEntity<>(motorBikeRepo.findByManufacturer(manufacturer), HttpStatus.OK);
	}

	/**
	 * @return
	 */
	@RequestMapping(path = "/getallbikes", method = RequestMethod.GET)
	public ResponseEntity<List<MotorBike>> getAllBikes() {
		return new ResponseEntity<>(motorBikeRepo.findAll(), HttpStatus.OK);
	}
}
