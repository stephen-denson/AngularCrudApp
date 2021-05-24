package com.angularSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularSpring.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByName(String name);
}