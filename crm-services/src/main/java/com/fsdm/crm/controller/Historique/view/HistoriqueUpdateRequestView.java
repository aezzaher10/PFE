package com.fsdm.crm.controller.Historique.view;


import javax.persistence.Entity;
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
public class HistoriqueUpdateRequestView {
	@NotNull
	private Long idHistorique;
	@NotEmpty
	private String formulaire;
}
