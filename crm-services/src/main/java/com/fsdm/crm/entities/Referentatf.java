package com.fsdm.crm.entities;



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
public class Referentatf {
	@Id
	@GeneratedValue
	private Long idReferent;
	private String referent;
	private String nomReferent;
	private String prenomReferent;
	private String telephone;
	private String email;
	//@OneToOne;

}
