package com.fsdm.crm.controller.codeacces.view;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.entities.CodeAcces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CodeAccesView {

	private Long idAcess;
	@NotEmpty
    private String loginJp;
	@NotEmpty
    private String passJp;
	@NotEmpty
    private String clusters;
	@NotEmpty
    private LocalDate dateJp;
	
	public static  CodeAccesView from(CodeAcces codeacces) {
		return CodeAccesView.builder()
				.dateJp(codeacces.getDateJp())
				.idAcess(codeacces.getIdAcess())
				.clusters(codeacces.getClusters())
				.loginJp(codeacces.getLoginJp())
				.passJp(codeacces.getPassJp())
				.build();
				
	}
	public static  CodeAcces to(CodeAccesView codeacces) {
		return  CodeAcces.builder()
				.idAcess(codeacces.getIdAcess())
				.clusters(codeacces.getClusters())
				.dateJp(codeacces.getDateJp())
				.passJp(codeacces.getPassJp())
                .loginJp(codeacces.getLoginJp())
                .build();
	}
}
