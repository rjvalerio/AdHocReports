package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.entity.Branch;

public interface BranchDAO {
	List<Branch> getAllBranches();
	List<Branch> getAllBranches2();
	List<Branch> getAllBranchesByUserAndTranCd(Map<String,Object> params) throws SQLException;
	String getAllBranches3();
}
