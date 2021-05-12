package com.fsdm.crm.controller.Alerte;

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

import com.fsdm.crm.controller.Alerte.view.AlerteUpdateRequestView;
import com.fsdm.crm.controller.Alerte.view.AlerteView;


public interface AlerteController {

	@GetMapping
	@RequestMapping("/find/{idAlerte}")
	@Valid
	@NotNull
	AlerteView findAlerteById(@PathVariable @NotNull  Long idAlerte); //throws AlerteBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	AlerteView createAlerte(@RequestBody @NotNull @Valid AlerteView alerteView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateAlerte(@RequestBody AlerteUpdateRequestView AlerteUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	void deleteAlerte(@PathVariable Long idAlerte);
}
