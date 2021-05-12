package com.fsdm.crm.controller.Positionnement;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.fsdm.crm.controller.Positionnement.view.PositionnementUpdateRequestView;
import com.fsdm.crm.controller.Positionnement.view.PositionnementView;
import com.fsdm.crm.entities.Positionnement;
import com.fsdm.crm.services.Positionnement.PositionnementService;
@Component
public class PositionnementControllerImpl implements PositionnementController {

	@Autowired 
	private PositionnementService positionnementService;
	@Override
	public @Valid @NotNull PositionnementView findPositionnementById(@NotNull Long idPositionnement) {
		// TODO Auto-generated method stub
		return PositionnementView.from(positionnementService.findPositionnementById(idPositionnement));
	}

	@Override
	public PositionnementView createPositionnement(@NotNull @Valid PositionnementView positionnement) {
		// TODO Auto-generated method stub
		return PositionnementView.from(positionnementService.createPositionnement(PositionnementView.to(positionnement)));
	}

	@Override
	public void updatePositionnement(PositionnementUpdateRequestView positionnementRequestView) throws Exception {
		Positionnement positionnement = positionnementService.findPositionnementById(positionnementRequestView.getIdPositionnement());
		positionnement.setDatePrincipale( positionnementRequestView.getDatePrincipale());
		positionnementService.updatePositionnement(positionnement);
		
	}

	@Override
	public void deletePositionnement(Long idPositionnement) {
		positionnementService.deletePositionnement(idPositionnement);

		
	}

}
