package com.org.espire.spring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.org.espire.spring.model.Employee;

@Repository
public class EmployeeRepository {

	static HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public EmployeeRepository() {
		empMap.put(1, new Employee(1, "Lavi", "Delhi"));
		empMap.put(2, new Employee(2, "Ro", "GGN"));
		empMap.put(3, new Employee(3, "Jon", "Pune"));
	}

	// get
	public Employee getEmployee(Integer id) {
		return empMap.get(id);
	}

	// get all
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>(empMap.values());
		return list;
	}

	// add
	public Employee addEmployee(Employee emp) {
		empMap.put(emp.getId(), emp);
		return emp;
	}

	// update
	public Employee updateEmployee(Employee emp) {
		empMap.put(emp.getId(), emp);
		return emp;
	}

	// delete
	public Employee deleteEmployee(Integer id) {
		return empMap.remove(id);
	}
}
