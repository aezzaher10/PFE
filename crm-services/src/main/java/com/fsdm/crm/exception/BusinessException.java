package com.fsdm.crm.exception;


import com.fsdm.crm.exception.adherent.AdherentBusinessException.AdherentError;
import com.fsdm.crm.exception.contact.ContactBusinessException.ContactError;
import com.fsdm.crm.exception.society.SocietyBusinessException.SocietyError;

import lombok.Data;





@Data

public abstract class BusinessException extends RuntimeException {
	
	public BusinessException(String message, SocietyError error2) {}


	
	public BusinessException(String message, AdherentError error2) {}



	public BusinessException(String message, ContactError error2) {}



	private String code;
	private Error error;
	
}
