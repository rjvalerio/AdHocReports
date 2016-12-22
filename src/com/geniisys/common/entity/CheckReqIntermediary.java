package com.geniisys.common.entity;

public class CheckReqIntermediary {
	private Integer intmNo;
	private String intmName;
	private String intmType;
	private String remarks;
	private String issCd;
	private Integer premSeqNo;
	
	public CheckReqIntermediary() {
		super();
	}
	
	
	public CheckReqIntermediary(Integer intmNo, String intmName, String intmType, String remarks, String issCd,
			Integer premSeqNo) {
		super();
		this.intmNo = intmNo;
		this.intmName = intmName;
		this.intmType = intmType;
		this.remarks = remarks;
		this.issCd = issCd;
		this.premSeqNo = premSeqNo;
	}


	public Integer getIntmNo() {
		return intmNo;
	}
	public void setIntmNo(Integer intmNo) {
		this.intmNo = intmNo;
	}
	public String getIntmName() {
		return intmName;
	}
	public void setIntmName(String intmName) {
		this.intmName = intmName;
	}
	public String getIntmType() {
		return intmType;
	}
	public void setIntmType(String intmType) {
		this.intmType = intmType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
