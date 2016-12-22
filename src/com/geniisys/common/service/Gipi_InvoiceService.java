package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Gipi_Invoice;

public interface Gipi_InvoiceService {
	List<Gipi_Invoice> fetchGipiInvoice(Integer polciyId) throws SQLException;

}
