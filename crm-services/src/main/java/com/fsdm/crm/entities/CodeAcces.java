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
public class CodeAcces {
	@Id 
	@GeneratedValue
	private Long idAcess;
    private String loginJp;
    private String passJp;
    private String clusters;
    private LocalDate dateJp;

}
