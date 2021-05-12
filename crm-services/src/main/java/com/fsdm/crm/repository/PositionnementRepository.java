package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Positionnement;



public interface PositionnementRepository extends JpaRepository<Positionnement,Long>{
	
	Optional <Positionnement> findById(Long idPositionnement);

}
