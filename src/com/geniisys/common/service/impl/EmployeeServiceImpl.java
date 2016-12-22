package com.geniisys.common.service.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.EmployeeDAO;
import com.geniisys.common.dao.impl.EmployeeDAOImpl;
import com.geniisys.common.entity.Employee;
import com.geniisys.common.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@Override
	public Employee getEmployee(HttpServletRequest request) throws SQLException {
		String empId1 = request.getParameter("employeeId1");
		String empId2 = request.getParameter("employeeId2");
		String employeeId = empId1 + "-" + empId2;
		return this.employeeDAO.getEmployee(employeeId);
	}

}
