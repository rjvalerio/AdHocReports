package com.geniisys.common.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.Gipi_InvoiceDAO;
import com.geniisys.common.entity.Gipi_Invoice;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class Gipi_InvoiceDAOImpl implements Gipi_InvoiceDAO {
	private static SqlMapClient sqlMap;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Gipi_Invoice> fetchGipiInvoice(Integer policyId) throws SQLException {
		sqlMap = MyAppSqlConfig.getSqlMapInstance();
		List<Gipi_Invoice> gipiInvoiceList = (List<Gipi_Invoice>) sqlMap.queryForList("fetchGipiInvoice", policyId);
		return gipiInvoiceList;
	}
	

}
