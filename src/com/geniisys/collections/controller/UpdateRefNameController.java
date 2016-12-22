package com.geniisys.collections.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.geniisys.collections.service.PaymentRequestService;
import com.geniisys.collections.service.impl.PaymentRequestServiceImpl;
import com.geniisys.common.entity.CheckReqIntermediary;
import com.geniisys.common.entity.PaymentRequest;

public class UpdateRefNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private PaymentRequestService paymentReqService = new PaymentRequestServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		PaymentRequest paymentRequest = new PaymentRequest();
		Map<String,Object> resultMap = new HashMap<String,Object>();
		String checkReqIntmList = "";
		String page = "";
		String errorMsg = "";
		
		try {
				if(action.equals("populateTables")){
					resultMap = paymentReqService.getPaymentRequestDetails(request);
					paymentRequest = (PaymentRequest) resultMap.get("paymentRequest");
					checkReqIntmList =  (String) resultMap.get("checkReqIntmList");
				}else if(action.equals("saveRemarks")){
					paymentReqService.updateRemarks(request);
				}
			} catch (SQLException e) {
				errorMsg = "SQL Exception.";
			}catch (NullPointerException e) {
				errorMsg = "No data found.";
			}finally{
				page = "/pages/collections/update referror name/paymentReqDtl.jsp";
				request.setAttribute("paymentRequest", paymentRequest);
				request.setAttribute("checkReqIntmList", checkReqIntmList);
				request.setAttribute("errorMsg", errorMsg);
				getServletContext().getRequestDispatcher(page).forward(request, response);
			}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
