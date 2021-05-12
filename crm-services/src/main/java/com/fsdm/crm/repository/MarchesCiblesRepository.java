package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.MarchesCibles;

public interface MarchesCiblesRepository extends JpaRepository<MarchesCibles,Long>{
	Optional <MarchesCibles> findById(Long idMarchesCibles);
}
