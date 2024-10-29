package com.nit.dao;

import com.nit.model.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp) throws Exception;
}
