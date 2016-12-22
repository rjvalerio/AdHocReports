package com.geniisys.common.entity;

public class CoSignatory {
	private Integer prinId;
	private String signatory;
	private String designation;
	private String issue_date;
	private String issue_place;
	private String res_cert;
	
	public CoSignatory(){}
	
	public CoSignatory(Integer prinId,String signatory,String designation,String issue_date,String issue_place,String res_cert){
		this.prinId = prinId;
		this.signatory = signatory;
		this.designation = designation;
		this.issue_date = issue_date;
		this.issue_place = issue_place;
		this.res_cert = res_cert;
	}

	public Integer getPrinId() {
		return prinId;
	}

	public void setPrinId(Integer prinId) {
		this.prinId = prinId;
	}

	public String getSignatory() {
		return signatory;
	}

	public void setSignatory(String signatory) {
		this.signatory = signatory;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getIssue_place() {
		return issue_place;
	}

	public void setIssue_place(String issue_place) {
		this.issue_place = issue_place;
	}

	public String getRes_cert() {
		return res_cert;
	}

	public void setRes_cert(String res_cert) {
		this.res_cert = res_cert;
	}

	
}
