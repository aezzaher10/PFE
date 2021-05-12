package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Classement;

public interface ClassementRepository extends JpaRepository<Classement,Long>{
	
	Optional <Classement> findById(Long idClassement);

}
