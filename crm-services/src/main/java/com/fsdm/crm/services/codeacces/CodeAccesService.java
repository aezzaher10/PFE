package com.fsdm.crm.services.codeacces;

import java.util.Optional;

import com.fsdm.crm.entities.CodeAcces;


public interface CodeAccesService {
	Optional<CodeAcces> findCodeAccesById(Long idCodeAcces); //throws SocietyBusinessException;
	
	CodeAcces createCodeAcces(CodeAcces codeAcces);
	
	CodeAcces updateCodeAcces(CodeAcces codeAcces);
	
	void deleteCodeAcces(Long idCodeAcces);
	

}
