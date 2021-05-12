package com.fsdm.crm.controller.Historique;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.Historique.view.HistoriqueUpdateRequestView;
import com.fsdm.crm.controller.Historique.view.HistoriqueView;

import com.fsdm.crm.entities.Historique;
import com.fsdm.crm.services.historiqueservice.HistoriqueService;
@Component
public class HistoriqueControllerImpl implements HistoriqueController{
@Autowired
private HistoriqueService historiqueServcie;
	@Override
	public @Valid @NotNull HistoriqueView findHistoriqueById(@NotNull Long idHistorique) {
		
		return HistoriqueView.from(historiqueServcie.findHistoriqueById(idHistorique));
	}

	@Override
	public HistoriqueView createHistorique(@NotNull @Valid HistoriqueView historique) {
		// TODO Auto-generated method stub
		return HistoriqueView.from(historiqueServcie.createHistorique(HistoriqueView.to(historique)));
	}

	@Override
	public void updateHistorique(HistoriqueUpdateRequestView historiqueRequestView) throws Exception {
		Historique historique = historiqueServcie.findHistoriqueById(historiqueRequestView.getIdHistorique());
		historique.setFormulaire(historiqueRequestView.getFormulaire());
		historiqueServcie.updateHistorique(historique);
		
	}

	@Override
	public void deleteHistorique(Long idHistorique) {
		historiqueServcie.deleteHistorique(idHistorique);
		
	}

}
