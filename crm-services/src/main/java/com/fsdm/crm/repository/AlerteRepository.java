package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Alerte;
public interface AlerteRepository extends JpaRepository<Alerte,Long> {
	Optional <Alerte> findById(Long idAlerte);

}
