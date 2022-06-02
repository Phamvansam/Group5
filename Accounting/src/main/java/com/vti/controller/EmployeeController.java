package com.vti.controller;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.employee.EmployeeDTO;
import com.vti.dto.employee.EmployeeDetailsDTO;
import com.vti.entity.Employee;
import com.vti.service.employee.IEmployeeService;

@RestController
@RequestMapping(value = "api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IEmployeeService service;

	
	@GetMapping()
	public Page<EmployeeDTO> getAllEmployees(Pageable pageable) {

		Page<Employee> entityPages = service.getAllEmployees(pageable);

		// convert entities --> dtos
		List<EmployeeDTO> dtos = modelMapper.map(
				entityPages.getContent(), 
				new TypeToken<List<EmployeeDTO>>() {}.getType());

		Page<EmployeeDTO> dtoPages = new PageImpl<>(dtos, pageable, entityPages.getTotalElements());

		return dtoPages;
	}

	@GetMapping(value = "/{id}")
	public EmployeeDetailsDTO getEmployeeByID(@PathVariable(name = "id") int id) {
		
		Employee entity = service.getEmployeeByID(id);
		
		// convert entity to dto
		EmployeeDetailsDTO dto = modelMapper.map(entity, EmployeeDetailsDTO.class);
		return dto;
	}
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
