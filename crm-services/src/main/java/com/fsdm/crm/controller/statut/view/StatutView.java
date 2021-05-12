package com.fsdm.crm.controller.statut.view;

import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.entities.Statut;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatutView {
	private Long idStatut;
	@NotEmpty
	private String statut;
	@NotEmpty
	private String sousStatut;
	@NotEmpty
	private String origine;
	@NotEmpty
	private boolean vip;
	@NotEmpty
	private String commentaireStatut;
	
	public static StatutView from(Statut statut) {
		return StatutView.builder()
				
			.idStatut(statut.getIdStatut())
			.commentaireStatut(statut.getCommentaireStatut())	
			.origine(statut.getOrigine())
			.sousStatut(statut.getSousStatut())
			.vip(statut.isVip())
			.statut(statut.getStatut())	
			.build()	
				;
	
	}
	public static Statut to(StatutView statut) {
		return Statut.builder()
				
			.idStatut(statut.getIdStatut())
			.commentaireStatut(statut.getCommentaireStatut())	
			.origine(statut.getOrigine())
			.sousStatut(statut.getSousStatut())
			.vip(statut.isVip())
			.statut(statut.getStatut())	
			.build();
		}
}
