package com.fsdm.crm.services.immatriculation;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Immatriculation;
import com.fsdm.crm.repository.ImmatriculationRepository;

@Service
public class ImmatriculationServiceImpl implements ImmatriculationService{
@Autowired 
private ImmatriculationRepository immatriculationRepository;
	@Override
	public Optional<Immatriculation> findImmatriculationById(Long idImmatriculation) {
		
		return immatriculationRepository.findById(idImmatriculation);
	}

	@Override
	public Immatriculation createImmatriculation(Immatriculation immatriculation) {
		// TODO Auto-generated method stub
		return immatriculationRepository.save(immatriculation);
	}

	@Override
	public Immatriculation updateImmatriculation(Immatriculation immatriculation) {
		// TODO Auto-generated method stub
		return immatriculationRepository.save(immatriculation);
	}

	@Override
	public void deleteImmatriculation(Long idImmatriculation) {
		immatriculationRepository.deleteById(idImmatriculation);
		
	}

}
