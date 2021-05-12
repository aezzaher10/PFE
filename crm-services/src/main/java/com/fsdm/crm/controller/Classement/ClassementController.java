package com.fsdm.crm.controller.Classement;

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

import com.fsdm.crm.controller.Classement.view.ClassementUpdateRequestView;
import com.fsdm.crm.controller.Classement.view.ClassementView;
@RestController
@RequestMapping( path = "/classement")
public interface ClassementController {
	@GetMapping
	@RequestMapping("/find/{idClassement}")
	@Valid
	@NotNull
	ClassementView findClassementById(@PathVariable @NotNull  Long idClassement); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ClassementView createClassement(@RequestBody @NotNull @Valid ClassementView classementView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateClassement(@RequestBody ClassementUpdateRequestView classementUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idClassement}")
	void deleteClassement( Long idClassement);
	
	
}
