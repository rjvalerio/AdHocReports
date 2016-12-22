package com.geniisys.common.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface BondDetailService {
	String getBondDetail(Integer policyId) throws SQLException;
	void updateBondDetail(HttpServletRequest request) throws SQLException;
}
