package com.fsdm.crm.services.Positionnement;



import com.fsdm.crm.entities.Positionnement;

public interface PositionnementService {
Positionnement findPositionnementById(Long idPositionnement); //throws
	
Positionnement createPositionnement(Positionnement positionnement);
	
Positionnement updatePositionnement(Positionnement positionnement);
	
	void deletePositionnement(Long idPositionnement);

	

}
