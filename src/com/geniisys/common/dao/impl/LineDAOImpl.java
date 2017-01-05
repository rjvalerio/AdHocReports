package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.dao.LineDAO;
import com.geniisys.common.entity.Line;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.geniisys.util.MyAppSqlConfig;

public class LineDAOImpl implements LineDAO{
	private SqlMapClient sqlMap = MyAppSqlConfig.getSqlMapInstance();
	
	@SuppressWarnings("unchecked")
	public List<Line> getAllLines() {
		List<Line> lines = null;
		
		try {
			lines =  sqlMap.queryForList("getAllLines");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Line> getLinesByUserAndTranCd(Map<String, Object> params) throws SQLException {
		List<Line> lineList = sqlMap.queryForList("getLinesByUserAndTranCd",params);
		return lineList;
	}
	
}
