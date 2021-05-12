package com.fsdm.crm.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Statut {
	@Id
	@GeneratedValue
	private Long idStatut;
	private String statut;
	private String sousStatut;
	private String origine;
	private boolean vip;
	private String commentaireStatut;
	
	@OneToMany
	private List<Society> society;
	

}
