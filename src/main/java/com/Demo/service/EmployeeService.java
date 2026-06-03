package com.Demo.service;

import java.util.List;

import com.Demo.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}