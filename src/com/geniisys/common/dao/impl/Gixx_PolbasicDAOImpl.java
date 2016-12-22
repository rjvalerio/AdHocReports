package com.geniisys.common.dao.impl;

import java.sql.SQLException;

import com.geniisys.common.dao.Gixx_PolbasicDAO;
import com.geniisys.common.entity.PolicyNo;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class Gixx_PolbasicDAOImpl implements Gixx_PolbasicDAO{
	private SqlMapClient sqlMap;
	
	@Override
	public Integer fetchExtractId(PolicyNo policyNo) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer extractId = (Integer) sqlMap.queryForObject("fetchExtractIdByPolicyNo", policyNo);
		return extractId;
	}

}
