package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.LineDAO;
import com.geniisys.common.dao.impl.LineDAOImpl;
import com.geniisys.common.entity.Line;
import com.geniisys.common.service.LineService;

public class LineServiceImpl implements LineService {

	private LineDAO lineDAO = new LineDAOImpl();

	@Override
	public List<Line> getAllLines() {
		return this.lineDAO.getAllLines();
	}

	@Override
	public List<Line> getLinesByUserAndTranCd(HttpServletRequest request) throws SQLException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", request.getParameter("userId"));
		params.put("tranCd", request.getParameter("tranCd"));
		List<Line> lineList = lineDAO.getLinesByUserAndTranCd(params);
		return lineList;
	}

}
