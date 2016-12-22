package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.AssuredDAO;
import com.geniisys.common.dao.impl.AssuredDAOImpl;
import com.geniisys.common.entity.Assured;
import com.geniisys.common.service.AssuredService;

public class AssuredServiceImpl implements AssuredService {

	private AssuredDAO assuredDAO = new AssuredDAOImpl();

	public AssuredDAO getAssuredDAO() {
		return assuredDAO;
	}

	public void setAssuredDAO(AssuredDAO assuredDAO) {
		this.assuredDAO = assuredDAO;
	}

	@Override
	public List<Assured> getAssured(Integer assdNo) throws SQLException {
		return this.getAssuredDAO().getAssured(assdNo);
	}

	@Override
	public Integer fetchAssuredNo(Integer policyId) throws SQLException {
		return this.getAssuredDAO().fetchAssuredNo(policyId);
	}

	@Override
	public Integer fetchAssdNoGipiPolbasic(Integer policyId) throws SQLException {
		return this.getAssuredDAO().fetchAssdNoGipiPolbasic(policyId);
	}

	@Override
	public List<Assured> getAllActiveAssured() {
		return this.assuredDAO.getAllActiveAssured();
	}

	@Override
	public String getAllActiveAssured2() {
		List<Assured> assuredList = this.assuredDAO.getAllActiveAssured();
		String assuredString = "{ options: [{value:\"\",text:\"\",selected: true},";
		Integer count = 1;

		for (Assured assured : assuredList) {
			assuredString = assuredString + "{value:\"" + assured.getAssdNo() + "\", text: \"" + assured.getAssdName()
					+ "\"},";
			count++;
		}
		assuredString = assuredString.substring(0, assuredString.length() - 1) + "]}";
		// System.out.println(assuredString.trim());
		return assuredString.trim();
	}

	@Override
	public String getAllActiveAssured3() {
		List<Assured> assuredList = this.assuredDAO.getAllActiveAssured();
		String assuredString = "";
		for (Assured assured : assuredList) {
			assuredString = assuredString + ",'" + assured.getAssdName() + "'";
		}
		assuredString = assuredString.substring(1);
		return assuredString.trim();

	}

	@Override
	public String searchAssured(HttpServletRequest request) throws SQLException {
		String parameter = request.getParameter("parameter");
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("parameter", parameter);
		List<Assured> assuredList = this.assuredDAO.searchAssured(params);
		String assuredString = "{ rows: [";
		Integer count = 1;
		if(!assuredList.isEmpty()){
		for (Assured assured : assuredList) {
			System.out.print(assured.getAssdNo() + ",");
			assuredString = assuredString + "{id:" + count + ", data: [\"" + assured.getAssdNo() + "\",\""+ assured.getAssdName() + "\"]},";
			//tariffString = tariffString + "{id:" + count + ", data: [\"" + tariff.getTarfCd() + "\",\"" + tariff.getTarfDesc() + "\"," + tariff.getPdfSw() + "]},";
			count++;
		}
		System.out.println("count " +count);
		assuredString = assuredString.substring(0, assuredString.length() - 1) + "]}";
		assuredString.trim();
		}else{
			assuredString = "";
		}
		return assuredString;
	}

}
