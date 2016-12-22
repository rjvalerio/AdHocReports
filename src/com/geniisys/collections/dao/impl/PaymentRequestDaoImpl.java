package com.geniisys.collections.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.collections.dao.PaymentRequestDao;
import com.geniisys.common.entity.CheckReqIntermediary;
import com.geniisys.common.entity.PaymentRequest;
import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class PaymentRequestDaoImpl implements PaymentRequestDao{
	private SqlMapClient sqlMap =  MyAppSqlConfig.getSqlMapInstance();

	@Override
	public PaymentRequest getPaymentRequest(Map<String,Object> params) throws SQLException {
		return (PaymentRequest) sqlMap.queryForObject("getPaymentRequest", params);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CheckReqIntermediary> getCheckReqIntermediary(Integer tranId) throws SQLException {
		List<CheckReqIntermediary> list = sqlMap.queryForList("getCheckReqIntm", tranId);
		return list;
	}

	@Override
	public void updateremarks(Map<String, Object> params) throws SQLException {
		sqlMap.update("updateRemarks", params);
	}

}
