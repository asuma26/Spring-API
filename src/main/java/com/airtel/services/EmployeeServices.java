package com.airtel.services;

import java.util.List;

import com.airtel.models.Employee;

public interface EmployeeServices {

	
	public List<Employee> getEmployees();
	public Employee getEmployee(String employeeId);
	public void deleteEmployee(Employee employee); 
	public void updateEmployee(Employee employee);
	public void createEmployee(Employee employee);
	
}
