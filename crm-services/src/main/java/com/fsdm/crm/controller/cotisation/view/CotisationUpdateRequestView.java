package com.fsdm.crm.controller.cotisation.view;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CotisationUpdateRequestView {
    @NotNull
	private Long idCotisation;
    @NotEmpty
	private String cotisation;
}
