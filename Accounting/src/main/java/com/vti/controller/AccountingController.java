package com.vti.controller;

import java.util.ArrayList;
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

import com.vti.dto.accounting.AccountingDTO;
import com.vti.dto.accounting.AccountingDetailsDTO;
import com.vti.dto.employee.EmployeeDetailsDTO;
import com.vti.entity.Accounting;
import com.vti.entity.Employee;
import com.vti.service.accounting.IAccountingService;

@RestController
@RequestMapping(value = "api/v1/accountings")
public class AccountingController {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private IAccountingService service;

	@GetMapping()
	public List<AccountingDTO> getAllAccountings() {
		
		List<Accounting>entities = service.getAllAccountings();
		
		// convert entities --> dtos
		
		List<AccountingDTO> dtos = modelMapper.map(entities, new TypeToken<List<AccountingDTO>>(){			
		}.getType());
		
		return dtos;
	}

	@GetMapping(value = "/{id}")
	public AccountingDetailsDTO getAccountingByID(@PathVariable(name = "id") int id) {
		Accounting entity = service.getAccountingByID(id);
		
		// convert entity to dto
		AccountingDetailsDTO dto = modelMapper.map(entity, AccountingDetailsDTO.class);
		return dto;
	}

//	@PostMapping()
//	public void createAccounting(@RequestBody AccountingForm form) {
//		service.createAccounting(form.toEntity());
//	}
//
//	@PutMapping(value = "/{id}")
//	public void updateAccounting(@PathVariable(name = "id") int id, @RequestBody AccountingForm form) {
//		Accounting Accounting = form.toEntity();
//		Accounting.setId(id);
//		service.updateAccounting(Accounting);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public void deleteAccounting(@PathVariable(name = "id") int id) {
//		service.deleteAccounting(id);
//	}
}
