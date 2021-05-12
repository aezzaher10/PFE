package com.fsdm.crm.controller.adherent.view;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdherentUpdateRequestView {
	@NotNull
	private Long num_adherent;
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
	private String date_ca;
	@NotEmpty
	private String date_creation;
	@NotEmpty
	private String  date_adherent;
	@NotEmpty
	private String tva_inter_communotaire;
	@NotEmpty
	private String type_presentation;

	private String commentaire_adher;
	
}
