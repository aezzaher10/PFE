package com.fsdm.crm.services.marchescibles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.MarchesCibles;
import com.fsdm.crm.repository.MarchesCiblesRepository;

@Service
public class MarchesCiblesServiceImpl implements  MarchesCiblesService{
@Autowired
private MarchesCiblesRepository marchesciblesRepository;
	@Override
	public Optional<MarchesCibles> findMarchesCiblesById(Long idMarchesCibles) {
		
		return  marchesciblesRepository.findById(idMarchesCibles);
	}

	@Override
	public MarchesCibles createMarchesCibles(MarchesCibles marchesCibles) {
		// TODO Auto-generated method stub
		return  marchesciblesRepository.save(marchesCibles);
	}

	@Override
	public MarchesCibles updateMarchesCibles(MarchesCibles marchesCibles) {
		// TODO Auto-generated method stub
		return  marchesciblesRepository.save(marchesCibles);
	}

	@Override
	public void deleteMarchesCibles(Long idMarchesCibles) {
		 marchesciblesRepository.deleteById(idMarchesCibles);
		
	}

}
