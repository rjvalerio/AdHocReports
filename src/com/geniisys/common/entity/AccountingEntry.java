package com.geniisys.common.entity;

public class AccountingEntry {

	private String entryDate;
	private Integer rownum;
	
	public AccountingEntry() {}
	
	public AccountingEntry(String entryDate,Integer rownum){
		this.entryDate = entryDate;
		this.rownum = rownum;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public Integer getRownum() {
		return rownum;
	}

	public void setRownum(Integer rownum) {
		this.rownum = rownum;
	}


}
