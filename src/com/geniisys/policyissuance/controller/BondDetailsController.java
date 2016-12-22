package com.geniisys.policyissuance.controller;

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
import com.geniisys.common.service.BondDetailService;
import com.geniisys.common.service.Gipi_PolbasicService;
import com.geniisys.common.service.PolicyNoService;
import com.geniisys.common.service.impl.BondDetailServiceImpl;
import com.geniisys.common.service.impl.Gipi_PolbasicServiceImpl;
import com.geniisys.common.service.impl.PolicyNoServiceImpl;

public class BondDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		String page = "";
		String errorMsg = "";

		if (action.equals("toBondDetailsPage")) {

			page = "/pages/policy issuance/bond detail maintenance/bondDetail.jsp";
			getServletContext().getRequestDispatcher(page).forward(request, response);
		}
		if (action.equals("populateBondDetails")) {
			Gipi_PolbasicService gipiPolbasicService = new Gipi_PolbasicServiceImpl();
			BondDetailService bondDetailService = new BondDetailServiceImpl();
			Integer policyId = 0;
			String bondDtl = "";
			try {
				policyId = (Integer) gipiPolbasicService.fetchPolicyId(request);
				request.setAttribute("policyId", policyId);

				if (!policyId.equals(null)) {
					bondDtl = bondDetailService.getBondDetail(policyId);
					request.setAttribute("bondDtl", bondDtl);
				}

			} catch (SQLException e) {
				errorMsg = e.getMessage().toString();
			} catch (NumberFormatException e) {
				errorMsg = "No data found.";
			} catch (NullPointerException e) {
				errorMsg = "No data found.";
			}

			//System.out.println("errorMsg " + errorMsg);
			request.setAttribute("errorMsg", errorMsg);
			page = "/pages/policy issuance/bond detail maintenance/bondDetailSub.jsp";
			getServletContext().getRequestDispatcher(page).forward(request, response);
		}
		if (action.equals("updateBondDetails")) {
			BondDetailService bondDetailService = new BondDetailServiceImpl();
			try {
				bondDetailService.updateBondDetail(request);
			} catch (SQLException e) {
				errorMsg = e.getMessage();
			}
			
			request.setAttribute("errorMsg", errorMsg);
			page = "/pages/policy issuance/bond detail maintenance/bondDetailSub.jsp";
			getServletContext().getRequestDispatcher(page).forward(request, response);
		}
	}
}
