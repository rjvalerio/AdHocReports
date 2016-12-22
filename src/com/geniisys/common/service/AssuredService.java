package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Assured;

public interface AssuredService {
	List<Assured> getAssured(Integer assdNo) throws SQLException;
	Integer fetchAssuredNo(Integer policyId) throws SQLException;
	Integer fetchAssdNoGipiPolbasic(Integer policyId) throws SQLException;
	List<Assured> getAllActiveAssured();
	String getAllActiveAssured2();
	String getAllActiveAssured3();
	String searchAssured(HttpServletRequest request) throws SQLException;
}
