package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.CoSignatory;

public interface CoSignatoryDAO {
	List<CoSignatory> getCoAllActiveSignatory() throws SQLException;
}
