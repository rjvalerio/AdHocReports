package com.geniisys.common.entity;

public class Signatory {
	private Integer signatoryId;
	private String signatory;
	private Integer status;
	private String designation;
	private String fileName;
	
	public Signatory(){}
	
	public Signatory(Integer signatoryId,String signatory,Integer status,String designation,String fileName){
		this.signatoryId = signatoryId;
		this.signatory = signatory;
		this.status = status;
		this.designation = designation;
		this.fileName = fileName;
	}

	public Integer getSignatoryId() {
		return signatoryId;
	}

	public void setSignatoryId(Integer signatoryId) {
		this.signatoryId = signatoryId;
	}

	public String getSignatory() {
		return signatory;
	}

	public void setSignatory(String signatory) {
		this.signatory = signatory;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
