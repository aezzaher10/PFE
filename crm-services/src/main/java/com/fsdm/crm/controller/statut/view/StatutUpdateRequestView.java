package com.fsdm.crm.controller.statut.view;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatutUpdateRequestView {
	
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

}
