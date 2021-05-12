package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Historique;

public interface HistoriqueRepository extends  JpaRepository <Historique,Long>{
	
 Optional <Historique> findById(Long idHistorique);
}
