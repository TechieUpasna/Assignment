package com.upasna.spring.boot.Employee;

import org.springframework.boot.SpringApplication;
importorg.springframework.beans.factory.annotation.Autowired;
importorg.springframework.boot.CommandLineRunner;
importorg.springframework.boot.SpringApplication;
importorg.springframework.boot.autoconfigure.SpringBootApplication;
import com.upasna.spring.boot.Employee.model.Employee;
import com.upasna.spring.boot.Employee.repository.EmployeeRepository;
@SpringBootApplication

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
