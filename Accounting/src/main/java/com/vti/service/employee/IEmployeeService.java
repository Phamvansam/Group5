package com.vti.service.employee;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.employee.EmployeeDTO;
import com.vti.entity.Employee;

public interface IEmployeeService {

	public Page<Employee> getAllEmployees(Pageable pageable);

	public Employee getEmployeeByID(int id);

//
//	public void createEmployee(Employee Employee);
//
//	public void updateEmployee(Employee Employee);
//
//	public void deleteEmployee(int id);
//
//	public boolean isEmployeeExistsByID(int id);
}
