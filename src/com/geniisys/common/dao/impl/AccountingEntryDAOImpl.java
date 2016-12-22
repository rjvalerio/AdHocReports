package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.AccountingEntryDAO;
import com.geniisys.common.entity.AccountingEntry;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class AccountingEntryDAOImpl implements AccountingEntryDAO{
	private SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AccountingEntry> getAllDate() throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<AccountingEntry> accountingEntry = (List<AccountingEntry>) sqlMap.queryForList("getAllDate");
		return accountingEntry;
	}
}
