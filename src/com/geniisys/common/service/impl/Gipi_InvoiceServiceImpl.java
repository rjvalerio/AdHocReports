package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.Gipi_InvoiceDAO;
import com.geniisys.common.dao.impl.Gipi_InvoiceDAOImpl;
import com.geniisys.common.entity.Gipi_Invoice;
import com.geniisys.common.service.Gipi_InvoiceService;

public class Gipi_InvoiceServiceImpl implements Gipi_InvoiceService {

	private Gipi_InvoiceDAO gipi_InvoiceDAO = new Gipi_InvoiceDAOImpl();

	public Gipi_InvoiceDAO getGipi_InvoiceDAO() {
		return gipi_InvoiceDAO;
	}

	public void setGipi_InvoiceDAO(Gipi_InvoiceDAO gipi_InvoiceDAO) {
		this.gipi_InvoiceDAO = gipi_InvoiceDAO;
	}

	public List<Gipi_Invoice> fetchGipiInvoice(Integer policyId) throws SQLException {
		//return this.gipi_InvoiceDAO.fetchGipiInvoice(policyId);
		return this.getGipi_InvoiceDAO().fetchGipiInvoice(policyId);
	}

}
