package com.fsdm.crm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
 
	@Id
	@GeneratedValue
	private Long id_Contact;	
	private String fonction;
	private String mobile;
	private String civilite;
	private String nom_Referent;
	private Boolean adresse_Societe; 
	private String ville_Contact;
	private String pays_Contact;
	private String prenom;
	private String nom;
	private String telephone;
	private String code_Postale;
	private String add1;
	private String add2;
	private String add3;
	private String type_Relation;
	private String type_Contact;
	private String date;
	@OneToOne
	private String nom_Societe;
	


}
