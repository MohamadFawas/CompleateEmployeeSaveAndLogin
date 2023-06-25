package com.defect.tracker.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.defect.tracker.Entity.Employee123;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee123, Integer> {
	Optional<Employee123> findOneByEmail1AndPassword1(String email1, String password1);
	
	Employee123 findByEmail1(String email1);

	}
