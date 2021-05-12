package com.fsdm.crm.services.statutservice;


import java.util.Optional;

import com.fsdm.crm.entities.Statut;


public interface StatutService {
Statut findStatutById(Long idStatut);
	
	Statut createStatut(Statut statut);
	
	Statut updateStatut(Statut statut);
	
	void deleteStatut(Long idStatut);
	
}
