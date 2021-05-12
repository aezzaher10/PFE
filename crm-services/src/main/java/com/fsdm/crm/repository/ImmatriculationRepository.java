package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Immatriculation;

public interface ImmatriculationRepository  extends JpaRepository <Immatriculation,Long>{
	Optional<Immatriculation> findById( Long idImmatirculation);

}
