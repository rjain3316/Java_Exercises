package com.luv2code.springboot.crudDemo.rest;

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

import com.luv2code.springboot.crudDemo.entity.Employee;
import com.luv2code.springboot.crudDemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	//private EmployeeDAO employeeDAO;
	//inject employee DAO
	
	/*
	 * public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
	 * employeeDAO=theEmployeeDAO; }
	 */
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService=theEmployeeService;
	}

	//expose"/employees" and return list of employee
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.finaAll();
	}
	
	//get method to get emp by ID
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee theemployee =employeeService.findByID(employeeId);
		if(theemployee == null) 
		{
			throw new RuntimeException();
		}
		return theemployee;
	}

	//post method to aad emo
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		employeeService.save(theEmployee);
		return theEmployee;
	}
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
		@DeleteMapping("/employees/{employeeId}")
		public String deleteEmployee(@PathVariable int employeeId) {
			Employee theEmployee =employeeService.findByID(employeeId);
			
			if(theEmployee ==null) {
				throw new RuntimeException("Employee not present "+employeeId);
			}
			employeeService.deleteByID(employeeId);
			return "deleted "+employeeId;
		}
}
