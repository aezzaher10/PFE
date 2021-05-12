package com.fsdm.crm.controller.referentatf.view;

import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Referentatf;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReferentatfView {

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
	
	public static ReferentatfView from(Referentatf referentatf) {
		return ReferentatfView.builder()
        .idReferent(referentatf.getIdReferent())
        .email(referentatf.getEmail())
        .nomReferent(referentatf.getNomReferent())
        .prenomReferent(referentatf.getPrenomReferent())
        .referent(referentatf.getReferent())
        .telephone(referentatf.getTelephone())
        .build();
}
	public static Referentatf to(ReferentatfView referentatf) {
		return Referentatf.builder()
        .idReferent(referentatf.getIdReferent())
        .email(referentatf.getEmail())
        .nomReferent(referentatf.getNomReferent())
        .prenomReferent(referentatf.getPrenomReferent())
        .referent(referentatf.getReferent())
        .telephone(referentatf.getTelephone())
        .build();
}	
}
