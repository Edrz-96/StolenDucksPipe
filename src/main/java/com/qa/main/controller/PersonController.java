package com.qa.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.domain.Person;
import com.qa.main.service.PersonService;

@RequestMapping("/person")
@RestController
public class PersonController {

	@Autowired
	private PersonService service;

//	@RequestMapping: Class level request config
//	@GetMapping : 	Fetching data FROM a database "@RequestMapping(method = RequestMethod.GET)."
//	@PostMapping: 	Send data TO the database
//	@DeleteMapping: Remove data from the database
//	@PutMapping: 	Replace an existing RECORD in a database
//	@PatchMapping: 	Partially update a RECORD in a database
//	@RequestBody : 	Get information from the USER
//	@PathVariable:  Template holder for a value that we get from the USER

	@GetMapping("/hello")
	public String testmyRequest() {
		return "Hello everyone";
	}

	@GetMapping("/newPerson")
	public Person testPerson() {
		return new Person("Bob", "Bobson");
	}

	// create
	@PostMapping("/create")
	public ResponseEntity<Person> create(@RequestBody Person p) {
		return new ResponseEntity<Person>(this.service.create(p), HttpStatus.CREATED);
	}

	// read
	@GetMapping("/read")
	public ResponseEntity<List<Person>> read() {
		return new ResponseEntity<List<Person>>(this.service.readPeople(), HttpStatus.OK);

	}

	// update
	@PutMapping("/update/{id}")
	public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person p) {
		return new ResponseEntity<Person>(this.service.update(id, p), HttpStatus.ACCEPTED);

	}

	// delete

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);

	}

}
