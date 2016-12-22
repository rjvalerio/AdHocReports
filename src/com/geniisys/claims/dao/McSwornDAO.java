package com.geniisys.claims.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.McSworn;

public interface McSwornDAO {
	List<McSworn> populateMcSworn(ClaimNo claimNo) throws SQLException;
}
