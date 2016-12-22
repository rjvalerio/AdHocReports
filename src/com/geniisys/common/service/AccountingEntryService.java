
package com.geniisys.common.service;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.AccountingEntry;

public interface AccountingEntryService {
	List<AccountingEntry> getAllDate() throws SQLException;
}
