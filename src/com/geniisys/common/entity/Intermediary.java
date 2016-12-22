package com.geniisys.common.entity;

public class Intermediary {
	
	private Integer intmNo;
	private String intmName;
	private String intmType;
	
	public Intermediary() {}
	
	public Intermediary(Integer intmNo,String intmName, String intmType){
		this.intmNo = intmNo;
		this.intmName = intmName;
		this.intmType = intmType;
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
}
