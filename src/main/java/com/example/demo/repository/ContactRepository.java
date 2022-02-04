package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
	Contact findById(int id);
	List<Contact> findAll();
	void deleteById(int id);

}
