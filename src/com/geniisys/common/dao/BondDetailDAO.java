package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.Map;

public interface BondDetailDAO {
	String getBondDetail(Integer policyId) throws SQLException;
	void updateBondDetail(Map<String,Object> params) throws SQLException;
}
