package com.vti.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.EmployeeDTO;
import com.vti.entity.Employee;

import com.vti.service.IEmployeeService;

@RestController
@RequestMapping(value = "api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IEmployeeService service;

	@GetMapping()
	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> entities = service.getAllEmployees();

		// convert entities --> dtos
		List<EmployeeDTO> dtos = modelMapper.map(entities, new TypeToken<List<EmployeeDTO>>() {
		}.getType());

		return dtos;
	}

//	@GetMapping(value = "/{id}")
//	public Employee getEmployeeByID(@PathVariable(name = "id") int id) {
//		return service.getEmployeeByID(id);
//	}
//
//	@PostMapping()
//	public void createEmployee(@RequestBody EmployeeForm form) {
//		service.createEmployee(form.toEntity());
//	}
//
//	@PutMapping(value = "/{id}")
//	public void updateEmployee(@PathVariable(name = "id") int id, @RequestBody EmployeeForm form) {
//		Employee Employee = form.toEntity();
//		Employee.setId(id);
//		service.updateEmployee(Employee);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public void deleteEmployee(@PathVariable(name = "id") int id) {
//		service.deleteEmployee(id);
//	}
}
