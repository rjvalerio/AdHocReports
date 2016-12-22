package com.geniisys.underwriting.dao;

import java.sql.SQLException;

import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Subline;
import com.geniisys.common.entity.Tariff;

public interface BatchGenerationDAO {
	void updateGiisSubline(Subline sublineParams) throws SQLException;
	void updateGiisIssource(Branch branchParams) throws SQLException;
	void updateGiisTariff(Tariff tariffParams) throws SQLException;
}
