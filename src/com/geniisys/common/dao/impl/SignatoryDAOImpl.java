package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.SignatoryDAO;
import com.geniisys.common.entity.Signatory;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class SignatoryDAOImpl implements SignatoryDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Signatory> getAllActiveSignatory() throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Signatory> signatoryList = (List<Signatory>) sqlMap.queryForList("getAllActive");
		return signatoryList;
	}
}
