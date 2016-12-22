package com.geniisys.claims.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.claims.dao.McSwornDAO;
import com.geniisys.claims.dao.impl.McSwornDAOImpl;
import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.McSworn;
import com.geniisys.claims.service.McSwornService;

public class McSwornServiceImpl implements McSwornService{
	
	private McSwornDAO mcSwornDAO = new McSwornDAOImpl();

	public McSwornDAO getMcSwornDAO() {
		return mcSwornDAO;
	}

	public void setMcSwornDAO(McSwornDAO mcSwornDAO) {
		this.mcSwornDAO = mcSwornDAO;
	}

	@Override
	public List<McSworn> populateMcSworn(HttpServletRequest request) throws SQLException {
		String lineCd = request.getParameter("lineCd");
		String sublineCd = request.getParameter("sublineCd");
		String issCd = request.getParameter("issCd");
		Integer clmYy = Integer.parseInt(request.getParameter("clmYy"));
		Integer clmSeqNo = Integer.parseInt(request.getParameter("clmSeqNo"));
		ClaimNo claimNo = new ClaimNo(lineCd, sublineCd, issCd, clmYy, clmSeqNo);
		//return this.mcSwornDAO.populateMcSworn(claimNo);
		return this.getMcSwornDAO().populateMcSworn(claimNo);
	}
	
	

}
