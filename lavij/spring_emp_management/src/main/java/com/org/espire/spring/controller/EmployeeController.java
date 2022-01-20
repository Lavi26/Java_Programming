package com.org.espire.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.espire.spring.model.Employee;
import com.org.espire.spring.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	// get
	@GetMapping("/getEmployeeById/{id}")
	Employee getEmployee(@PathVariable("id") Integer id) {
		return empService.getEmployee(id);
	}
	
	//get all
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
	List<Employee> list = empService.getAllEmployee();
	return list;
	}

	// add
	@PostMapping("/addEmployeeDetails")
	Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	// update
	@PutMapping("/updateEmployeeDetails/{id}")
	Employee updateEmployee(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}

	// delete
	@DeleteMapping("/deleteEmployeeById/{id}")
	Employee deleteEmployee(@PathVariable("id") Integer id) {
		return empService.deleteEmployee(id);
	}

}
