package com.fsdm.crm.services.partenariat;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Partenariat;
import com.fsdm.crm.repository.PartenariatRepository;

@Service
public class PartenariatServiceImpl implements PartenariatService {

	@Autowired 
	private PartenariatRepository partenariatRepositroy;
	@Override
	public Optional<Partenariat> findPartenariatById(Long idPartenariat) {
		
		return partenariatRepositroy.findById(idPartenariat);
	}

	@Override
	public Partenariat createSociety(Partenariat partenariat) {
		// TODO Auto-generated method stub
		return partenariatRepositroy.save(partenariat);
	}

	@Override
	public Partenariat updateSociety(Partenariat partenariat) {
		// TODO Auto-generated method stub
		return partenariatRepositroy.save(partenariat);
	}

	@Override
	public void deletePartenariat(Long idPartenariat) {
		partenariatRepositroy.deleteById(idPartenariat);
		
	}
	
	

}
