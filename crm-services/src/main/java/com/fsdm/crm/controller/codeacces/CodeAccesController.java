package com.fsdm.crm.controller.codeacces;

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

import com.fsdm.crm.controller.codeacces.view.CodeAccesUpadteRequestView;
import com.fsdm.crm.controller.codeacces.view.CodeAccesView;

@RestController
@RequestMapping( path = "/CodeAcces")
public interface CodeAccesController {
	@GetMapping
	@RequestMapping("/find/{idAcces}")
	@Valid
	@NotNull
	CodeAccesView findCodeAccesById(@PathVariable @NotNull  Long idAcces); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	CodeAccesView createCodeAcces(@RequestBody @NotNull @Valid CodeAccesView codeaccesView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateCodeAcces(@RequestBody CodeAccesUpadteRequestView codeaccesUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idAcces}")
	void deleteCodeAcces( Long idAcces);
}
