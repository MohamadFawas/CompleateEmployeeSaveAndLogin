package com.defect.tracker.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="employeeTable")
public class Employee123 {

		@Id
		@Column(name="employee_id", length=45)
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int employeeid;
		@Column(name="employee_name", length=255)
		private String employeename;
		@Column(name="email1", length=255)
		private String email1;
		@Column(name="password", length=255)
		private String password1;
		
		public Employee123(int employeeid, String employeename, String email1, String password1) {
			super();
			this.employeeid = employeeid;
			this.employeename = employeename;
			this.email1 = email1;
			this.password1 = password1;
		}
		
		@Override
		public String toString() {
			return "Employee123 [employeeid=" + employeeid + ", employeename=" + employeename + ", email1=" + email1
					+ ", password1=" + password1 + "]";
		}

		public Employee123() {
			
		}
		
		
		


}
