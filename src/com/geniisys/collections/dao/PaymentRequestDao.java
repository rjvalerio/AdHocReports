package com.geniisys.collections.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.entity.Assured;
import com.geniisys.common.entity.CheckReqIntermediary;
import com.geniisys.common.entity.PaymentRequest;

public interface PaymentRequestDao {
	PaymentRequest getPaymentRequest(Map<String,Object> params) throws SQLException;
	List<CheckReqIntermediary> getCheckReqIntermediary(Integer tranId)throws SQLException;
	void updateremarks(Map<String,Object> params)throws SQLException;
	
}
