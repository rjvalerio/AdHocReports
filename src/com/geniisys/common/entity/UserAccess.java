package com.geniisys.common.entity;

public class UserAccess {
	private Integer tranCd;
	private String lineCd;
	private String issCd;
	
	public UserAccess() {}
	
	public UserAccess(Integer tranCd,String lineCd,String issCd){
		this.tranCd = tranCd;
		this.lineCd = lineCd;
		this.issCd = issCd;
	}

	public Integer getTranCd() {
		return tranCd;
	}

	public void setTranCd(Integer tranCd) {
		this.tranCd = tranCd;
	}

	public String getLineCd() {
		return lineCd;
	}

	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}

	public String getIssCd() {
		return issCd;
	}

	public void setIssCd(String issCd) {
		this.issCd = issCd;
	}
}
