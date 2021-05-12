package com.fsdm.crm.exception.adherent;


import com.fsdm.crm.exception.BusinessException;
import com.fsdm.crm.exception.Error;
import lombok.Data;

@Data
public class AdherentBusinessException extends BusinessException{


	
	public AdherentBusinessException(AdherentError error) {
		super( error.getMessage(),error);	}


	public enum AdherentError implements Error{
		ADHERENT_NOT_FOUND;

		@Override
		public String getMessage() {
			
			return this.name();
		}
	}
}
