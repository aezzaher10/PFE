package com.fsdm.crm.controller.adherent;

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

import com.fsdm.crm.controller.adherent.view.AdherentUpdateRequestView;
import com.fsdm.crm.controller.adherent.view.AdherentView;



public interface AdherentController {
	@GetMapping
	@RequestMapping("/find/{num_adherent}")
	@Valid
	@NotNull
	AdherentView findAdherentById(@PathVariable @NotNull  Long num_adherent); //throws AdherentBusinessException;
	@PostMapping
	
	
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	AdherentView createAdherent(@RequestBody @NotNull @Valid AdherentView AdherentView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateAdherent(@RequestBody AdherentUpdateRequestView AdherentUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{num_adherent}")
	void deleteAdherent(@PathVariable Long num_adherent);

}
