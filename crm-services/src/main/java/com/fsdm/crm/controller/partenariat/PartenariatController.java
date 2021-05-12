package com.fsdm.crm.controller.partenariat;

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

import com.fsdm.crm.controller.partenariat.view.PartenariatUpdateRequestView;
import com.fsdm.crm.controller.partenariat.view.PartenariatView;


@RestController
@RequestMapping( path = "/partenariat" )

public interface PartenariatController {
	@GetMapping
	@RequestMapping("/find/{idSPartenariat}")
	@Valid
	@NotNull
	PartenariatView findStatutById(@PathVariable @NotNull  Long idPartenariat);
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	PartenariatView createPartenariat(@RequestBody @NotNull @Valid PartenariatView partenariatView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updatePartenariat(@RequestBody PartenariatUpdateRequestView partenariatUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	void deletePartenariat(@PathVariable Long idPartenariat);
	
}
