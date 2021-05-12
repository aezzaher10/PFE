package com.fsdm.crm.controller.Historique;

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

import com.fsdm.crm.controller.Historique.view.HistoriqueUpdateRequestView;
import com.fsdm.crm.controller.Historique.view.HistoriqueView;

@RestController
@RequestMapping( path = "/historique")
public interface HistoriqueController {
	@GetMapping
	@RequestMapping("/find/{idHistorique}")
	@Valid
	@NotNull
	HistoriqueView findHistoriqueById(@PathVariable @NotNull  Long idHistorique); // throws HistoriqueBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	HistoriqueView createHistorique(@RequestBody @NotNull @Valid HistoriqueView historiqueView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateHistorique(@RequestBody HistoriqueUpdateRequestView historiqueUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idHistorique}")
	void deleteHistorique( Long idHistorique);

}
