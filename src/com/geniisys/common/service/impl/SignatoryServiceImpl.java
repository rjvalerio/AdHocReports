package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.SignatoryDAO;
import com.geniisys.common.dao.impl.SignatoryDAOImpl;
import com.geniisys.common.entity.Signatory;
import com.geniisys.common.service.SignatoryService;

public class SignatoryServiceImpl implements SignatoryService{
	
	private SignatoryDAO signatoryDAO = new SignatoryDAOImpl();

	public SignatoryDAO getSignatoryDAO() {
		return signatoryDAO;
	}

	public void setSignatoryDAO(SignatoryDAO signatoryDAO) {
		this.signatoryDAO = signatoryDAO;
	}

	@Override
	public List<Signatory> getAllActiveSignatory() throws SQLException {
		return this.getSignatoryDAO().getAllActiveSignatory();
	}
	
}
