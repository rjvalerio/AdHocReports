package com.geniisys.common.entity;

public class Branch {
	
	private String issCd;
	private String issName;
	private String pdfSw;
	private String credPdfSw;
	private String issId;
	
	public Branch() {}
	
	public Branch(String issCd,String issName){
		this.issCd = issCd;
		this.issName = issName;
	}
	
	public Branch(String issCd,String issName,String pdfSw,String credPdfSw){
		this.issCd = issCd;
		this.issName = issName;
		this.pdfSw = pdfSw;
		this.credPdfSw = credPdfSw;
	}
	
	public Branch(String issId,String issCd,String issName){
		this.issId = issId;
		this.issCd = issCd;
		this.issName = issName;
	}

	public String getIssCd() {
		return issCd;
	}

	public void setIssCd(String issCd) {
		this.issCd = issCd;
	}

	public String getIssName() {
		return issName;
	}

	public void setIssName(String issName) {
		this.issName = issName;
	}

	public String getPdfSw() {
		return pdfSw;
	}

	public void setPdfSw(String pdfSw) {
		this.pdfSw = pdfSw;
	}

	public String getCredPdfSw() {
		return credPdfSw;
	}

	public void setCredPdfSw(String credPdfSw) {
		this.credPdfSw = credPdfSw;
	}

	public String getIssId() {
		return issId;
	}

	public void setIssId(String issId) {
		this.issId = issId;
	}
	
	
}
