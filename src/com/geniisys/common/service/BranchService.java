package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Branch;

public interface BranchService {
	List<Branch> getAllBranches();
	List<Branch> getAllBranches2();
	List<Branch> getAllBranchesByUserAndTranCd(HttpServletRequest request) throws SQLException;
	String getAllBranches3();
	String getAllBranches4();
}
