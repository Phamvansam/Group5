package com.vti.dto.department;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DepartmentDTO {
	
	private int id;
	
	private String name;
	
	private int totalMember;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMember() {
		return totalMember;
	}

	public void setTotalMember(int totalMember) {
		this.totalMember = totalMember;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
