package com.fsdm.crm.controller.contact.view;

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
public class ContactUpdateRequestView {
	@NotNull
	private Long id_Contact;
	
	@NotEmpty
	private String telephone;
	@NotEmpty
	private String nom_Societe;
	

	@NotEmpty
	private String type_Contact;
	@NotEmpty
	private String add1;
	 @NotEmpty
	    private String ville_Contact;
	 @NotEmpty
	    private String mobile;
}
