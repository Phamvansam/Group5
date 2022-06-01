package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Accounting;
import com.vti.entity.Department;
import com.vti.entity.Employee;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
