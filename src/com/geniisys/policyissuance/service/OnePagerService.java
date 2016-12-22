package com.geniisys.policyissuance.service;

import java.sql.SQLException;

public interface OnePagerService {
	Integer getYearDiff(Integer policyId) throws SQLException;
}
