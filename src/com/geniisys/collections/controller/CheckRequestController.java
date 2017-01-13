package com.geniisys.collections.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibatis.sqlmap.client.SqlMapClient;

public class CheckRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SqlMapClient sqlMap;
	public static String errorMsg = "";

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@SuppressWarnings("static-access")
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equals("toCheckRequest")) {
			String page = "http://10.20.39.122/intertrade/intertrade_request.php?useraccess=";
			HttpSession session = request.getSession();

			String userId = (String) session.getAttribute("adhocUser");

			request.setAttribute("url", page + userId);
			System.out.println(page + userId);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pages/blank.jsp");
			dispatcher.forward(request, response);
		}
	}
}
