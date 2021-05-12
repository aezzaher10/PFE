package com.fsdm.crm.controller.marchescibles;

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

import com.fsdm.crm.controller.marchescibles.view.MarchesCiblesUpdateRequestView;
import com.fsdm.crm.controller.marchescibles.view.MarchesCiblesView;

@RestController
@RequestMapping( path = "/MarchesCibles")

public interface MarchesCiblesController {
	@GetMapping
	@RequestMapping("/find/{idMarchescibles}")
	@Valid
	@NotNull
	MarchesCiblesView findMarchesCiblesById(@PathVariable @NotNull  Long idMarchescibles); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	MarchesCiblesView createMarchesCibles(@RequestBody @NotNull @Valid MarchesCiblesView marchesciblesView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateMarchesCibles(@RequestBody MarchesCiblesUpdateRequestView marchesciblesUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idMarchesCibles}")
	void deleteCodeAcces( Long idMarchesCibles);

}
