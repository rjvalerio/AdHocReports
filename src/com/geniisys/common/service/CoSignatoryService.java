package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.CoSignatory;

public interface CoSignatoryService {
	List<CoSignatory> getCoAllActiveSignatory() throws SQLException;
}
