package com.fsdm.crm.controller.cotisation.view;

import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Cotisation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CotisationView {

	private Long idCotisation;
	@NotEmpty
	private String profil; 
	@NotEmpty
	private String cotisation;
	@NotEmpty
	private String montant;
	@NotEmpty
	private boolean cotisationAcquitte;
	@NotEmpty
	private boolean cgsSigné;
	@NotEmpty
	private boolean contratConstitufSigne;
	@NotEmpty
	private String commentaireCotisation;

	
	
	public static CotisationView from(Cotisation cotisations) {
		return CotisationView.builder()
				.idCotisation(cotisations.getIdCotisation())
				.cgsSigné(cotisations.isCgsSigné())
				.contratConstitufSigne(cotisations.isContratConstitufSigne())
				.cotisation(cotisations.getCotisation())
				.cotisationAcquitte(cotisations.isCotisationAcquitte())
				.montant(cotisations.getMontant())
				.commentaireCotisation(cotisations.getCommentaireCotisation())
				.profil(cotisations.getProfil())
				.build();
				
	}
	
	public static Cotisation to(CotisationView  cotisations) {
		return Cotisation.builder()
				.idCotisation(cotisations.getIdCotisation())
				.cgsSigné(cotisations.isCgsSigné())
				.contratConstitufSigne(cotisations.isContratConstitufSigne())
				.cotisation(cotisations.getCotisation())
				.cotisationAcquitte(cotisations.isCotisationAcquitte())
				.montant(cotisations.getMontant())
				.commentaireCotisation(cotisations.getCommentaireCotisation())
				.profil(cotisations.getProfil())
				.build();
		
	}
	
}
