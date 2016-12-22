package com.geniisys.policyissuance.service.impl;

import java.sql.SQLException;

import com.geniisys.policyissuance.dao.OnePagerDAO;
import com.geniisys.policyissuance.dao.impl.OnePagerDAOImpl;
import com.geniisys.policyissuance.service.OnePagerService;

public class OnePagerServiceImpl implements OnePagerService{
	private OnePagerDAO onePagerDAO = new OnePagerDAOImpl();
	
	public OnePagerDAO getOnePagerDAO() {
		return onePagerDAO;
	}

	public void setOnePagerDAO(OnePagerDAO onePagerDAO) {
		this.onePagerDAO = onePagerDAO;
	}



	@Override
	public Integer getYearDiff(Integer policyId) throws SQLException {
		return this.getOnePagerDAO().getYearDiff(policyId);
	}
}
