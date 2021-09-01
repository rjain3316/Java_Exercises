package com.luv2code.springboot.crudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.crudDemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	//define field for entitymanager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	public List<Employee> finaAll() {
		//get the current hibernate session
		Session createSession = entityManager.unwrap(Session.class); // session.class to get the hibernate session
		
		//Create a query
		Query<Employee> theQuery = createSession.createQuery("from Employee",Employee.class); // using hibernate native API 
		
		//execute query and get result list
		List<Employee> employee = theQuery.getResultList();
		//return the result
		return employee;
	}

	@Override
	public Employee findByID(int Id) {
		//get the current hibernate session
		Session theSession = entityManager.unwrap(Session.class);
		
		//get the employee
		Employee theEmployee = theSession.get(Employee.class, Id);
		
		//return the employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//save the employee
		currentSession.saveOrUpdate(theEmployee);// If the Id is 0 then save/insert else update
	}

	@Override
	public void deleteByID(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//delete obje with primary Key - query
		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		
	}

}
