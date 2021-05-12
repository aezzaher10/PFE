package com.fsdm.crm.services.adherentservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Adherent;
import com.fsdm.crm.repository.AdherentRepository;

@Service
public class AdherentServiceImpl implements AdherentService {
	@Autowired 
	AdherentRepository adherentRepository;
	
	@Override
	public Adherent createAdherent(Adherent adherent) {
		
		return adherentRepository.save(adherent);
	}

	@Override
	public Adherent updateAdherent(Adherent adherent) {
		
		return adherentRepository.save(adherent);
	}

	@Override
	public void deleteAdherent(Long numAdherent) {
		adherentRepository.deleteById(numAdherent);
		
	}

	@Override
	public Optional<Adherent> findAdherentById(Long numAdherent) {
		
		return adherentRepository.findById(numAdherent);
	}

}
