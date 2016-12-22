package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.dao.AssuredDAO;
import com.geniisys.common.entity.Assured;
import com.geniisys.common.entity.Branch;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class AssuredDAOImpl implements AssuredDAO {
	private SqlMapClient sqlMap;

	@SuppressWarnings("unchecked")
	@Override
	public List<Assured> getAssured(Integer assdNo) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Assured> assured = (List<Assured>) sqlMap.queryForList("getAssured", assdNo);
		return assured;
	}

	@Override
	public Integer fetchAssuredNo(Integer policyId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer assuredNo = (Integer) sqlMap.queryForObject("fetchAssdNo", policyId);
		return assuredNo;
	}

	@Override
	public Integer fetchAssdNoGipiPolbasic(Integer policyId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		Integer assuredNo = (Integer) sqlMap.queryForObject("fetchAssdNoGipiPolbasic", policyId);
		return assuredNo;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Assured> getAllActiveAssured(){
		List<Assured> assdList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			assdList =  sqlMap.queryForList("getAllActiveAssured");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assdList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Assured> searchAssured(Map<String, Object> params) throws SQLException {
		List<Assured> assdList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();

		try {
			assdList =  sqlMap.queryForList("searchAssured",params);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assdList;
	}

}
