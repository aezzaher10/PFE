package com.fsdm.crm.services.marchescibles;

import java.util.Optional;

import com.fsdm.crm.entities.MarchesCibles;


public interface MarchesCiblesService {
	Optional<MarchesCibles> findMarchesCiblesById(Long idMarchesCibles); //throws BusinessException;
	
	MarchesCibles createMarchesCibles(MarchesCibles marchesCibles);
	
	MarchesCibles updateMarchesCibles(MarchesCibles marchesCibles);
	
	void deleteMarchesCibles(Long idMarchesCibles);
	
}
