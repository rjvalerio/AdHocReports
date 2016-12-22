package com.geniisys.common.entity;

public class Gipi_Invoice {
	private String issCd;
	private Integer premSeqNo;
	
	public Gipi_Invoice() {
	}
	
	public Gipi_Invoice(String issCd, Integer premSeqNo){
		this.issCd = issCd;
		this.premSeqNo = premSeqNo;
	}
	
	public String getIssCd() {
		return issCd;
	}
	public void setIssCd(String issCd) {
		this.issCd = issCd;
	}
	public Integer getPremSeqNo() {
		return premSeqNo;
	}
	public void setPremSeqNo(Integer premSeqNo) {
		this.premSeqNo = premSeqNo;
	}

}
