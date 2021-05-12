package com.fsdm.crm.services.partenariat;

import java.util.Optional;

import com.fsdm.crm.entities.Partenariat;

public interface PartenariatService {
	Optional<Partenariat> findPartenariatById(Long idPartenariat); //throws SocietyBusinessException;
	
	Partenariat createSociety(Partenariat partenariat);
	
	Partenariat updateSociety(Partenariat partenariat);
	
	void deletePartenariat(Long idPartenariat);
	

}
