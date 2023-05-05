package com.example.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InventoryManagement.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
       
}
