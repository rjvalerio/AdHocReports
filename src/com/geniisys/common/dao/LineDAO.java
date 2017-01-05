package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.entity.Line;

public interface LineDAO {
	List<Line> getAllLines();
	List<Line> getLinesByUserAndTranCd(Map<String,Object> params) throws SQLException;
}
