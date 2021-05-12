package com.fsdm.crm.controller.society.view;


import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.entities.Society;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocietyView {
	
	
	private Long id;
	
	@NotEmpty
	private String member;
	
	@NotEmpty
	private String commercialName;
	
	@NotEmpty
	private String socialReason;
	
	@NotEmpty
	private String rubrique;
	
	@NotEmpty
	private String rubriqueSiege;
	
	private String subRubrique1;
	
	private String subRubrique2;
	
	private String teritoirre;
	
    private String adresse1;
	
	private String adresse2;
	
	private String adresse3;
	
	private String paysSociete;
	
	private String codePostal;
	
	private String ville;
	
	private String fax;
	
	private String site;
	
	private String adressFacturation;
	
	
	public static SocietyView from(Society society) {
		return SocietyView.builder()
				.id(society.getId())
				.commercialName(society.getCommercialName())
				.member(society.getMember())
				.rubrique(society.getRubrique())
				.rubriqueSiege(society.getRubriqueSiege())
				.socialReason(society.getSocialReason())
				.subRubrique1(society.getSubRubrique1())
				.subRubrique2(society.getSubRubrique2())
				.teritoirre(society.getTeritoirre())
				.adresse1(society.getAdresse1())
				.adresse2(society.getAdresse2())
				.adresse3(society.getAdresse3())
				.paysSociete(society.getPaysSociete())
				.codePostal(society.getCodePostal())
				.ville(society.getVille())
				.fax(society.getFax())
				.site(society.getSite())
				.adressFacturation(society.getAdressFacturation())
			
				.build();
	}


	public static Society to(SocietyView society) {
		
		return Society.builder()
		.commercialName(society.getCommercialName())
		.member(society.getMember())
		.rubrique(society.getRubrique())
		.rubriqueSiege(society.getRubriqueSiege())
		.socialReason(society.getSocialReason())
		.subRubrique1(society.getSubRubrique1())
		.subRubrique2(society.getSubRubrique2())
		.teritoirre(society.getTeritoirre())
		.adresse1(society.getAdresse1())
		.adresse2(society.getAdresse2())
		.adresse3(society.getAdresse3())
		.paysSociete(society.getPaysSociete())
		.codePostal(society.getCodePostal())
		.ville(society.getVille())
		.fax(society.getFax())
		.site(society.getSite())
		.adressFacturation(society.getAdressFacturation())
		.build();
	}

}
