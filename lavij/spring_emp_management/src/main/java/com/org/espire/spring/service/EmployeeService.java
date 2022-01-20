package com.org.espire.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.espire.spring.model.Employee;
import com.org.espire.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;

	//get
	public Employee getEmployee(Integer id) {
		return empRepo.getEmployee(id);
	}

	//get all
	public List<Employee> getAllEmployee() {
		return empRepo.getAllEmployee();
	}

	//add
	public Employee addEmployee(Employee employee) {
		return empRepo.addEmployee(employee);
	}

	//update
	public Employee updateEmployee(Employee employee) {
		return empRepo.updateEmployee(employee);
	}

	//delete
	public Employee deleteEmployee(Integer id) {
		return empRepo.deleteEmployee(id);
	}
}
