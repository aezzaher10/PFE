package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Contact;



public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	Optional<Contact> findById(Long id);

}
