package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Referentatf;

public interface ReferentatfRepository extends JpaRepository<Referentatf,Long>{
	Optional <Referentatf> findById(Long idReferentatf);
}
