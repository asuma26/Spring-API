package com.airtel.dao;

import java.util.List;

import com.airtel.models.Employee;

public interface EmployeeDao {

	
	public List<Employee> getEmployees();
	public Employee getEmployee(String employeeId);
	public void deleteEmployee(Employee employee); 
	public void updateEmployee(Employee employee);
	public void createEmployee(Employee employee);
	
	
}
