package com.fsdm.crm.services.alerteservice;




import com.fsdm.crm.entities.Alerte;

public interface AlerteService {
Alerte findAlerteById( Long idAlerte);
	
Alerte createAlerte(Alerte alerte);
	
Alerte updateAlerte(Alerte aAlerte);
	
	void deleteAlerte(Long idAlerte);

}
