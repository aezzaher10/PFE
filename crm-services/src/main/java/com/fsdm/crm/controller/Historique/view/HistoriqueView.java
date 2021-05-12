package com.fsdm.crm.controller.Historique.view;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Historique;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoriqueView {
	private Long idHistorique;
	@NotEmpty
	private LocalDate dateHistorique;
	@NotEmpty
	private String ancienneValeur;
	@NotEmpty
	private String nouvelleeValeur;
	@NotEmpty
	private String formulaire;
	@NotEmpty
	private String champ;
	@NotEmpty
	private String utilisateur;
	private String lien;
	
	public static HistoriqueView from(Historique historique) {
		return HistoriqueView.builder()
				.idHistorique(historique.getIdHistorique())
				.ancienneValeur(historique.getAncienneValeur())
				.champ(historique.getChamp())
				.dateHistorique(historique.getDateHistorique())
				.nouvelleeValeur(historique.getNouvelleeValeur())
				.lien(historique.getLien())
				.utilisateur(historique.getUtilisateur())
				.build();
				
				
				}
	public static Historique to(HistoriqueView historique) {
		return  Historique.builder()
				.idHistorique(historique.getIdHistorique())
				.ancienneValeur(historique.getAncienneValeur())
				.champ(historique.getChamp())
				.dateHistorique(historique.getDateHistorique())
				.nouvelleeValeur(historique.getNouvelleeValeur())
				.lien(historique.getLien())
				.utilisateur(historique.getUtilisateur())
				.build();}
	

}
