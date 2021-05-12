package com.fsdm.crm.controller.referentatf.view;

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
public class ReferentatfUpdateRequestView {
	@NotNull
	private Long idReferent;
	@NotEmpty
	private String referent;
	@NotEmpty
	private String nomReferent;
	@NotEmpty
	private String prenomReferent;
	@NotEmpty
	private String telephone;
	@NotEmpty
	private String email;
}
