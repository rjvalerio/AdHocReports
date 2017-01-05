package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.entity.Intermediary;

public interface IntermediaryDAO {
	List<Intermediary> getAllActiveIntermediary();
	List<Intermediary> getAllIntmType();
	List<Intermediary> getAllDealersIntm();
	List<Intermediary> searchIntermediary(Map<String,Object> params) throws SQLException;
}
