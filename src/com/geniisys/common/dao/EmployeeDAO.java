package com.geniisys.common.dao;

import java.sql.SQLException;

import com.geniisys.common.entity.Employee;

public interface EmployeeDAO {
	Employee getEmployee(String employeeId) throws SQLException;
}
