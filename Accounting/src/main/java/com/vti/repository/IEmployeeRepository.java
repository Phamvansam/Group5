package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Accounting;
import com.vti.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
