package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.dao.IntermediaryDAO;
import com.geniisys.common.dao.impl.IntermediaryDAOImpl;
import com.geniisys.common.entity.Assured;
import com.geniisys.common.entity.Intermediary;
import com.geniisys.common.service.IntermediaryService;

public class IntermediaryServiceImpl implements IntermediaryService{
	
	private IntermediaryDAO intmDAO = new IntermediaryDAOImpl();

	@Override
	public List<Intermediary> getAllActiveIntermediary() {
		return this.intmDAO.getAllActiveIntermediary();
	}

	@Override
	public List<Intermediary> getAllIntmType() {
		return this.intmDAO.getAllIntmType();
	}

	@Override
	public List<Intermediary> getAllDealersIntm() {
		return this.intmDAO.getAllDealersIntm();
	}

	@Override
	public String searchIntermediary(HttpServletRequest request) throws SQLException {
		String parameter = request.getParameter("parameter");
		System.out.println("parameter: " + parameter);
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("parameter", parameter);
		List<Intermediary> intmList = this.intmDAO.searchIntermediary(params);
		String intmString = "{ rows: [";
		Integer count = 1;
		if(!intmList.isEmpty()){
		for (Intermediary intm : intmList) {
			//System.out.print(assured.getAssdNo() + ",");
			intmString = intmString + "{id:" + count + ", data: [\"" + intm.getIntmNo() + "\",\""+ intm.getIntmType() + "\",\""+ intm.getIntmName() + "\"]},";
			//tariffString = tariffString + "{id:" + count + ", data: [\"" + tariff.getTarfCd() + "\",\"" + tariff.getTarfDesc() + "\"," + tariff.getPdfSw() + "]},";
			count++;
		}
		System.out.println("count " +count);
		intmString = intmString.substring(0, intmString.length() - 1) + "]}";
		intmString.trim();
		}else{
			intmString = "";
		}
		return intmString;
	}
	
	
}
