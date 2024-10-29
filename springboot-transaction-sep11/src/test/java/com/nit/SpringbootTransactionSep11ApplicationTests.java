package com.nit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

@SpringBootTest
class SpringbootTransactionSep11ApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	void contextLoads() throws Exception {
		Employee emp = new Employee("Praveen", "JNTU", 45000D);
		employeeDao.saveEmployee(emp);
		System.out.println("Employee is successfully saved...");
	}

}
