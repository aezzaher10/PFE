package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Partenariat;

public interface PartenariatRepository  extends JpaRepository <Partenariat,Long>{
	Optional<Partenariat> findById(Long idPartenariat);

}
