package com.fsdm.crm.services.contactservice;



import com.fsdm.crm.entities.Contact;


public interface ContactService {

 
	
    Contact createContact(Contact contact);
	
	Contact updateContact(Contact contact);

	Contact findContactById(Long id_Contact); //throws ContactBusinessException;// import package 

	void deleteContact(Long id_Contact);





	

	
}
