package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.AccountingEntry;

public interface AccountingEntryDAO {
	List<AccountingEntry> getAllDate() throws SQLException;
}
