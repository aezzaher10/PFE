package com.fsdm.crm.controller.contact.view;

import javax.validation.constraints.NotEmpty;

import com.fsdm.crm.entities.Contact;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	
public class ContactView {
	

 private Long id_Contact;
 @NotEmpty
 private String nom_Societe;
 @NotEmpty	
 private String fonction;
 @NotEmpty
	private String mobile;
 @NotEmpty
	private String civilite;
 @NotEmpty
	private String nom_Referent;
 @NotEmpty
	private Boolean adresse_Societe; 
 @NotEmpty
    private String ville_Contact;
 @NotEmpty
	private String pays_Contact;
 @NotEmpty
	private String prenom;
 @NotEmpty
	private String nom;
 @NotEmpty
	private String telephone;
 @NotEmpty
	private String code_Postale;
 @NotEmpty
	private String add1;
@NotEmpty
	private String type_Contact;
@NotEmpty
	private String date;
@NotEmpty
private String add2;
@NotEmpty
private String add3;
@NotEmpty
private String type_Relation;

public static ContactView from(Contact contact) {
	return ContactView.builder()
			.id_Contact(contact.getId_Contact())
			.nom(contact.getNom())
			.prenom(contact.getPrenom())
			.nom_Societe(contact.getNom_Societe())
			.civilite(contact.getCivilite())
			.telephone(contact.getTelephone())
			.date(contact.getDate())
			.type_Contact(contact.getType_Contact())
			.pays_Contact(contact.getPays_Contact())
			.code_Postale(contact.getCode_Postale())
			.ville_Contact(contact.getVille_Contact())
			.type_Relation(contact.getType_Relation())
			.add1(contact.getAdd1())
			.adresse_Societe(contact.getAdresse_Societe())
			.add2(contact.getAdd2())
			.fonction(contact.getFonction())
			.add3(contact.getAdd3())
			.nom_Referent(contact.getNom_Referent())
			.mobile(contact.getMobile())
			.build();
}

public static Contact to(ContactView contact) {
	
	return Contact.builder()
			.id_Contact(contact.getId_Contact())
			.nom(contact.getNom())
			.prenom(contact.getPrenom())
			.nom_Societe(contact.getNom_Societe())
			.civilite(contact.getCivilite())
			.telephone(contact.getTelephone())
			.date(contact.getDate())
			.type_Contact(contact.getType_Contact())
			.pays_Contact(contact.getPays_Contact())
			.code_Postale(contact.getCode_Postale())
			.ville_Contact(contact.getVille_Contact())
			.type_Relation(contact.getType_Relation())
			.add1(contact.getAdd1())
			.adresse_Societe(contact.getAdresse_Societe())
			.add2(contact.getAdd2())
			.fonction(contact.getFonction())
			.add3(contact.getAdd3())
			.nom_Referent(contact.getNom_Referent())
			.mobile(contact.getMobile())
			.build();
}

}
