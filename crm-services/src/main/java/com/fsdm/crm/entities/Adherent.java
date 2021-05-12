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
public class Adherent {
	@Id
	@GeneratedValue
	private Long numAdherent;
	private String college;
	private String motifAdhesion;
	private String chiffre_daffaire;
	private String capitale_sociale;
	private boolean adhesion_provisoir;
	private String motif;
	private int   nombre_collaborateur;
	private String siret;
	private String enquete_donne;
	private String code_comptable;
	private String code_APE;
	private String clusters;
	private String forme_juridique;
	private LocalDate  date_ca;
	private LocalDate  date_creation;
	private LocalDate   date_adherent;
	private String tva_inter_communotaire;
	private String type_presentation;
	private String commentaire_adher;
	//@OneToOne

   
}
