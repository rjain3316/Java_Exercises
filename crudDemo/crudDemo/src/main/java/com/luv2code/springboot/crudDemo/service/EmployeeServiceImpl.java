package com.luv2code.springboot.crudDemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.crudDemo.dao.EmployeeDAO;
import com.luv2code.springboot.crudDemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO=theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> finaAll() {
		return employeeDAO.finaAll();
	}

	@Override
	@Transactional
	public Employee findByID(int Id) {
		return employeeDAO.findByID(Id);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteByID(int theId) {
		employeeDAO.deleteByID(theId);

	}

}
