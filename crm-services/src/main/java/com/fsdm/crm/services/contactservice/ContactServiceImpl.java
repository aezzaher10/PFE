package com.fsdm.crm.services.contactservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Contact;
import com.fsdm.crm.exception.contact.ContactBusinessException;
import com.fsdm.crm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private  ContactRepository contactRepository;
	@Override
	public Contact findContactById(Long id_Contact) {
		
		return contactRepository.findById(id_Contact).orElseThrow(() -> new ContactBusinessException(ContactBusinessException.ContactError.CONTACT_NOT_FOUND)); 
	}

	@Override
	public Contact createSociety(Contact contact) {
		
		return contactRepository.save(contact);
	}

	@Override
	public Contact updateSociety(Contact contact) {
		
		return contactRepository.save(contact);
	}

	
	@Override
	public void DeleteContact(Long id_Contact) {
		
		contactRepository.deleteById(id_Contact);
		
	}



}
