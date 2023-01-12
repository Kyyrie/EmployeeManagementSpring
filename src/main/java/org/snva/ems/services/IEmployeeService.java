package org.snva.ems.services;


import org.snva.ems.bean.Employee;
import org.snva.ems.services.exception.EmployeeServiceException;

import java.util.List;

/**
 * IEmployeeService is an interface which defines various abstract functions
 * for the service layer.
 */
public interface IEmployeeService
{
	public void addNewEmployee(Employee employee);
	public void removeEmployeeByName(List<Employee> employeelist);
	public List<Employee> showAllEmployeeInformation() throws EmployeeServiceException;
	
}
