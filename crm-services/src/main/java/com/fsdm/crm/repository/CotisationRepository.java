package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Cotisation;

public interface CotisationRepository extends  JpaRepository<Cotisation,Long>{
	
	Optional <Cotisation> findById(Long idCotisation);
}
