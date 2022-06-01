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

import com.vti.dto.TimesheetDTO;
import com.vti.dto.TimesheetDTO;
import com.vti.entity.Timesheet;
import com.vti.entity.Timesheet;
import com.vti.service.ITimesheetService;

@RestController
@RequestMapping(value = "api/v1/timesheets")
public class TimesheetController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ITimesheetService service;

	@GetMapping()
	public List<TimesheetDTO> getAllTimesheets() {


		List<Timesheet> entities = service.getAllTimesheets();
		
		// convert entities --> dtos
		List<TimesheetDTO> dtos = modelMapper.map(entities, new TypeToken<List<TimesheetDTO>>() {
		}.getType());
		
		return dtos;
	}

//	@GetMapping(value = "/{id}")
//	public Timesheet getTimesheetByID(@PathVariable(name = "id") int id) {
//		return service.getTimesheetByID(id);
//	}
//
//	@PostMapping()
//	public void createTimesheet(@RequestBody TimesheetForm form) {
//		service.createTimesheet(form.toEntity());
//	}
//
//	@PutMapping(value = "/{id}")
//	public void updateTimesheet(@PathVariable(name = "id") int id, @RequestBody TimesheetForm form) {
//		Timesheet Timesheet = form.toEntity();
//		Timesheet.setId(id);
//		service.updateTimesheet(Timesheet);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public void deleteTimesheet(@PathVariable(name = "id") int id) {
//		service.deleteTimesheet(id);
//	}
}
