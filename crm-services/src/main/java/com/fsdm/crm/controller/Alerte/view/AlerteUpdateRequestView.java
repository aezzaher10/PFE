package com.fsdm.crm.controller.Alerte.view;

import java.time.LocalDate;

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
public class AlerteUpdateRequestView {
    @NotNull
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
}
