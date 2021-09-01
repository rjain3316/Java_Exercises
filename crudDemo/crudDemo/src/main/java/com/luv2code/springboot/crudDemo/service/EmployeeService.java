package com.luv2code.springboot.crudDemo.service;

import java.util.List;

import com.luv2code.springboot.crudDemo.entity.Employee;

public interface EmployeeService {
	

	public List<Employee> finaAll();
	
	public Employee findByID(int Id);
	
	public void save(Employee theEmployee);
	
	public void deleteByID(int theId);

}
