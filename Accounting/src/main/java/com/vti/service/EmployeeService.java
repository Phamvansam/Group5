package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Employee;
import com.vti.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

//	public Employee getEmployeeByID(int id) {
//		return repository.findById(id).get();
//	}
//
//	public void createEmployee(Employee Employee) {
//		repository.save(Employee);
//	}
//
//	public void updateEmployee(Employee Employee) {
//		repository.save(Employee);
//	}
//
//	public void deleteEmployee(int id) {
//		repository.deleteById(id);
//	}
//
//	public boolean isEmployeeExistsByID(int id) {
//		return repository.existsById(id);
//	}

}
