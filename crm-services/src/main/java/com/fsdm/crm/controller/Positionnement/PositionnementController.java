package com.fsdm.crm.controller.Positionnement;

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

import com.fsdm.crm.controller.Positionnement.view.PositionnementUpdateRequestView;
import com.fsdm.crm.controller.Positionnement.view.PositionnementView;

@RestController
@RequestMapping( path = "/Positionnement")
public interface PositionnementController {
	@GetMapping
	@RequestMapping("/find/{idPositionnement}")
	@Valid
	@NotNull
	PositionnementView findPositionnementById(@PathVariable @NotNull  Long idPositionnement); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	PositionnementView createPositionnement(@RequestBody @NotNull @Valid PositionnementView historiqueView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updatePositionnement(@RequestBody PositionnementUpdateRequestView positionnementUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idPositionnement}")
	void deletePositionnement( Long idPositionnement);

}
