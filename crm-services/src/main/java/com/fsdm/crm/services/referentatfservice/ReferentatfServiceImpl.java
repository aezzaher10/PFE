package com.fsdm.crm.services.referentatfservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Referentatf;
import com.fsdm.crm.repository.ReferentatfRepository;
@Service
public class ReferentatfServiceImpl implements ReferentatfService {
@Autowired
ReferentatfRepository referentatfRepository;
	@Override
	public Optional<Referentatf> findReferentatfById(Long idReferentatf) {
		// TODO Auto-generated method stub
		referentatfRepository.deleteById(idReferentatf);
		return null;
	}

	@Override
	public Referentatf createReferentatf(Referentatf referentatf) {
		// TODO Auto-generated method stub
		referentatfRepository.save(referentatf);
		return null;
	}

	@Override
	public Referentatf updateReferentatf(Referentatf referentatf) {
		// TODO Auto-generated method stub
		referentatfRepository.save(referentatf);
		return null;
	}

	@Override
	public void deleteReferentatf(Long idReferentatf) {
		// TODO Auto-generated method stub
		referentatfRepository.deleteById(idReferentatf);
	}

}
