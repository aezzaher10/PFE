package com.fsdm.crm.services.cotisationservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Cotisation;
import com.fsdm.crm.repository.CotisationRepository;
@Service
public class CotisationServiceImpl implements  CotisationService{
@Autowired
CotisationRepository cotisationRepository;
	@Override
	public Optional<Cotisation> findCotisationById(Long idCotisation) {
		// TODO Auto-generated method stub
		return cotisationRepository.findById(idCotisation);
	}

	@Override
	public Cotisation createCotisation(Cotisation cotisation) {
		// TODO Auto-generated method stub
		return cotisationRepository.save(cotisation);
	}

	@Override
	public Cotisation updateCotisation(Cotisation cotisation) {
		// TODO Auto-generated method stub
		return cotisationRepository.save(cotisation);
	}

	@Override
	public void deleteCotisation(Long idCotisation) {
		// TODO Auto-generated method stub
		cotisationRepository.deleteById(idCotisation);
		
	}

}
