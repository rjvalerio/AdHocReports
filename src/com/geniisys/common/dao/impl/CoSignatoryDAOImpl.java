package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.CoSignatoryDAO;
import com.geniisys.common.entity.CoSignatory;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class CoSignatoryDAOImpl implements CoSignatoryDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CoSignatory> getCoAllActiveSignatory() throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<CoSignatory> CosignatoryList = (List<CoSignatory>) sqlMap.queryForList("getCoAllActive");
		return CosignatoryList;
	}
}
