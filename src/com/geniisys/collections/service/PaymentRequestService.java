package com.geniisys.collections.service;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface PaymentRequestService {
	Map<String,Object> getPaymentRequestDetails(HttpServletRequest request) throws SQLException;
	void updateRemarks(HttpServletRequest request) throws SQLException;

}
