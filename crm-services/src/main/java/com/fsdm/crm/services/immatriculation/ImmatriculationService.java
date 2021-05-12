package com.fsdm.crm.services.immatriculation;

import java.util.Optional;

import com.fsdm.crm.entities.Immatriculation;


public interface ImmatriculationService {
	Optional<Immatriculation> findImmatriculationById(Long id); //throws SocietyBusinessException;
	
	Immatriculation createImmatriculation(Immatriculation immatriculation);
	
	Immatriculation updateImmatriculation(Immatriculation immatriculation);
	
	void deleteImmatriculation(Long idImmatriculation);
	

}
