package com.geniisys.collections.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.collections.dao.PaymentRequestDao;
import com.geniisys.collections.dao.impl.PaymentRequestDaoImpl;
import com.geniisys.collections.service.PaymentRequestService;
import com.geniisys.common.entity.CheckReqIntermediary;
import com.geniisys.common.entity.PaymentRequest;

public class PaymentRequestServiceImpl implements PaymentRequestService {
	
	private PaymentRequestDao paymentReqDao = new PaymentRequestDaoImpl();
	
	public PaymentRequestDao getPaymentReqDao() {
		return paymentReqDao;
	}

	public void setPaymentReqDao(PaymentRequestDao paymentReqDao) {
		this.paymentReqDao = paymentReqDao;
	}

	@Override
	public Map<String,Object> getPaymentRequestDetails(HttpServletRequest request) throws SQLException {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		Map<String,Object> params = getParams(request);
		PaymentRequest paymentReq = paymentReqDao.getPaymentRequest(params);
		resultMap.put("paymentRequest",paymentReq);
		resultMap.put("checkReqIntmList", getCheckReqIntermediary(paymentReq));
		return resultMap;
	}
	

	public String getCheckReqIntermediary(PaymentRequest paymentReq) throws SQLException {
		List<CheckReqIntermediary> checkReqIntmList = paymentReqDao.getCheckReqIntermediary(paymentReq.getTranId());
		String checkDtlsString = "{ rows: [";
		Integer count = 1;
		for (CheckReqIntermediary checkreqIntm : checkReqIntmList) {
			checkDtlsString = checkDtlsString + "{ id:" + count + ", data: [" + checkreqIntm.getIntmNo() + ",\"" + checkreqIntm.getIntmType() + "\",\"" + checkreqIntm.getIntmName() 
								+  "\",\"" + checkreqIntm.getIssCd() +  "\"," + checkreqIntm.getPremSeqNo() +  ",\"" + checkreqIntm.getRemarks() + " \""  + "]},";
			count++;
		}
		checkDtlsString = checkDtlsString.substring(0, checkDtlsString.length() - 1) + "]}";
		checkDtlsString.trim();
		return checkDtlsString;
	}
	
	
	public Map<String,Object> getParams(HttpServletRequest request){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("documentCd", request.getParameter("documentCd"));
		params.put("branchCd", request.getParameter("branchCd"));
		params.put("docYear", Integer.parseInt(request.getParameter("docYear")));
		params.put("docMm", Integer.parseInt(request.getParameter("docMm")));
		params.put("docSeqNo",Integer.parseInt(request.getParameter("docSeqNo")));
		return params;
	}

	@Override
	public void updateRemarks(HttpServletRequest request) throws SQLException {
		String remarks =  request.getParameter("remarksArray");
		String premSeqNo =  request.getParameter("premSeqNoArray");
		String issCd =  request.getParameter("issCdArray");
		String[] remarksArray = remarks.split(",");
		String[] premSeqNoArray = premSeqNo.split(",");
		String[] issCdArray = issCd.split(",");
		
		for (int i = 0; i < premSeqNoArray.length; i++) {
			Map<String,Object> params = new HashMap<String,Object>();
			params.put("premSeqNo", Integer.parseInt(premSeqNoArray[i]));
			params.put("issCd", issCdArray[i]);
			if((remarksArray.length > 0) && ( i < remarksArray.length)){
				params.put("remarks",remarksArray[i]);
			}else{
				params.put("remarks"," ");
			}
			paymentReqDao.updateremarks(params);
		}
		
		
		
		
	}

	

}
