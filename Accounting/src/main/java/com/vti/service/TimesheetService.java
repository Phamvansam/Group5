package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Timesheet;
import com.vti.repository.ITimesheetRepository;

@Service
public class TimesheetService implements ITimesheetService {

	@Autowired
	private ITimesheetRepository repository;

	public List<Timesheet> getAllTimesheets() {
		return repository.findAll();
	}

//	public Timesheet getTimesheetByID(int id) {
//		return repository.findById(id).get();
//	}
//
//	public void createTimesheet(Timesheet Timesheet) {
//		repository.save(Timesheet);
//	}
//
//	public void updateTimesheet(Timesheet Timesheet) {
//		repository.save(Timesheet);
//	}
//
//	public void deleteTimesheet(int id) {
//		repository.deleteById(id);
//	}
//
//	public boolean isTimesheetExistsByID(int id) {
//		return repository.existsById(id);
//	}

}
