package com.airtel.services;

import java.util.List;

import com.airtel.models.Employee;

public interface EmployeeServices {

	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeData(String employeeId);
	public void deleteEmployeeData(Employee employee); 
	public void updateEmployeeData(Employee employee);
	public void createEmployeeData(Employee employee);
	
}
