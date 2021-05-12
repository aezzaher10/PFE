package com.fsdm.crm.services.referentatfservice;



import com.fsdm.crm.entities.Referentatf;



public interface ReferentatfService {

Referentatf findReferentatfById( Long idReferentatf);
	
Referentatf createReferentatf(Referentatf referentatf);
	
Referentatf updateReferentatf(Referentatf referentatf);
	
	void deleteReferentatf(Long idReferentatf);
}
