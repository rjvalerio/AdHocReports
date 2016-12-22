package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.geniisys.common.entity.Assured;

public interface AssuredDAO {
	List<Assured> getAssured(Integer assdNo) throws SQLException;
	Integer fetchAssuredNo(Integer policyId) throws SQLException;
	Integer fetchAssdNoGipiPolbasic(Integer policyId) throws SQLException;
	List<Assured> getAllActiveAssured();
	List<Assured> searchAssured(Map<String,Object> params) throws SQLException;
}
