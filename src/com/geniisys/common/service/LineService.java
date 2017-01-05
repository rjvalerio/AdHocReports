package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Line;

public interface LineService {
	List<Line> getAllLines();
	List<Line> getLinesByUserAndTranCd(HttpServletRequest request) throws SQLException;
}
