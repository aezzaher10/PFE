package com.fsdm.crm.services.codeacces;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.CodeAcces;
import com.fsdm.crm.repository.CodeAccesRepository;

@Service
public class CodeAccesServiceImpl implements CodeAccesService  {
@Autowired
private CodeAccesRepository codeAccesRepository;
	@Override
	public Optional<CodeAcces> findCodeAccesById(Long idCodeAcces) {
		
		return codeAccesRepository.findById(idCodeAcces);
	}

	@Override
	public CodeAcces createCodeAcces(CodeAcces codeAcces) {
		
		return codeAccesRepository.save(codeAcces);
	}

	@Override
	public CodeAcces updateCodeAcces(CodeAcces codeAcces) {
		// TODO Auto-generated method stub
		return codeAccesRepository.save(codeAcces);
	}

	@Override
	public void deleteCodeAcces(Long idCodeAcces) {
		codeAccesRepository.deleteById(idCodeAcces);
		
	}

}
