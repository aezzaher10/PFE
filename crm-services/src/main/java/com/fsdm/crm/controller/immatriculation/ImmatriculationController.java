package com.fsdm.crm.controller.immatriculation;

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

import com.fsdm.crm.controller.immatriculation.view.ImmatriculationUpdateRequestView;
import com.fsdm.crm.controller.immatriculation.view.ImmatriculationView;

@RestController
@RequestMapping( path = "/Immatriculation")

public interface ImmatriculationController {
	@GetMapping
	@RequestMapping("/find/{idImmatriculation}")
	@Valid
	@NotNull
	ImmatriculationView findImmatriculationById(@PathVariable @NotNull  Long idImmatriculation); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ImmatriculationView createImmatriculation(@RequestBody @NotNull @Valid ImmatriculationView immatriculationView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateImmatriculation(@RequestBody ImmatriculationUpdateRequestView immatriculationUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idImmatriculationces}")
	void deleteImmatriculation( Long idImmatriculation);
}
