package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.BranchDAO;
import com.geniisys.common.dao.impl.BranchDAOImpl;
import com.geniisys.common.entity.Branch;
import com.geniisys.common.service.BranchService;

public class BranchServiceImpl implements BranchService {

	private BranchDAO branchDAO = new BranchDAOImpl();

	@Override
	public List<Branch> getAllBranches() {
		return this.branchDAO.getAllBranches();
	}

	@Override
	public List<Branch> getAllBranches2() {
		return this.branchDAO.getAllBranches2();
	}

	@Override
	public String getAllBranches3() {
		return this.branchDAO.getAllBranches3();
	}

	@Override
	public String getAllBranches4() {
		List<Branch> branchList = this.branchDAO.getAllBranches();
		String branchString = "{ options: [{value:\"\",text:\"\",selected: true},";
		Integer count = 1;

		for (Branch branch : branchList) {
			branchString = branchString + "{value:\"" + branch.getIssCd() + "\", text: \"" + branch.getIssName()
					+ "\"},";
			count++;
		}
		branchString = branchString.substring(0, branchString.length() - 1) + "]}";
		branchString.trim();
		return branchString;
	}

	@Override
	public List<Branch> getAllBranchesByUserAndTranCd(HttpServletRequest request) throws SQLException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", request.getParameter("userId"));
		params.put("tranCd", request.getParameter("tranCd"));
		List<Branch> branchList = branchDAO.getAllBranchesByUserAndTranCd(params);
		return branchList;
	}

}
