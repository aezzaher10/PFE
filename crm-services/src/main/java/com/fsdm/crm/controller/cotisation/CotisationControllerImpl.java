package com.fsdm.crm.controller.cotisation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.cotisation.view.CotisationUpdateRequestView;
import com.fsdm.crm.controller.cotisation.view.CotisationView;
import com.fsdm.crm.entities.Cotisation;
import com.fsdm.crm.services.cotisationservice.CotisationService;
@Component
public class CotisationControllerImpl implements CotisationController{
@Autowired 
CotisationService cotisationService;
	@Override
	public CotisationView findCotisationById(Long idCotisation) {
		
		return CotisationView.from(cotisationService.findCotisationById(idCotisation));
	}

	@Override
	public CotisationView createCotisation( CotisationView cotisation) {
		
		return CotisationView.from(cotisationService.createCotisation(CotisationView.to(cotisation)));
	}

	@Override
	public void updateCotisation(CotisationUpdateRequestView cotisationRequestView) throws Exception {
		Cotisation cotisaiton =  cotisationService.findCotisationById(cotisationRequestView.getIdCotisation());
		cotisaiton.setCotisation(cotisationRequestView.getCotisation());
		cotisationService.updateCotisation(cotisaiton);
	}

	@Override
	public void deleteCotisation(Long idCotisation) {
		cotisationService.deleteCotisation(idCotisation);
		
	}

}
