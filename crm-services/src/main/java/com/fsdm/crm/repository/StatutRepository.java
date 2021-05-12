package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fsdm.crm.entities.Statut;

public interface StatutRepository extends JpaRepository<Statut,Long> {

	Optional <Statut> findById(Long idStatut);
}
