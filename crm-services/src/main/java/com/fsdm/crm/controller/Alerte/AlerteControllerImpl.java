package com.fsdm.crm.controller.Alerte;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.Alerte.view.AlerteUpdateRequestView;
import com.fsdm.crm.controller.Alerte.view.AlerteView;
import com.fsdm.crm.entities.Alerte;
import com.fsdm.crm.services.alerteservice.AlerteService;
@Component
public class AlerteControllerImpl implements AlerteController {
	@Autowired
	private  AlerteService  alerteService;
	@Override
	public  AlerteView findAlerteById(Long idAlerte){// throws SocietyBusinessException {
		return  AlerteView.from(alerteService.findAlerteById(idAlerte));
	}

	@Override
	public  AlerteView createAlerte(AlerteView  alerte) {
		return  AlerteView.from(alerteService.createAlerte(AlerteView.to(alerte)));
	}

	@Override
	public void updateAlerte( AlerteUpdateRequestView  alerteRequestView) throws Exception {
		 Alerte alerte =  alerteService.findAlerteById(alerteRequestView.getIdAlerte());
		 alerte.setNomSociete(alerteRequestView.getNomSociete());
		 alerteService.updateAlerte( alerte);
	}

	@Override
	public void deleteAlerte(Long idAlerte){
		 alerteService.deleteAlerte(idAlerte);
	

	}	
}
