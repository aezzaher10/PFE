package com.fsdm.crm.entities;

import java.time.LocalDate;

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
public class Alerte {
	@Id
	@GeneratedValue
	private Long idAlerte;
	private String nomContact;
	private String nomSociete;
	private String statutAlerte;
	private String type;
	private LocalDate dateAlerte;
	private String referentALerte;
	
	//@OneToMany

}
