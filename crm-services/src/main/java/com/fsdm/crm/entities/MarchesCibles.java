package com.fsdm.crm.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarchesCibles {
	@Id 
	@GeneratedValue
	private Long idMarchescibles;
	private String prioritaire;
	private LocalDate dateMc;
	private String secondiare;
	private String commentaireMc;
	private String nonTravaille;
	
	//@OneToMany;
}
