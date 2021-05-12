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
public class Immatriculation {
	@Id 
	@GeneratedValue
	private Long idImmatriculation;
	private String operateurVoyage;
	private String expoilteVoiture;
	private LocalDate dateImmatriculation;
	private String commentaireImmatriculation;
	//@OneToOne;

}
