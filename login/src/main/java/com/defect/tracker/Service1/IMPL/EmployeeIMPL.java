package com.defect.tracker.Service1.IMPL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.defect.tracker.Dto.EmployeeDTO;
import com.defect.tracker.Dto.LoginDTO;
import com.defect.tracker.Entity.Employee123;
import com.defect.tracker.Repo.EmployeeRepo;
import com.defect.tracker.Service1.EmployeeService;
import com.defect.tracker.response.LoginResponse;

@Service
public class EmployeeIMPL implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addEmployee123(EmployeeDTO employeeDTO) {
		
		Employee123 employee123=new Employee123(
				employeeDTO.getEmployeeid(),
				employeeDTO.getEmployeename(),
				employeeDTO.getEmail1(),
				this.passwordEncoder.encode(employeeDTO.getPassword1())
				);
		employeeRepo.save(employee123);
		
		return employee123.getEmployeename();
	}
	

	@Override
	public LoginResponse loginEmployee123(LoginDTO loginDTO) {
        String msg = "";
        Employee123 employee123 = employeeRepo.findByEmail1(loginDTO.getEmail1());
        if (employee123 != null) {
            String password1 = loginDTO.getPassword1();
            String encodedPassword1 = employee123.getPassword1();
            Boolean isPwdRight = passwordEncoder.matches(password1, encodedPassword1);
            if (isPwdRight) {
                Optional<Employee123> employee = employeeRepo.findOneByEmail1AndPassword1(loginDTO.getEmail1(), encodedPassword1);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
	}

	

}
