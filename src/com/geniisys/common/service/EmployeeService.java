package com.geniisys.common.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Employee;

public interface EmployeeService {
	Employee getEmployee(HttpServletRequest request) throws SQLException;
}
