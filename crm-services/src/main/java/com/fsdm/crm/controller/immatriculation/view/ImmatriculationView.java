package com.fsdm.crm.controller.immatriculation.view;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.controller.immatriculation.view.ImmatriculationView.ImmatriculationViewBuilder;
import com.fsdm.crm.entities.Immatriculation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImmatriculationView {
	private Long idImmatriculation;
	@NotEmpty
	private String operateurVoyage;
	@NotEmpty
	private String expoilteVoiture;
	@NotEmpty
	private LocalDate dateImmatriculation;
	@NotEmpty
	private String commentaireImmatriculation;
	
	public static  ImmatriculationView from(Immatriculation immatriculation) {
		return ImmatriculationView.builder()
		      .idImmatriculation(immatriculation.getIdImmatriculation())
		      .commentaireImmatriculation(immatriculation.getCommentaireImmatriculation())
		      .dateImmatriculation(immatriculation.getDateImmatriculation())
		      .expoilteVoiture(immatriculation.getExpoilteVoiture())
		      .operateurVoyage(immatriculation.getOperateurVoyage())
		      .build();	
	}
	public static  Immatriculation to(ImmatriculationView immatriculation) {
		return Immatriculation.builder()
		      .idImmatriculation(immatriculation.getIdImmatriculation())
		      .commentaireImmatriculation(immatriculation.getCommentaireImmatriculation())
		      .dateImmatriculation(immatriculation.getDateImmatriculation())
		      .expoilteVoiture(immatriculation.getExpoilteVoiture())
		      .operateurVoyage(immatriculation.getOperateurVoyage())
		      .build();	
	}
}
