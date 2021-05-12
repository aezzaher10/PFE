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
public class Historique {
	@Id
	@GeneratedValue
	private Long idHistorique;
	private LocalDate dateHistorique;
	private String ancienneValeur;
	private String nouvelleeValeur;
	private String formulaire;
	private String champ;
	private String utilisateur;
	private String lien;
	
	//@OneToOne

}
