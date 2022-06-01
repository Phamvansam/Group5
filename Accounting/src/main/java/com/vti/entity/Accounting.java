package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Accounting")
@NamedEntityGraph(name = "joinedJava", includeAllAttributes = true)
public class Accounting implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Column(name = "accounting_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
	private Employee employee;
	
	@Column(name = "basic_salary", nullable = false)
	private int basicSalary;
	
	@Column(name = "money_for_meals", nullable = false)
	private int moneyForMeals;
	
	@Column(name = "responsibility")
	private int responsibility;
	
	@Column(name = "seniority")
	private int seniority;
	
	@Column(name = "bonus")
	private int bonus;

	@Column(name = "total_working_hours")
	private int totalWorkingHours;
	
	@Column(name = "total_overtime_hours")
	private int totalOvertimeHours;
	
	@Column(name = "personal_income_tax")
	private int personalIncomeTax;

	@Column(name = "advance")
	private int advance;
	
	@Column(name = "total_salary")
	private int totalSalary;

	
	public Accounting() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getMoneyForMeals() {
		return moneyForMeals;
	}

	public void setMoneyForMeals(int moneyForMeals) {
		this.moneyForMeals = moneyForMeals;
	}

	public int getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(int responsibility) {
		this.responsibility = responsibility;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public void setTotalWorkingHours(int totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}

	public int getTotalOvertimeHours() {
		return totalOvertimeHours;
	}

	public void setTotalOvertimeHours(int totalOvertimeHours) {
		this.totalOvertimeHours = totalOvertimeHours;
	}

	public int getPersonalIncomeTax() {
		return personalIncomeTax;
	}

	public void setPersonalIncomeTax(int personalIncomeTax) {
		this.personalIncomeTax = personalIncomeTax;
	}

	public int getAdvance() {
		return advance;
	}

	public void setAdvance(int advance) {
		this.advance = advance;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
