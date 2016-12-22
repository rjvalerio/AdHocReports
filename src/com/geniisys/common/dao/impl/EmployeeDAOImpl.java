package com.geniisys.common.dao.impl;

import java.sql.SQLException;

import com.geniisys.common.dao.EmployeeDAO;
import com.geniisys.common.entity.Employee;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class EmployeeDAOImpl implements EmployeeDAO {
	private SqlMapClient sqlMap;

	@Override
	public Employee getEmployee(String employeeId) throws SQLException {
		Employee emp = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		emp = (Employee) sqlMap.queryForObject("getEmployee", employeeId);

		return emp;
	}
}
