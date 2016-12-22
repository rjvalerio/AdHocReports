package com.geniisys.claims.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.DemandLetter;
import com.geniisys.claims.entity.DemandLetterInsert;
import com.geniisys.claims.entity.DemandLetterParameter;
import com.geniisys.claims.entity.DemandLetterReprint;
import com.geniisys.claims.entity.DemandLetterTbl;

public interface DemandLetterDAO {
	List<DemandLetterParameter> fetchDemandLetterParameters(ClaimNo claimNo) throws SQLException;
	List<DemandLetter> populateDemandLetterInfo(DemandLetterParameter params) throws SQLException;
	Integer checkClaimIdFromDBDemandLetter(Integer claimId) throws SQLException;
	Boolean checkIfExistsInReprint(DemandLetterReprint reprint) throws SQLException;
	void insertIntoDBDemandLetter(DemandLetterTbl demandLetterTbl) throws SQLException;
	void insertIntoDBDemandReprint(DemandLetterReprint demandLetterReprintTbl) throws SQLException;
	DemandLetterInsert fetchFirstReportDetails(DemandLetterParameter params) throws SQLException;
	DemandLetterInsert fetchSecondReportDetails(DemandLetterParameter params) throws SQLException;
}
