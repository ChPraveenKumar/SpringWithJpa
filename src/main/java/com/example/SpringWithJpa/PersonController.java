package com.example.SpringWithJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	@Autowired
	private PersonRepo repo;
	
	@PostMapping("/submit")
	public String submitPerson(@RequestBody Person person) {
		
		//return personService.submitPerson(person);
		//Is it come data in controller?
		repo.save(person);
		return "data saved sucessfully";
	}
	@GetMapping("/getAll")
	public List<Person> getAllPersons(){
		return personService.getAllPerson();
		
	}
	@GetMapping("/getPerson/{personId}")
	public @ResponseBody Optional<Person> getPerson(@PathVariable int personId) {
		return personService.getPerson(personId);
		
	}
	@PutMapping("/update")
	public Person updatePerson(@RequestBody Person person) {
		return personService.updateProduct(person);
	}
	@DeleteMapping("/delete/{personId}")
	public @ResponseBody String deletePerson(@PathVariable("personId") int id) {
		return personService.deletePerson(id);
	}
}

