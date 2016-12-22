package com.geniisys.common.service.impl;

import java.util.List;

import com.geniisys.common.dao.BranchDAO;
import com.geniisys.common.dao.IntermediaryDAO;
import com.geniisys.common.dao.impl.BranchDAOImpl;
import com.geniisys.common.dao.impl.IntermediaryDAOImpl;
import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Intermediary;
import com.geniisys.common.service.BranchService;
import com.geniisys.common.service.IntermediaryService;

public class IntermediaryServiceImpl implements IntermediaryService{
	
	private IntermediaryDAO intmDAO = new IntermediaryDAOImpl();

	@Override
	public List<Intermediary> getAllActiveIntermediary() {
		return this.intmDAO.getAllActiveIntermediary();
	}

	@Override
	public List<Intermediary> getAllIntmType() {
		return this.intmDAO.getAllIntmType();
	}

	@Override
	public List<Intermediary> getAllDealersIntm() {
		return this.intmDAO.getAllDealersIntm();
	}
	
	
}
