package com.fsdm.crm.services.Positionnement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Positionnement;
import com.fsdm.crm.repository.PositionnementRepository;

@Service
public class PositionnementServiceImpl implements PositionnementService{

	@Autowired
	PositionnementRepository positionnementRepository;
	
	@Override
	public Optional<Positionnement> findPositionnementById(Long idPositionnement) {
		
		return positionnementRepository.findById(idPositionnement);//.orElseThrow(() -> new PositionnementBusinessException(PositionnementBusinessException.PositionnementError.POSITIONNEMENT_NOT_FOUND));
	}

	@Override
	public Positionnement createSociety(Positionnement positionnement) {
		
		return  positionnementRepository.save(positionnement);
	}

	@Override
	public Positionnement updatePositionnement(Positionnement positionnement) {
		
		return  positionnementRepository.save(positionnement);
	}

	@Override
	public void deletePositionnement(Long idPositionnement) {
		positionnementRepository.deleteById(idPositionnement);
		
	}

}
