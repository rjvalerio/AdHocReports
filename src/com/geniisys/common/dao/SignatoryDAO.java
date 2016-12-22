package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Signatory;

public interface SignatoryDAO {
	List<Signatory> getAllActiveSignatory() throws SQLException;
}
