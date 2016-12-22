package com.geniisys.claims.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.dao.McSwornDAO;
import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.McSworn;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class McSwornDAOImpl implements McSwornDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<McSworn> populateMcSworn(ClaimNo claimNo) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<McSworn> mcSwornList = (List<McSworn>) sqlMap.queryForList("populateMcSworn", claimNo);
		return mcSwornList;
	}

}
