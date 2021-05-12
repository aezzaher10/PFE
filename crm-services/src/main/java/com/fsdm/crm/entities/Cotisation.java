package com.fsdm.crm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cotisation {
	
	
	@Id 
	@GeneratedValue
	private Long idCotisation;
	private String profil; 
	private String cotisation;
	private String montant;
	private boolean cotisationAcquitte;
	private boolean cgsSigné;
	private boolean contratConstitufSigne;
	private String commentaireCotisation;

	//@OneToMany;
	}

