package com.fsdm.crm.repository;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent,Long>{
	
	Optional <Adherent> findById(Long numAdherent);

}


