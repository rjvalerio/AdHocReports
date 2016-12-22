package com.geniisys.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geniisys.util.ConnectionUtil;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class PrintController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String dir = request.getParameter("directory");
		String dir = getServletContext().getRealPath("WEB-INF/classes/com/geniisys/reports");
		String outputDir =getServletContext().getRealPath("");
		String reportName = request.getParameter("reportName");
		String paramTxt = request.getParameter("paramTxt");
		String fileName = dir + "\\" + reportName + ".jasper";
		String outFileName = outputDir + "\\" + reportName + ".pdf";
		System.out.println("outputfilename " + outFileName);
		/*HashMap parameters = new HashMap();
		parameters.put("P_POLICY_ID", request.getParameter("paramTxt"));*/
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("P_POLICY_ID", paramTxt);
		try {
			Connection conn = ConnectionUtil.getConnection();
			//JasperPrint print = JasperFillManager.fillReport(fileName, parameters, conn);
			JasperPrint print = JasperFillManager.fillReport(fileName, parameters, conn);
			//JRExporter exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
			JRExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,	outFileName);
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
			exporter.exportReport();
			//JasperViewer.viewReport(print, false);
		} catch (JRException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getServletContext().getRequestDispatcher("/pages/sample.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
