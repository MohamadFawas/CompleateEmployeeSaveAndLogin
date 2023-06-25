package com.defect.tracker.Service1;

import com.defect.tracker.Dto.EmployeeDTO;
import com.defect.tracker.Dto.LoginDTO;
import com.defect.tracker.response.LoginResponse;
//import com.defect.tracker.EmploeeController.LoginMessage;

public interface EmployeeService {

	String addEmployee123(EmployeeDTO employeeDTO);

	LoginResponse loginEmployee123(LoginDTO loginDTO);
	
	
}


