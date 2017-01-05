package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Intermediary;

public interface IntermediaryService {
	List<Intermediary> getAllActiveIntermediary();
	List<Intermediary> getAllIntmType();
	List<Intermediary> getAllDealersIntm();
	String searchIntermediary(HttpServletRequest request) throws SQLException;
}
