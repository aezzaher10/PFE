package com.fsdm.crm.services.historiqueservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Historique;

import com.fsdm.crm.repository.HistoriqueRepository;

@Service
public class HistoriqueServiceImpl implements HistoriqueService {

	@Autowired
	private HistoriqueRepository historiqueRepository;
	@Override
	public Optional<Historique> findHistoriqueById(Long idHistorique) {
		
		return historiqueRepository.findById(idHistorique);//.orElseThrow(() -> new HistoriqueBusinessException(HistoriqueBusinessException.HistoriqueError.HISTORIQUE_NOT_FOUND));
	}

	@Override
	public Historique createHistorique(Historique historique) {
		
		return historiqueRepository.save(historique);
	}

	@Override
	public Historique updateHistorique(Historique historique) {
		
		return  historiqueRepository.save(historique); 
	}

	@Override
	public void deleteHistorique(Long idHistorique) {
		historiqueRepository.deleteById(idHistorique);
		
	}
	

}
