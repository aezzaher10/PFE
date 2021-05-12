package com.fsdm.crm.controller.contact;

import org.springframework.beans.factory.annotation.Autowired;

import com.fsdm.crm.controller.contact.view.ContactUpdateRequestView;
import com.fsdm.crm.controller.contact.view.ContactView;

import com.fsdm.crm.entities.Contact;

import com.fsdm.crm.services.contactservice.ContactService;

public class ContactControllerImpl implements ContactController{

	@Autowired 
	private ContactService contactService;
	
	@Override
	public  ContactView findContactById( Long id_Contact) {
		
		return ContactView.from(contactService.findContactById(id_Contact));
	}

	@Override
	public ContactView createContact( ContactView contact) {
		
		
		return ContactView.from(contactService.createContact(ContactView.to(contact)));
	}

	@Override
	public void updateContact(ContactUpdateRequestView contactUpdateRequestView) { 
		
		Contact contact = contactService.findContactById(contactUpdateRequestView.getId_Contact());
		contact.setNom_Societe(contactUpdateRequestView.getNom_Societe());
		contactService.updateContact(contact);
	}

	@Override
	public void deleteContact(Long id_Contact) {
		contactService.deleteContact(id_Contact);
		
	}

}
