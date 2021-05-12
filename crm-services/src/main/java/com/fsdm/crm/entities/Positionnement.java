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
public class Positionnement {
	@Id
	@GeneratedValue
	private Long idPositionnement;
	private String themePrincipale;
	private LocalDate datePrincipale;
	private String commentaireThemeprincipale;
	private String positionnementProduit;
	private String segmentClientprioritaire;
	private String commmentairePositionnement;
	private LocalDate datePostionnementprodDate;
	private String themeSecondaire;
	private String commentaireSecondaire;
	private String profilClient;
	private String segementClientsecondaire;
	private LocalDate dateSecondaire;
	private String description;

	//@OneToMany
}
