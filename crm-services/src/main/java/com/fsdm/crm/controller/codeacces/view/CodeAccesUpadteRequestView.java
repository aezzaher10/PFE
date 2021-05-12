package com.fsdm.crm.controller.codeacces.view;

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
public class CodeAccesUpadteRequestView {
	@NotNull
	private Long idAcess;
	@NotEmpty
	 private LocalDate dateJp;
	 

}
