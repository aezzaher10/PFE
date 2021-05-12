package com.fsdm.crm.controller.marchescibles.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.entities.MarchesCibles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarchesCiblesView {
	private Long idMarchescibeles;
	@NotEmpty
	private String prioritaire;
	@NotEmpty
	private LocalDate dateMc;
	@NotEmpty
	private String secondiare;
	@NotEmpty
	private String commentaireMc;
	@NotEmpty
	private String nonTravaille;
	
	public static  MarchesCiblesView from(MarchesCibles marchescibles) {
		return  MarchesCiblesView.builder()
				.idMarchescibeles(marchescibles.getIdMarchescibles())
				.commentaireMc(marchescibles.getCommentaireMc())
				.dateMc(marchescibles.getDateMc())
				.nonTravaille(marchescibles.getNonTravaille())
				.prioritaire(marchescibles.getPrioritaire())
				.secondiare(marchescibles.getSecondiare())
				.build();
	}
	public static  MarchesCibles to(MarchesCiblesView marchescibles) {
		return  MarchesCibles.builder()
				.idMarchescibles(marchescibles.getIdMarchescibeles())
				.commentaireMc(marchescibles.getCommentaireMc())
				.dateMc(marchescibles.getDateMc())
				.nonTravaille(marchescibles.getNonTravaille())
				.prioritaire(marchescibles.getPrioritaire())
				.secondiare(marchescibles.getSecondiare())
				.build();
}
}
