package com.geniisys.common.entity;

public class Tariff {
	
	private String tarfCd;
	private String tarfDesc;
	private String pdfSw;
	
	public Tariff() {}

	public Tariff(String tarfCd,String tarfDesc,String pdfSw){
		this.tarfCd = tarfCd;
		this.tarfDesc = tarfDesc;
		this.pdfSw = pdfSw;
	}
	
	public String getTarfCd() {
		return tarfCd;
	}

	public void setTarfCd(String tarfCd) {
		this.tarfCd = tarfCd;
	}

	public String getTarfDesc() {
		return tarfDesc;
	}

	public void setTarfDesc(String tarfDesc) {
		this.tarfDesc = tarfDesc;
	}

	public String getPdfSw() {
		return pdfSw;
	}

	public void setPdfSw(String pdfSw) {
		this.pdfSw = pdfSw;
	}
	
}
