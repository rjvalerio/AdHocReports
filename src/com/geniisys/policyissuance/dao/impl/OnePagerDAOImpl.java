package com.geniisys.policyissuance.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Assured;
import com.geniisys.policyissuance.dao.OnePagerDAO;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class OnePagerDAOImpl implements OnePagerDAO{
	private SqlMapClient sqlMap;
	
	@Override
	public Integer getYearDiff(Integer policyId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer yearDiff = (Integer) sqlMap.queryForObject("getYearDiff", policyId);
		return yearDiff;
	}

}
