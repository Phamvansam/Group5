package com.vti.dto.accounting;

public class AccountingDTO {
	
	private String employeeCode;
	
	private String employeeFullName;
	
	private String employeeUserName;
	
	private String employeeDepartmentName;
	
	private String employeePositionName;

	public AccountingDTO() {
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeUserName() {
		return employeeUserName;
	}

	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
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

	public String getEmployeeFullName() {
		return employeeFullName;
	}

	public void setEmployeeFullName(String employeeFullName) {
		this.employeeFullName = employeeFullName;
	}

	public AccountingDTO(String employeeCode, String employeeFullName, String employeeUserName,
			String employeeDepartmentName, String employeePositionName) {
		this.employeeCode = employeeCode;
		this.employeeFullName = employeeFullName;
		this.employeeUserName = employeeUserName;
		this.employeeDepartmentName = employeeDepartmentName;
		this.employeePositionName = employeePositionName;
	}

	
	
	
	
}
