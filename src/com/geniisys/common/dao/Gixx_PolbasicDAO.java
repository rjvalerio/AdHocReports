package com.geniisys.common.dao;

import java.sql.SQLException;

import com.geniisys.common.entity.PolicyNo;

public interface Gixx_PolbasicDAO {
	Integer fetchExtractId(PolicyNo policyNo) throws SQLException;
}
