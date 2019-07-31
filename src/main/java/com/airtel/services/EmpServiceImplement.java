package com.airtel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.dao.EmployeeDao;
import com.airtel.models.Employee;

@Service("employeeservice")
public class EmpServiceImplement implements EmployeeServices {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getEmployees();
		return employees;
	}

	@Override
	public Employee getEmployeeData(String employeeId) {
		Employee employee = employeeDao.getEmployee(employeeId);
		return employee;
	}

	@Override
	public void deleteEmployeeData(Employee employee) {
		employeeDao.deleteEmployee(employee);
	}

	@Override
	public void updateEmployeeData(Employee employee) {
		employeeDao.updateEmployee(employee);
		
	}

	@Override
	public void createEmployeeData(Employee employee) {
		employeeDao.createEmployee(employee);
		
	}

}
