package com.example.SpringWithJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public String submitPerson(Person person) {
			personRepo.save(person);
		return "data save successfully";
	}

	public List<Person> getAllPerson() {
		
		return personRepo.findAll();
	}

	public Optional<Person> getPerson(int id) {
		
		return personRepo.findById(id);
	}

	public Person updateProduct(Person person) {
		return personRepo.save(person);
	}

	public String deletePerson(int id) {
	  personRepo.deleteById(id);
	return "Delete Successfully";	
	}
	
}
