package com.fsdm.crm.controller.statut;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.fsdm.crm.controller.statut.view.StatutUpdateRequestView;
import com.fsdm.crm.controller.statut.view.StatutView;
import com.fsdm.crm.entities.Statut;
import com.fsdm.crm.services.statutservice.StatutService;

@Component
public class StatutControlerImpl implements StatutController{

	@Autowired
	private StatutService statutService;
	
	@Override
	public @Valid @NotNull StatutView findStatutById( Long idStatut) {
		
		return StatutView.from(statutService.findStatutById(idStatut));
	}

	@Override
	public StatutView createStatut( StatutView statut) {
		
		return StatutView.from(statutService.createStatut(StatutView.to(statut)));
	}

	@Override
	public void updateStatut(StatutUpdateRequestView statutUpdateRequestView) throws Exception {
		Statut statut = statutService.findStatutById(statutUpdateRequestView.getIdStatut());
		statut.setStatut(statutUpdateRequestView.getStatut());
		statutService.updateStatut(statut);
		
	}

	@Override
	public void deleteStatut(Long idStatut) {
		statutService.deleteStatut(idStatut);
		
		
	}
	

}
