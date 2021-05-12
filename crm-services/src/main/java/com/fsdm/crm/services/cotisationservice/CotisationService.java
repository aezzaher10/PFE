package com.fsdm.crm.services.cotisationservice;


import com.fsdm.crm.entities.Cotisation;



public interface CotisationService {
Cotisation findCotisationById( Long idCotisation);
	
Cotisation createCotisation(Cotisation cotisation);
	
Cotisation updateCotisation(Cotisation cotisation);
	
	void deleteCotisation(Long idCotisation);



}
