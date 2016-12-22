package com.geniisys.claims.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.dao.DemandLetterDAO;
import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.DemandLetter;
import com.geniisys.claims.entity.DemandLetterInsert;
import com.geniisys.claims.entity.DemandLetterParameter;
import com.geniisys.claims.entity.DemandLetterReprint;
import com.geniisys.claims.entity.DemandLetterTbl;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DemandLetterDAOImpl implements DemandLetterDAO {
	private SqlMapClient sqlMap;

	@SuppressWarnings("unchecked")
	@Override
	public List<DemandLetterParameter> fetchDemandLetterParameters(ClaimNo claimNo) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<DemandLetterParameter> demandLetterList = (List<DemandLetterParameter>) sqlMap
				.queryForList("fetchDemandLetterParameters", claimNo);
		return demandLetterList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DemandLetter> populateDemandLetterInfo(DemandLetterParameter params) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<DemandLetter> demandLetterList = (List<DemandLetter>) sqlMap.queryForList("fetchDemandLetterInfo", params);
		return demandLetterList;
	}

	@Override
	public Integer checkClaimIdFromDBDemandLetter(Integer claimId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer result = (Integer) sqlMap.queryForObject("checkClaimIdFromDBDemandLetter",claimId);
		return result;
	}

	@Override
	public Boolean checkIfExistsInReprint(DemandLetterReprint reprint) throws SQLException {
		Boolean exists = false;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer claimId = (Integer) sqlMap.queryForObject("checkIfExistsInReprint",reprint);
		if (!claimId.equals(null)){
			exists = true;
		}
		return exists;
	}

	@Override
	public void insertIntoDBDemandLetter(DemandLetterTbl demandLetterTbl) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("insertIntoDBDemandLetter", demandLetterTbl);
	}

	@Override
	public void insertIntoDBDemandReprint(DemandLetterReprint demandLetterReprintTbl) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("insertIntoDbDemandReprint", demandLetterReprintTbl);
	}

	@Override
	public DemandLetterInsert fetchFirstReportDetails(DemandLetterParameter params) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		DemandLetterInsert insertDetails = (DemandLetterInsert) sqlMap.queryForObject("fetchFirstReportDetails",params);
		insertDetails.setUserId(params.getUserId());
		return insertDetails;
	}

	@Override
	public DemandLetterInsert fetchSecondReportDetails(DemandLetterParameter params) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		DemandLetterInsert insertDetails = (DemandLetterInsert) sqlMap.queryForObject("fetchSecondReportDetails",params);
		insertDetails.setUserId(params.getUserId());
		return insertDetails;
	}

}
