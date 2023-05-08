package com.upasna.spring.boot.Employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.upasna.spring.boot.Employee.model.Employee;
import com.upasna.spring.boot.Employee.repository.EmployeeRepository;
@RequestMapping("/employee")

public class EmployeeController {
	@Autowired
	EmployeeRepository sr;
	@RequestMapping("/details")
	public List<Employee> getEmployee(){
		return sr.findAll();
	}

}
