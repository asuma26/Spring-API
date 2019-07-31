package com.airtel.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.airtel.models.Employee;


@Repository("employeeDao")
public class EmployeeDaoImplement implements EmployeeDao{

	
	@Autowired
    private MongoTemplate mongoTemplate;
	
	final String COLLECTION = "EmployeeData";
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return (List <Employee> ) mongoTemplate.findAll(Employee.class);
	}

	@Override
	public Employee getEmployee(String employeeId) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(employeeId));
        return mongoTemplate.findOne(query, Employee.class, this.COLLECTION);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		mongoTemplate.remove(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		mongoTemplate.save(employee);
		
	}

	@Override
	public void createEmployee(Employee employee) {
		mongoTemplate.insert(employee);
		
	}

}
