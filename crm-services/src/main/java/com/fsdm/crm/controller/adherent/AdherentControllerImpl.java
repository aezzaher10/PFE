package com.fsdm.crm.controller.adherent;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.fsdm.crm.controller.adherent.view.AdherentUpdateRequestView;
import com.fsdm.crm.controller.adherent.view.AdherentView;
import com.fsdm.crm.entities.Adherent;
import com.fsdm.crm.services.adherentservice.AdherentService;


public class AdherentControllerImpl implements AdherentController{
@Autowired
private AdherentService adherentService;
	@Override
	public AdherentView findAdherentById(@NotNull Long num_adherent) {
		return AdherentView.from(adherentService.findAdherentById(num_adherent));
		
	}

	@Override
	public AdherentView createAdherent(@NotNull @Valid AdherentView Adherent) {
		
		return  AdherentView.from(adherentService.createAdherent(AdherentView.to(Adherent)));
	}

	@Override
	public void updateAdherent(AdherentUpdateRequestView adherentUpdateRequestView) throws Exception {
		Adherent adherent = adherentService.findAdherentById(adherentUpdateRequestView.getNum_adherent());
		adherent.setChiffre_daffaire(adherentUpdateRequestView.getChiffre_daffaire());
		adherentService.updateAdherent(adherent);

		
	}

	@Override
	public void deleteAdherent(Long num_adherent) {
		
		adherentService.deleteAdherent(num_adherent);
	}



}
