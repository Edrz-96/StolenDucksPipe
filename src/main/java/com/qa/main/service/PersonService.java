package com.qa.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.main.domain.Person;
import com.qa.main.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo repo;

	public PersonService(PersonRepo repo) {
		this.repo = repo;
	}

	// create
	public Person create(Person p) {
		return this.repo.saveAndFlush(p);
	}

	// read
	public List<Person> readPeople() {
		List<Person> list = Arrays.asList(new Person("Bob", "Bobson"), new Person("Jim", "Jimson"));
		return list;
	}
	

	// update
	public Person update(Long id, Person p) {
		Person exists = this.repo.getById(id);
		exists.setFirstName(p.getFirstName());
		exists.setLastName(p.getLastName());
		return this.repo.save(exists);

	}

	// delete
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}

}
