package com.fsdm.crm.controller.partenariat.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Partenariat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PartenariatView {
	private  Long idPartenariat;
	@NotEmpty
	private String rang;
	@NotEmpty
	private Long montantPart;
	@NotEmpty
	private int membrePrivilége;
	@NotEmpty
	private String commmentairePart;
	@NotEmpty
	private String convention;
	@NotEmpty
	private String objet;
	@NotEmpty
	private LocalDate signeLe;
	public static PartenariatView from(Partenariat partenariat) {
		return PartenariatView.builder()
				.commmentairePart(partenariat.getCommmentairePart())
				.convention(partenariat.getConvention())
				.idPartenariat(partenariat.getIdPartenariat())
				.membrePrivilége(partenariat.getMembrePrivilége())
				.montantPart(partenariat.getMontantPart())
				.objet(partenariat.getObjet())
				.rang(partenariat.getRang())
				.signeLe(partenariat.getSigneLe())
				.build();
		
	}
	public static Partenariat to(PartenariatView partenariat) {
		return  Partenariat.builder()
				.commmentairePart(partenariat.getCommmentairePart())
				.convention(partenariat.getConvention())
				.idPartenariat(partenariat.getIdPartenariat())
				.membrePrivilége(partenariat.getMembrePrivilége())
				.montantPart(partenariat.getMontantPart())
				.objet(partenariat.getObjet())
				.rang(partenariat.getRang())
				.signeLe(partenariat.getSigneLe())
				.build();
				
	}

}
