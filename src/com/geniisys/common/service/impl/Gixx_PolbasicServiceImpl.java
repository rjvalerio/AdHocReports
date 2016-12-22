package com.geniisys.common.service.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.Gixx_PolbasicDAO;
import com.geniisys.common.dao.impl.Gixx_PolbasicDAOImpl;
import com.geniisys.common.entity.PolicyNo;
import com.geniisys.common.service.Gixx_PolbasicService;

public class Gixx_PolbasicServiceImpl implements Gixx_PolbasicService{
	
	private Gixx_PolbasicDAO gixxPolbasicDAO = new Gixx_PolbasicDAOImpl();

	public Gixx_PolbasicDAO getGixxPolbasicDAO() {
		return gixxPolbasicDAO;
	}

	public void setGixxPolbasicDAO(Gixx_PolbasicDAO gixxPolbasicDAO) {
		this.gixxPolbasicDAO = gixxPolbasicDAO;
	}

	@Override
	public Integer fetchExtractId(HttpServletRequest request) throws SQLException {
		String lineCd = request.getParameter("lineCd").toUpperCase();
		String sublineCd = request.getParameter("sublineCd").toUpperCase();
		String issCd = request.getParameter("issCd").toUpperCase();
		Integer issueYY = Integer.parseInt(request.getParameter("issueYY"));
		Integer polSeqNo = Integer.parseInt(request.getParameter("polSeqNo"));
		Integer renewNo = Integer.parseInt(request.getParameter("renewNo"));
		PolicyNo policyNo = new PolicyNo(lineCd,sublineCd,issCd,issueYY,polSeqNo,renewNo);
		return this.getGixxPolbasicDAO().fetchExtractId(policyNo);
	}

}
