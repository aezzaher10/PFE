package com.fsdm.crm.controller.partenariat.view;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fsdm.crm.entities.Partenariat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartenariatUpdateRequestView {
	@NotNull
	private  Long idPartenariat;
	@NotEmpty
	private LocalDate signeLe;
}
