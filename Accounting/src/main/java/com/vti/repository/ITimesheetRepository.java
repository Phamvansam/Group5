package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Position;
import com.vti.entity.Timesheet;

public interface ITimesheetRepository extends JpaRepository<Timesheet, Integer> {

}
