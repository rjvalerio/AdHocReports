package com.geniisys.common.dao.impl;

import java.sql.SQLException;

import com.geniisys.common.dao.ExtractIdDAO;
import com.geniisys.common.entity.PolicyNo;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ExtractIdDAOImpl implements ExtractIdDAO{
	private static SqlMapClient sqlMap;
	//MC12PlanReportController mc12PlanReportController = new MC12PlanReportController();

	@Override
	public Integer getExtractId(Integer policyId) {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer extractId = null;
		try {
			extractId = (Integer) sqlMap.queryForObject("fetchExtractId",policyId);
		} catch (SQLException e1) {
			System.out.println("Error fetching extract_id: " + e1.getMessage());
		}
		return extractId;
	}

}
