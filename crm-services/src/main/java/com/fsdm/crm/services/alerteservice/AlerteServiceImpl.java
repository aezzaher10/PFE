package com.fsdm.crm.services.alerteservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Alerte;
import com.fsdm.crm.repository.AlerteRepository;

@Service
public class AlerteServiceImpl implements AlerteService{

	@Autowired 
	AlerteRepository alerteRepository;
	@Override
	public Optional<Alerte> findAlerteById(Long idAlerte) {
	
		return alerteRepository.findById(idAlerte);
	}

	@Override
	public Alerte createAlerte(Alerte alerte) {
		
		return alerteRepository.save(alerte);
	}

	@Override
	public Alerte updateAlerte(Alerte alerte) {
		
		return alerteRepository.save(alerte);
	}

	@Override
	public void deleteAlerte(Long idAlerte) {
		alerteRepository.deleteById(idAlerte);
		
	}

}
