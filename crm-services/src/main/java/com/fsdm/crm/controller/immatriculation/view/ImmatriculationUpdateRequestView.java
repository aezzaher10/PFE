package com.fsdm.crm.controller.immatriculation.view;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ImmatriculationUpdateRequestView {
	@NotEmpty
	private Long idImmatriculation;
	@NotEmpty
	private String operateurVoyage;
}
