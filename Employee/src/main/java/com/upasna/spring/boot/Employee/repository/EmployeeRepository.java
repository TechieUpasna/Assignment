package com.upasna.spring.boot.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.upasna.spring.boot.Employee.model.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

} 
	
