package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.ItemDAO;
import com.geniisys.common.entity.Item;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ItemDAOImpl implements ItemDAO{
	private SqlMapClient sqlMap;

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getItem(Integer extractId, String lineCd) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Item> item = null;
		if(lineCd.equals("MC")){
			item = (List<Item>) sqlMap.queryForList("getGixxVehicleItem",extractId);
		}else{
			item = (List<Item>) sqlMap.queryForList("getItem",extractId);
		}
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getGipiItem(Integer policyId, String lineCd) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Item> item = null;
		if(lineCd.equals("MC")){
			item = (List<Item>) sqlMap.queryForList("getGipiVehicle",policyId);
		}else{
			item = (List<Item>) sqlMap.queryForList("getGipiItem",policyId);
		}
		return item;
	}
}
