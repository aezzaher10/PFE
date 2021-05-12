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
public class Classement {
	@Id 
	@GeneratedValue
	private Long idClassement;
	private boolean nouveauClassement;
	private int etoile;
	private LocalDate dateClassement;
    private String commentaireClassement;
    private int classOt;
}
