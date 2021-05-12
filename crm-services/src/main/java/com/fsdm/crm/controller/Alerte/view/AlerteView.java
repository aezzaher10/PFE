package com.fsdm.crm.controller.Alerte.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Alerte;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlerteView {

	private Long idAlerte;
	@NotEmpty
	private String nomContact;
	@NotEmpty
	private String nomSociete;
	@NotEmpty
	private String statutAlerte;
	@NotEmpty
	private String type;
	@NotEmpty
	private LocalDate dateAlerte;
	@NotEmpty
	private String referentALerte;
	
	public static AlerteView from(Alerte alerte) {
		return AlerteView.builder()
		.idAlerte(alerte.getIdAlerte())
		.dateAlerte(alerte.getDateAlerte())
		.nomContact(alerte.getNomContact())
		.statutAlerte(alerte.getNomContact())
		.type(alerte.getType())
		.referentALerte(alerte.getReferentALerte())
		.build();
		
	}
	public static Alerte to(AlerteView alerte) {
		return Alerte.builder()
		.idAlerte(alerte.getIdAlerte())
		.dateAlerte(alerte.getDateAlerte())
		.nomContact(alerte.getNomContact())
		.statutAlerte(alerte.getNomContact())
		.type(alerte.getType())
		.referentALerte(alerte.getReferentALerte())
		.build();
		
	}

}
