package io.egen.rest.service;

import java.util.List;

import io.egen.rest.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findOne(String id);

	public Employee create(Employee emp);

	public Employee update(String id, Employee emp);

	public void delete(String id);
}
