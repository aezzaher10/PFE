package com.fsdm.crm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Society {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String member;
	
	private String commercialName;
	
	private String socialReason;
	
	private String rubrique;
	
	private String rubriqueSiege;
	
	private String subRubrique1;
	
	private String subRubrique2;
	
	private String teritoirre;
	
	private String adresse1;
	
	private String adresse2;
	
	private String adresse3;
	
	private String paysSociete;
	
	private String codePostal;
	
	private String ville;
	
	private String fax;
	
	private String site;
	
	private String adressFacturation;
    @OneToMany(mappedBy="Contact")
    private List<Contact> contact;
}
