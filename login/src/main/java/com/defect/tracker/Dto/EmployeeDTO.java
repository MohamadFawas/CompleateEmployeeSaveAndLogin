package com.defect.tracker.Dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO {
	
	private int employeeid;
	
	private String employeename;
	
	private String email1;
	
	private String password1;
	public EmployeeDTO(int employeeid, String employeename, String email1, String password1) {
		
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email1 = email1;
		this.password1 = password1;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [employeeid=" + employeeid + ", employeename=" + employeename + ", email1=" + email1
				+ ", password1=" + password1 + "]";
	}

	public EmployeeDTO() {
		
	}
	
	
	
	
	

}
