package com.fsdm.crm.controller.Positionnement.view;

import java.time.LocalDate;

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
public class PositionnementUpdateRequestView {
	@NotNull
	private Long idPositionnement;
	@NotEmpty
	private String themePrincipale;
	@NotEmpty
	private LocalDate datePrincipale;
}
