package com.geniisys.claims.entity;

public class ClaimNo {
	private String lineCd;
	private String sublineCd;
	private String issCd;
	private Integer clmYy;
	private Integer clmSeqNo;
	
	public ClaimNo(){}
	
	public ClaimNo(String lineCd,String sublineCd,String issCd,Integer clmYy,Integer clmSeqNo){
		this.lineCd = lineCd;
		this.sublineCd = sublineCd;
		this.issCd = issCd;
		this.clmYy = clmYy;
		this.clmSeqNo = clmSeqNo;
	}

	public String getLineCd() {
		return lineCd;
	}

	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}

	public String getSublineCd() {
		return sublineCd;
	}

	public void setSublineCd(String sublineCd) {
		this.sublineCd = sublineCd;
	}

	public String getIssCd() {
		return issCd;
	}

	public void setIssCd(String issCd) {
		this.issCd = issCd;
	}

	public Integer getClmYy() {
		return clmYy;
	}

	public void setClmYy(Integer clmYy) {
		this.clmYy = clmYy;
	}

	public Integer getClmSeqNo() {
		return clmSeqNo;
	}

	public void setClmSeqNo(Integer clmSeqNo) {
		this.clmSeqNo = clmSeqNo;
	}
	
	
}
