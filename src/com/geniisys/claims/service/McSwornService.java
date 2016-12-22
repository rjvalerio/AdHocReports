package com.geniisys.claims.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.claims.entity.McSworn;

public interface McSwornService {
	List<McSworn> populateMcSworn(HttpServletRequest request) throws SQLException;
}
