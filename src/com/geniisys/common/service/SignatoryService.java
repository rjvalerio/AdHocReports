package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Signatory;

public interface SignatoryService {
	List<Signatory> getAllActiveSignatory() throws SQLException;
}
