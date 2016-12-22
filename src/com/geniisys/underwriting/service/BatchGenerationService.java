package com.geniisys.underwriting.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface BatchGenerationService {
	void updateTables(HttpServletRequest request);

	void updateGiisSubline(HttpServletRequest request) throws SQLException;

	void updateGiisIssource(HttpServletRequest request) throws SQLException;

	void updateGiisTariff(HttpServletRequest request) throws SQLException;
}
