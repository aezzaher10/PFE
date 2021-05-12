package com.fsdm.crm.services.classementservice;



import com.fsdm.crm.entities.Classement;



public interface ClassementService {
Classement findClassementById( Long idClassement);
	
Classement createClassement(Classement classement);
	
Classement updateClassement(Classement classement);
	
	void deleteClassement(Long idClassement);
}
