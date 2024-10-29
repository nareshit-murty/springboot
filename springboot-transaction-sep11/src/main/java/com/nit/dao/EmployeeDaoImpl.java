package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nit.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeDaoImpl implements EmployeeDao {

	private String INSERT = "insert into employee(name, address, salary) values(?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) throws Exception {
		try {
		log.debug("Employee Name : {}, {}, {}",emp.getName(), emp.getAddress(), emp.getSalary());
		jdbcTemplate.update(INSERT, emp.getName(),emp.getAddress(),emp.getSalary());
		//throw new Exception();
		log.info("Employee record is successfully saved in database");
		int c = 12/0;
		}catch(Exception ex) {
			log.error("Arithmatic Exception came : {} ",ex.getMessage());
		}
	}

}
