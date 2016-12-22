package com.geniisys.common.entity;

public class PolicyNo {
	private String lineCd;
	private String sublineCd;
	private String issCd;
	private Integer issueYY;
	private Integer polSeqNo;
	private Integer renewNo;
	
	public PolicyNo(){}
	
	public PolicyNo(String lineCd,String sublineCd,String issCd, Integer issueYY,Integer polSeqNo,Integer renewNo){
		this.lineCd=lineCd;
		this.sublineCd = sublineCd;
		this.issCd = issCd;
		this.issueYY = issueYY;
		this.polSeqNo = polSeqNo;
		this.renewNo = renewNo;
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

	public Integer getIssueYY() {
		return issueYY;
	}

	public void setIssueYY(Integer issueYY) {
		this.issueYY = issueYY;
	}

	public Integer getPolSeqNo() {
		return polSeqNo;
	}

	public void setPolSeqNo(Integer polSeqNo) {
		this.polSeqNo = polSeqNo;
	}

	public Integer getRenewNo() {
		return renewNo;
	}

	public void setRenewNo(Integer renewNo) {
		this.renewNo = renewNo;
	}
	
	
}
