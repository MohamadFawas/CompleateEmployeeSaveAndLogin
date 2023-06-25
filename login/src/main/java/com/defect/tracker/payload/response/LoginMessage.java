package com.defect.tracker.payload.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginMessage {
    String message;
    Boolean status;
	public LoginMessage(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
    
    
    
    
    
    

}
