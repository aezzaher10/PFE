package com.fsdm.crm.services.adherentservice;



import java.util.Optional;

import com.fsdm.crm.entities.Adherent;

public interface AdherentService {
	
	Optional<Adherent> findAdherentById( Long numAdherent);
	
	Adherent createAdherent(Adherent adherent);
	
	Adherent updateAdherent(Adherent adherent);
	
	void deleteAdherent(Long numdAdherent);

	

	
	
}
