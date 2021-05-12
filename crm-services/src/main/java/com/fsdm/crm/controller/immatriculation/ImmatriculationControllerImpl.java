package com.fsdm.crm.controller.immatriculation;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.codeacces.view.CodeAccesView;
import com.fsdm.crm.controller.immatriculation.view.ImmatriculationUpdateRequestView;
import com.fsdm.crm.controller.immatriculation.view.ImmatriculationView;
import com.fsdm.crm.entities.CodeAcces;
import com.fsdm.crm.entities.Immatriculation;
import com.fsdm.crm.services.immatriculation.ImmatriculationService;
@Component
public class ImmatriculationControllerImpl  implements ImmatriculationController {
@Autowired
private ImmatriculationService immatriculationService;
	@Override
	public @Valid @NotNull ImmatriculationView findImmatriculationById(@NotNull Long idImmatriculation) {
		
		return ImmatriculationView.from(immatriculationService.findImmatriculationById(idImmatriculation));
	}

	@Override
	public ImmatriculationView createImmatriculation(@NotNull @Valid ImmatriculationView immatriculation) {
		// TODO Auto-generated method stub
		return ImmatriculationView.from(immatriculationService.createImmatriculation(ImmatriculationView.to(immatriculation)));
	}

	@Override
	public void updateImmatriculation(ImmatriculationUpdateRequestView immatriculationUpdateRequestView)
			throws Exception {
		Immatriculation immatriculation= immatriculationService.findImmatriculationById(immatriculationUpdateRequestView.getIdImmatriculation());
		immatriculation.setOperateurVoyage(immatriculationUpdateRequestView.getOperateurVoyage());
		immatriculationService.updateImmatriculation(immatriculation);
		
	}

	@Override
	public void deleteImmatriculation(Long idImmatriculation) {
		
		immatriculationService.deleteImmatriculation(idImmatriculation);
	}
	

}
