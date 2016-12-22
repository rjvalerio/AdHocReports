package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.CoSignatoryDAO;
import com.geniisys.common.dao.impl.CoSignatoryDAOImpl;
import com.geniisys.common.entity.CoSignatory;
import com.geniisys.common.service.CoSignatoryService;

public class CoSignatoryServiceImpl implements CoSignatoryService{
	
	private CoSignatoryDAO CoSignatoryDAO = new CoSignatoryDAOImpl();

	public CoSignatoryDAO getCoSignatoryDAO() {
		return CoSignatoryDAO;
	}

	public void setCoSignatoryDAO(CoSignatoryDAO coSignatoryDAO) {
		CoSignatoryDAO = coSignatoryDAO;
	}

	@Override
	public List<CoSignatory> getCoAllActiveSignatory() throws SQLException {
		return this.getCoSignatoryDAO().getCoAllActiveSignatory();
	}

	
}
