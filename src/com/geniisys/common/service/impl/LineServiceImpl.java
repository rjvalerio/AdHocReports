package com.geniisys.common.service.impl;

import java.util.List;

import com.geniisys.common.dao.LineDAO;
import com.geniisys.common.dao.impl.LineDAOImpl;
import com.geniisys.common.entity.Line;
import com.geniisys.common.service.LineService;

public class LineServiceImpl implements LineService{
	
	private LineDAO lineDAO = new LineDAOImpl();

	@Override
	public List<Line> getAllLines() {
		return this.lineDAO.getAllLines();
	}

}
