package com.fsdm.crm.services.historiqueservice;



import com.fsdm.crm.entities.Historique;


public interface HistoriqueService {
	Historique findHistoriqueById(Long idHistorique); //throws
	
	Historique createHistorique(Historique historique);
		
	Historique updateHistorique(Historique historique);
		
		void deleteHistorique(Long idHistorique);
}
