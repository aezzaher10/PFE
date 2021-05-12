package com.fsdm.crm.services.statutservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Statut;
import com.fsdm.crm.repository.StatutRepository;
@Service
public class StatutServiceImpl implements StatutService {
@Autowired
private StatutRepository statutRepository;

	@Override
	public Optional<Statut> findStatutById(Long idStatut) {
		
		return statutRepository.findById(idStatut);
	}

	@Override
	public Statut createStatut(Statut statut) {
		
		return statutRepository.save(statut);
	}

	@Override
	public Statut updateStatut(Statut statut) {
		
		return statutRepository.save(statut);
	}

	@Override
	public void deleteStatut(Long idStatut) {
		statutRepository.deleteById(idStatut);
		
	}

}
