package com.fsdm.crm.controller.statut;

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

import com.fsdm.crm.controller.statut.view.StatutUpdateRequestView;
import com.fsdm.crm.controller.statut.view.StatutView;



@RestController
@RequestMapping( path = "/statut" )
public interface StatutController {
	@GetMapping
	@RequestMapping("/find/{idStatut}")
	@Valid
	@NotNull
	StatutView findStatutById(@PathVariable @NotNull  Long idStatut);
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	StatutView createStatut(@RequestBody @NotNull @Valid StatutView statutView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateStatut(@RequestBody StatutUpdateRequestView statutUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	void deleteStatut(@PathVariable Long idStatut);

}
