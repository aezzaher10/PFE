package com.fsdm.crm.controller.cotisation;

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


import com.fsdm.crm.controller.cotisation.view.CotisationUpdateRequestView;
import com.fsdm.crm.controller.cotisation.view.CotisationView;

@RestController
@RequestMapping(path="/Contact")
public interface CotisationController  {
	@GetMapping
	@RequestMapping("/find/{idCotisation}")
	@Valid
	@NotNull
	CotisationView findCotisationById(@PathVariable @NotNull  Long idCotisation); //throws ContactBusinessException;
	@PostMapping
	
	
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	CotisationView createCotisation(@RequestBody @NotNull @Valid CotisationView CotisationView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateCotisation(@RequestBody CotisationUpdateRequestView CotisationUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idCotisation}")
	void deleteCotisation(@PathVariable Long idCotisation);


}


