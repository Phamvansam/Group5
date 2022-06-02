package com.vti.dto.timesheet;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TimesheetDTO {
	private String employeeCode;
	
	private String employeeFullName;
	
	private String employeeDepartmentName;
	
	private String employeePositionName;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date timeIn;

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date timeOut;
	
	private int workingTime;
	
	private String status;

	public Date getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public int getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(int workingTime) {
		this.workingTime = workingTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeFullName() {
		return employeeFullName;
	}

	public void setEmployeeFullName(String employeeFullName) {
		this.employeeFullName = employeeFullName;
	}

	public String getEmployeeDepartmentName() {
		return employeeDepartmentName;
	}

	public void setEmployeeDepartmentName(String employeeDepartmentName) {
		this.employeeDepartmentName = employeeDepartmentName;
	}

	public String getEmployeePositionName() {
		return employeePositionName;
	}

	public void setEmployeePositionName(String employeePositionName) {
		this.employeePositionName = employeePositionName;
	}
	
	
	
}
