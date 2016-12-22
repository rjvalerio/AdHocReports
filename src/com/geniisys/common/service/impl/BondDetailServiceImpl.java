package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.BondDetailDAO;
import com.geniisys.common.dao.impl.BondDetailDAOImpl;
import com.geniisys.common.service.BondDetailService;

public class BondDetailServiceImpl implements BondDetailService{
	
	private BondDetailDAO bondDetailDAO = new BondDetailDAOImpl();

	@Override
	public String getBondDetail(Integer policyId) throws SQLException {
		return this.bondDetailDAO.getBondDetail(policyId);
	}

	@Override
	public void updateBondDetail(HttpServletRequest request) throws SQLException {
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("bondDtl", request.getParameter("bondDtl"));
		params.put("policyId", Integer.parseInt(request.getParameter("policyId")));
		this.bondDetailDAO.updateBondDetail(params);
	}

}
