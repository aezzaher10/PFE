package com.fsdm.crm.controller.marchescibles.view;

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
public class MarchesCiblesUpdateRequestView {
	@NotNull
	private Long idMarchescibeles;
	@NotEmpty
	private LocalDate dateMc;

}
