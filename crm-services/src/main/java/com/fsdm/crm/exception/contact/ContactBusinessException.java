package com.fsdm.crm.exception.contact;

import com.fsdm.crm.exception.BusinessException;
import com.fsdm.crm.exception.Error;


public class ContactBusinessException extends BusinessException  {
	
	
	public ContactBusinessException(ContactError error) {
		super(error.getMessage(),error);	}


	public enum ContactError implements Error{
		CONTACT_NOT_FOUND;

		@Override
		public String getMessage() {
			
			return this.name();
		}
	}
}



