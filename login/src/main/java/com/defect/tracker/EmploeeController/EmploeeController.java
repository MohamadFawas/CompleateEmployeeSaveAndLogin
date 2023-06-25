package com.defect.tracker.EmploeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.Dto.EmployeeDTO;
import com.defect.tracker.Dto.LoginDTO;
import com.defect.tracker.Service1.EmployeeService;
import com.defect.tracker.response.LoginResponse;

@RestController
@CrossOrigin
@RequestMapping("pi/v/employee123")
public class EmploeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path="/save")
	public String saveEmploee123(@RequestBody EmployeeDTO employeeDTO ) {
		employeeService.addEmployee123(employeeDTO);
		return "successfully data added";
		
//		 String id = employeeService.addEmployee123(employeeDTO);
//	        return id;
//		
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?> loginEmployee123(@RequestBody LoginDTO loginDTO){
		LoginResponse loginResponse =employeeService.loginEmployee123(loginDTO);
				
		return ResponseEntity.ok(loginResponse);
		
	}

}
