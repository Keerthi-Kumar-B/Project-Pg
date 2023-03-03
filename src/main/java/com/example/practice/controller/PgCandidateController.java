package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.PgCandidate;
import com.example.practice.exception.NodataFoundException;
import com.example.practice.response.ResponseStructure;
import com.example.practice.service.PgService;

@RestController
public class PgCandidateController {
	@Autowired
	private PgService pgserv;

	// insert end point
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseEntity<?> insertdata(@RequestBody PgCandidate cand) {
		ResponseStructure<?> resp = pgserv.insertdata(cand);
		return new ResponseEntity<>(resp, HttpStatus.OK);

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> updatedata(@RequestBody PgCandidate cand) {
		ResponseStructure<?> resp = pgserv.updatedata(cand);
		return new ResponseEntity<>(resp, HttpStatus.OK);

	}

	@RequestMapping(value = "/{canditateId}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteById(@PathVariable int canditateId) {
		ResponseStructure<String> deleteById = pgserv.deleteById(canditateId);
		return new ResponseEntity<>(deleteById, HttpStatus.OK);

	}

	@RequestMapping(value = "/{canditateId}",method = RequestMethod.GET)
	public ResponseEntity<?> getById(@PathVariable int canditateId) {
		
	    ResponseStructure<PgCandidate> id = pgserv.getById(canditateId);
		return new ResponseEntity<>(id, HttpStatus.OK);

	}
	@RequestMapping(value = "/fetchAll",method = RequestMethod.GET)
	public ResponseEntity<?>fetchAll(){
		ResponseStructure<List<PgCandidate>> fetchAll = pgserv.fetchAll();
		return new ResponseEntity<>(fetchAll,HttpStatus.OK);
		
	}
}