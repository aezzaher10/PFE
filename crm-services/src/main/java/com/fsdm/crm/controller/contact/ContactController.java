package com.fsdm.crm.controller.contact;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsdm.crm.controller.contact.view.ContactUpdateRequestView;
import com.fsdm.crm.controller.contact.view.ContactView;

@RestController
@RequestMapping(path="/Contact")
public interface ContactController {
	@GetMapping
	@RequestMapping("/find/{id_Contact}")
	@Valid
	@NotNull
	ContactView findContactById(@PathVariable @NotNull  Long id); //throws ContactBusinessException;
	@PostMapping
	
	
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ContactView createContact(@RequestBody @NotNull @Valid ContactView ContactView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateContact(@RequestBody ContactUpdateRequestView ContactUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{id_Contact}")
	void deleteContact(@PathVariable Long id_Contact);




}
