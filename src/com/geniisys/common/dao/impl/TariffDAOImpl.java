package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.SublineDAO;
import com.geniisys.common.dao.TariffDAO;
import com.geniisys.common.entity.Subline;
import com.geniisys.common.entity.Tariff;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class TariffDAOImpl implements TariffDAO{
private SqlMapClient sqlMap;

	@Override
	public String getAllTariffForDataGrid() {
		String sublineList = null;
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		try {
			sublineList = (String) sqlMap.queryForObject("getAllTariffForDataGrid");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sublineList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tariff> getAllTariff() {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Tariff> tariffList = null;
		try {
			tariffList = (List<Tariff>) sqlMap.queryForList("getAllTariff");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tariffList;
	}
}
