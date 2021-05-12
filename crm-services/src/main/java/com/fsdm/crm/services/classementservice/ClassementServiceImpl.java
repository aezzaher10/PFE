package com.fsdm.crm.services.classementservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Classement;
import com.fsdm.crm.repository.ClassementRepository;
@Service
public class ClassementServiceImpl implements ClassementService {
@Autowired
ClassementRepository classmentRepository;
	@Override
	public Optional<Classement> findClassementById(Long idClassement) {
		
		return classmentRepository.findById(idClassement);
	}

	@Override
	public Classement createAClassement(Classement classement) {
		// TODO Auto-generated method stub
		return classmentRepository.save(classement);
	}

	@Override
	public Classement updateClassement(Classement classement) {
		// TODO Auto-generated method stub
		return classmentRepository.save(classement);
	}

	@Override
	public void deleteClassement(Long idClassement) {
		// TODO Auto-generated method stub
		classmentRepository.deleteById(idClassement);
	}

}
