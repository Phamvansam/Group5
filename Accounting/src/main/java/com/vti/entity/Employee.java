package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "employee_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "employee_code", length = 50, nullable = false, unique = true)
	private String code;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "user_name", length = 50, nullable = false, unique = true)
	private String userName;
	
	@Column(name = "full_name", length = 50, nullable = false, unique = true)
	private String fullName;
	
	@Column(name = "birthday")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date birthday;
	
	@ManyToOne
	@JoinColumn(name = "department_id",nullable = false)
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "position_id",nullable = false)
	private Position position;
	
	@Column(name = "address", length = 200, nullable = false, unique = true)
	private String address;
	
	@Column(name = "phone",nullable = false, unique = true)
	private int phone;
	
	@Column(name = "id_card",nullable = false, unique = true)
	private int card;
	
	@Column(name = "gender", nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name = "contract", length = 50, nullable = false)
	private String contract;
	
	@Column(name = "role", nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(name = "`password`", length = 100, nullable = false)
	private String password;
	
	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;
	
	@OneToMany(mappedBy = "employee")
	private List<Timesheet> timesheets;
	
	
	public enum Role {
		ADMIN,EMPLOYEE,MANAGER,ACCOUNTANT
	}
	
	public enum Gender {
		MALE,FEMALE
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	
	

	
}
