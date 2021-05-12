package com.fsdm.crm.controller.referentatf;

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

import com.fsdm.crm.controller.referentatf.view.ReferentatfUpdateRequestView;
import com.fsdm.crm.controller.referentatf.view.ReferentatfView;



@RestController
@RequestMapping( path = "/referentatf" )
public interface ReferentatfController
{
	@GetMapping
	@RequestMapping("/find/{idReferentatf}")
	@Valid
	@NotNull
	ReferentatfView findReferentatfById(@PathVariable @NotNull  Long idReferentatf); //throws SocietyBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ReferentatfView createReferentatf(@RequestBody @NotNull @Valid ReferentatfView referentatfView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateReferentatf(@RequestBody ReferentatfUpdateRequestView referentatfUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{idReferentatf}")
	void deleteReferentatf(@PathVariable Long idReferentatf);

}
