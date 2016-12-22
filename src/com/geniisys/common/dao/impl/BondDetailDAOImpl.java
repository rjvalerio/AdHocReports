package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.dao.BondDetailDAO;
import com.geniisys.common.dao.SublineDAO;
import com.geniisys.common.dao.TariffDAO;
import com.geniisys.common.entity.Subline;
import com.geniisys.common.entity.Tariff;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class BondDetailDAOImpl implements BondDetailDAO{
private SqlMapClient sqlMap;

	@Override
	public String getBondDetail(Integer policyId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		String bondDtl = "";
		try {
			bondDtl = (String) sqlMap.queryForObject("getBondDetail",policyId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bondDtl;
	}

	@Override
	public void updateBondDetail(Map<String, Object> params) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		sqlMap.update("updateBondDetail", params);
	}
}
