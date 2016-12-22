package com.geniisys.common.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface Gixx_PolbasicService {
	Integer fetchExtractId(HttpServletRequest request) throws SQLException;
}
