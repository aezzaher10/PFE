package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.CodeAcces;

public interface CodeAccesRepository extends JpaRepository <CodeAcces, Long> {
	Optional <CodeAcces> findById( Long idCodeAcess);

}
