package com.geniisys.claims.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.dao.OfferLetterDAO;
import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.OfferLetter;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class OfferLetterDAOImpl implements OfferLetterDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<OfferLetter> fetchOfferLetter(ClaimNo claimNo) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<OfferLetter> offerLetterInfo = (List<OfferLetter>) sqlMap.queryForList("fetchOfferLetter", claimNo);
		return offerLetterInfo;
	}
	
}
