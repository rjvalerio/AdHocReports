package com.geniisys.common.service.impl;

import com.geniisys.common.dao.ExtractIdDAO;
import com.geniisys.common.dao.impl.ExtractIdDAOImpl;
import com.geniisys.common.service.ExtractIdService;

public class ExtractIdServiceImpl implements ExtractIdService{
	
	private ExtractIdDAO extractIdDao = new ExtractIdDAOImpl();
	

	public ExtractIdDAO getExtractIdDao() {
		return extractIdDao;
	}


	public void setExtractIdDao(ExtractIdDAO extractIdDao) {
		this.extractIdDao = extractIdDao;
	}


	@Override
	public Integer getExtractId(Integer policyId) {
		return this.getExtractIdDao().getExtractId(policyId);
	}

}
