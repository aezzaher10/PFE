package com.fsdm.crm.controller.Classement.view;

import java.time.LocalDate;


import javax.validation.constraints.NotEmpty;


import com.fsdm.crm.entities.Classement;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassementView {

	private Long idClassement;
	@NotEmpty
	private boolean nouveauClassement;
	@NotEmpty
	private int etoile;
	@NotEmpty
	private LocalDate dateClassement;
	@NotEmpty
    private String commentaireClassement;
	@NotEmpty
    private int classOt;
	
	public static ClassementView from(Classement classement) {
		return ClassementView.builder()
				.idClassement(classement.getIdClassement())
				.classOt(classement.getClassOt())
				.commentaireClassement(classement.getCommentaireClassement())
				.dateClassement(classement.getDateClassement())
				.etoile(classement.getEtoile())
				.nouveauClassement(classement.isNouveauClassement())
				.build();
	}
	public static Classement to(ClassementView  classement) {
		return Classement.builder()
				.idClassement(classement.getIdClassement())
				.classOt(classement.getClassOt())
				.commentaireClassement(classement.getCommentaireClassement())
				.dateClassement(classement.getDateClassement())
				.etoile(classement.getEtoile())
				.nouveauClassement(classement.isNouveauClassement())
				.build();
	}

}
