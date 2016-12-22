package com.geniisys.underwriting.dao.impl;

import java.sql.SQLException;

import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Subline;
import com.geniisys.common.entity.Tariff;
import com.geniisys.underwriting.dao.BatchGenerationDAO;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class BatchGenerationDAOImpl implements BatchGenerationDAO{
	private SqlMapClient sqlMap;
	
	
	@Override
	public void updateGiisSubline(Subline sublineParams)  throws SQLException{
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("updateGiisSubline", sublineParams);
	}

	@Override
	public void updateGiisIssource(Branch branchParams) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("updateGiisIssource", branchParams);
	}

	@Override
	public void updateGiisTariff(Tariff tariffParams) throws SQLException{
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("updateGiisTariff", tariffParams);
	}

}
