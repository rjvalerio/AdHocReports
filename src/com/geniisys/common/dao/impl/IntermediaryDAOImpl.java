package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.BranchDAO;
import com.geniisys.common.dao.IntermediaryDAO;
import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Intermediary;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class IntermediaryDAOImpl implements IntermediaryDAO{
private SqlMapClient sqlMap;

	@SuppressWarnings("unchecked")
	@Override
	public List<Intermediary> getAllActiveIntermediary() {
		List<Intermediary> intmList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			intmList =  sqlMap.queryForList("getAllActiveIntermediary");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return intmList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Intermediary> getAllIntmType() {
		List<Intermediary> intmList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			intmList =  sqlMap.queryForList("getAllIntmType");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return intmList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Intermediary> getAllDealersIntm() {
		List<Intermediary> intmList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			intmList =  sqlMap.queryForList("getAllDealersIntm");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return intmList;
	}
}
