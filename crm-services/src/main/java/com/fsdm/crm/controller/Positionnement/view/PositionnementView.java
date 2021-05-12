package com.fsdm.crm.controller.Positionnement.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Positionnement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PositionnementView {
	
	private Long idPositionnement;
	@NotEmpty
	private String themePrincipale;
	@NotEmpty
	private LocalDate datePrincipale;
	@NotEmpty
	private String commentaireThemeprincipale;
	@NotEmpty
	private String positionnementProduit;
	@NotEmpty
	private String segmentClientprioritaire;
	@NotEmpty
	private String commmentairePositionnement;
	@NotEmpty
	private LocalDate datePostionnementprodDate;
	@NotEmpty
	private String themeSecondaire;
	@NotEmpty
	private String commentaireSecondaire;
	@NotEmpty
	private String profilClient;
	@NotEmpty
	private String segementClientsecondaire;
	@NotEmpty
	private LocalDate dateSecondaire;
	private String description;
	public static PositionnementView from(Positionnement  positionnement ) 
	{
		return  PositionnementView.builder()
				.idPositionnement(positionnement.getIdPositionnement())
				.commentaireSecondaire(positionnement.getCommentaireSecondaire())
				.commentaireThemeprincipale(positionnement.getCommentaireThemeprincipale())
				.commmentairePositionnement(positionnement.getCommmentairePositionnement())
				.datePostionnementprodDate(positionnement.getDatePostionnementprodDate())
				.datePrincipale(positionnement.getDatePrincipale())
				.dateSecondaire(positionnement.getDateSecondaire())
				.description(positionnement.getDescription())
				.positionnementProduit(positionnement.getPositionnementProduit())
				.profilClient(positionnement.getProfilClient())
				.segementClientsecondaire(positionnement.getSegementClientsecondaire())
				.segmentClientprioritaire(positionnement.getSegmentClientprioritaire())
				.themePrincipale(positionnement.getThemePrincipale())
				.themeSecondaire(positionnement.getThemeSecondaire())
				.build();
	}
	public static Positionnement to(PositionnementView positionnement ) {
		return Positionnement.builder()
				.idPositionnement(positionnement.getIdPositionnement())
				.commentaireSecondaire(positionnement.getCommentaireSecondaire())
				.commentaireThemeprincipale(positionnement.getCommentaireThemeprincipale())
				.commmentairePositionnement(positionnement.getCommmentairePositionnement())
				.datePostionnementprodDate(positionnement.getDatePostionnementprodDate())
				.datePrincipale(positionnement.getDatePrincipale())
				.dateSecondaire(positionnement.getDateSecondaire())
				.description(positionnement.getDescription())
				.positionnementProduit(positionnement.getPositionnementProduit())
				.profilClient(positionnement.getProfilClient())
				.segementClientsecondaire(positionnement.getSegementClientsecondaire())
				.segmentClientprioritaire(positionnement.getSegmentClientprioritaire())
				.themePrincipale(positionnement.getThemePrincipale())
				.themeSecondaire(positionnement.getThemeSecondaire())
				.build();
	}

}
