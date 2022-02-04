package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

@RestController
public class BookController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@PostMapping("/contact")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addContact(@RequestBody @Valid Contact contact) {
		contactService.addContact(contact);
	}
	@GetMapping("/contact")
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}
	@GetMapping("/contact/{id}")
	public Contact getContactById(@PathVariable(value = "id") int id) {
		return contactRepository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteContact(@PathVariable(value = "id") int id) {
		contactRepository.deleteById(id);
	}
	@PutMapping("/contact/{id}")
	public ResponseEntity<Object> updateContact(@RequestBody Contact contact, @PathVariable int id) {
		Optional<Contact> contactRepo = Optional.ofNullable(contactRepository.findById(id));
		if(!contactRepo.isPresent())
			return ResponseEntity
					.notFound()
					.build();
		contact.setId(id);
		contactRepository.save(contact);
		
		return ResponseEntity
				.noContent()
				.build();
	}

}
