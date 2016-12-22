package com.geniisys.common.entity;

public class Subline {
	
	private String lineCd;
	private String sublineCd;
	private String sublineName;
	private String pdfSw;
	
	public Subline() {}
	
	public Subline(String lineCd,String sublineCd,String sublineName){
		this.lineCd = lineCd;
		this.sublineCd = sublineCd;
		this.sublineName = sublineName;
	}
	
	public Subline(String lineCd,String sublineCd,String sublineName,String pdfSw){
		this.lineCd = lineCd;
		this.sublineCd = sublineCd;
		this.sublineName = sublineName;
		this.pdfSw = pdfSw;
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

	public String getSublineName() {
		return sublineName;
	}

	public void setSublineName(String sublineName) {
		this.sublineName = sublineName;
	}

	public String getPdfSw() {
		return pdfSw;
	}

	public void setPdfSw(String pdfSw) {
		this.pdfSw = pdfSw;
	}
	
}
