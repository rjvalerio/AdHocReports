package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.LineDAO;
import com.geniisys.common.entity.Line;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.geniisys.util.MyAppSqlConfig;

public class LineDAOImpl implements LineDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	public List<Line> getAllLines() {
		List<Line> lines = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			lines =  sqlMap.queryForList("getAllLines");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
	
}
