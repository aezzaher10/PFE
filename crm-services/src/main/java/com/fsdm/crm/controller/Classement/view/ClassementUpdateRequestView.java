package com.fsdm.crm.controller.Classement.view;

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
public class ClassementUpdateRequestView {
	@NotNull
	private Long idClassement;
	@NotEmpty
	private LocalDate dateClassement;
	

}
