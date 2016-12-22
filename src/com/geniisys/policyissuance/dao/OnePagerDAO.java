package com.geniisys.policyissuance.dao;

import java.sql.SQLException;

public interface OnePagerDAO {
	Integer getYearDiff(Integer policyId) throws SQLException;
}
