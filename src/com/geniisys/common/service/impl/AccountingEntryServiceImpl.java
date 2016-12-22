package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.AccountingEntryDAO;
import com.geniisys.common.dao.impl.AccountingEntryDAOImpl;
import com.geniisys.common.entity.AccountingEntry;
import com.geniisys.common.service.AccountingEntryService;

public class AccountingEntryServiceImpl implements AccountingEntryService{
	
	private AccountingEntryDAO accountingEntryDAO = new AccountingEntryDAOImpl();

	public AccountingEntryDAO getAccountingEntryDAO() {
		return accountingEntryDAO;
	}

	public void setAccountingEntryDAO(AccountingEntryDAO accountingEntryDAO) {
		this.accountingEntryDAO = accountingEntryDAO;
	}

	@Override
	public List<AccountingEntry> getAllDate() throws SQLException {
		return this.accountingEntryDAO.getAllDate();
	}

}
