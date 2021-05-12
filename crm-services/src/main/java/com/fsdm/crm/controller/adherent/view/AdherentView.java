package com.fsdm.crm.controller.adherent.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Adherent;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdherentView {
	
	private Long numAdherent;
	@NotEmpty
    private String college;
	@NotEmpty
	private String motifAdhesion;
	@NotEmpty
	private String chiffre_daffaire;
	@NotEmpty
	private String capitale_sociale;
	@NotEmpty
	private boolean adhesion_provisoir;
	@NotEmpty
	private String motif;
	@NotEmpty
	private int   nombre_collaborateur;
	@NotEmpty
	private String siret;
	@NotEmpty
	private String enquete_donne;
	@NotEmpty
	private String code_comptable;
	@NotEmpty
	private String code_APE;
	@NotEmpty
	private String clusters;
	@NotEmpty
	private String forme_juridique;
	@NotEmpty
	private LocalDate date_ca;
	@NotEmpty
	private LocalDate date_creation;
	@NotEmpty
	private String tva_inter_communotaire;
	@NotEmpty
	private String type_presentation;
	@NotEmpty
	private LocalDate date_adherent;
	
	private String commentaire_adher;
	
	public static AdherentView from(Adherent adherent) {
		
		return AdherentView.builder()
		.numAdherent(adherent.getNumAdherent())
		.date_adherent(adherent.getDate_adherent())
		.commentaire_adher(adherent.getCommentaire_adher())
		.type_presentation(adherent.getType_presentation())
		.tva_inter_communotaire(adherent.getTva_inter_communotaire())
		.date_creation(adherent.getDate_creation())
	    .date_ca(adherent.getDate_ca())
		.forme_juridique(adherent.getForme_juridique())
		.clusters(adherent.getClusters())
		.adhesion_provisoir(adherent.isAdhesion_provisoir())
		.capitale_sociale(adherent.getCapitale_sociale())
		.motifAdhesion(adherent.getMotifAdhesion())
		.college(adherent.getCollege())
		.chiffre_daffaire(adherent.getChiffre_daffaire())
		.motif(adherent.getMotif())
		.nombre_collaborateur(adherent.getNombre_collaborateur())
		.siret(adherent.getSiret())
		.enquete_donne(adherent.getEnquete_donne())
		.code_comptable(adherent.getCode_comptable())
		.code_APE(adherent.getCode_APE())
		
	.build();
		
		
      }

	public static Adherent to( AdherentView adherent) {
		
		return 	Adherent.builder()
				.numAdherent(adherent.getNumAdherent())
				.date_adherent(adherent.getDate_adherent())
				.commentaire_adher(adherent.getCommentaire_adher())
				.type_presentation(adherent.getType_presentation())
				.tva_inter_communotaire(adherent.getTva_inter_communotaire())
				.date_creation(adherent.getDate_creation())
			    .date_ca(adherent.getDate_ca())
				.forme_juridique(adherent.getForme_juridique())
				.clusters(adherent.getClusters())
				.adhesion_provisoir(adherent.isAdhesion_provisoir())
				.capitale_sociale(adherent.getCapitale_sociale())
				.motifAdhesion(adherent.getMotifAdhesion())
				.college(adherent.getCollege())
				.chiffre_daffaire(adherent.getChiffre_daffaire())
				.motif(adherent.getMotif())
				.nombre_collaborateur(adherent.getNombre_collaborateur())
				.siret(adherent.getSiret())
				.enquete_donne(adherent.getEnquete_donne())
				.code_comptable(adherent.getCode_comptable())
				.code_APE(adherent.getCode_APE())
			.build();
	}
	
	}
