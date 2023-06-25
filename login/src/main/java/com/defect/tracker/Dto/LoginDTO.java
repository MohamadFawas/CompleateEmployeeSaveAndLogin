package com.defect.tracker.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
	private String email1;
	private String password1;

	public LoginDTO(String email, String password) {
		super();
		this.email1 = email;
		this.password1 = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [email=" + email1 + ", password=" + password1 + "]";
	}

	public LoginDTO() {
		super();
	}

}
