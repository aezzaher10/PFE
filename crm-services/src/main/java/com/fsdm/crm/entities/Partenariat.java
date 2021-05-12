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
public class Partenariat {
	@Id 
	@GeneratedValue
	private  Long idPartenariat;
	private String rang;
	private Long montantPart;
	private int membrePrivilége;
	private String commmentairePart;
	private String convention;
	private String objet;
	private LocalDate signeLe;
	

}
