package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Gipi_Invoice;

public interface Gipi_InvoiceDAO {
	List<Gipi_Invoice> fetchGipiInvoice(Integer polciyId) throws SQLException;
}
