package com.geniisys.common.entity;

public class Gipi_Polbasic {
	private String assdNo;
	private String refPolNo;
	private String refNo;
	private Integer endtNo;
	private String inceptDate;
	private String expiryDate;
	private String issueDate;
	private String address1;
	private String address2;
	private String address3;
	private Integer tsiAmt;
	private String wordsAmt;
	private Integer premAmt;
	private String obligee;
	
	private String notary;
	
	private String notary_no;
	private String notary_issue;
	private String notary_expiry;
	private String notary_place;

	public Gipi_Polbasic() {
	}

	public Gipi_Polbasic(String assdNo, String refPolNo, String refNo, Integer endtNo, String inceptDate, String expiryDate,
				String issueDate, String address1, String address2, String address3, Integer tsiAmt, String wordsAmt, Integer premAmt,String obligee) {
		this.assdNo = assdNo;
		this.refPolNo = refPolNo;
		this.refNo = refNo;
		this.endtNo = endtNo;
		this.inceptDate = inceptDate;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.tsiAmt = tsiAmt;
		this.wordsAmt = wordsAmt;
		this.premAmt = premAmt;
		this.obligee = obligee;
	}
	
	public Gipi_Polbasic(String assdNo, String refPolNo, String refNo, Integer endtNo, String inceptDate, String expiryDate,
			String issueDate, String address1, String address2, String address3, Integer tsiAmt, String wordsAmt, Integer premAmt,String obligee,
			String notary,String notary_no,String notary_issue,String notary_expiry,String notary_place) {
	this.assdNo = assdNo;
	this.refPolNo = refPolNo;
	this.refNo = refNo;
	this.endtNo = endtNo;
	this.inceptDate = inceptDate;
	this.expiryDate = expiryDate;
	this.issueDate = issueDate;
	this.address1 = address1;
	this.address2 = address2;
	this.address3 = address3;
	this.tsiAmt = tsiAmt;
	this.wordsAmt = wordsAmt;
	this.premAmt = premAmt;
	this.obligee = obligee;
	this.notary = notary;
	this.notary_no = notary_no;
	this.notary_expiry = notary_expiry;
	this.notary_issue = notary_issue;
	this.notary_place = notary_place;
}

	public String getAssdNo() {
		return assdNo;
	}

	public void setAssdNo(String assdNo) {
		this.assdNo = assdNo;
	}

	public String getRefPolNo() {
		return refPolNo;
	}

	public void setRefPolNo(String refPolNo) {
		this.refPolNo = refPolNo;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Integer getEndtNo() {
		return endtNo;
	}

	public void setEndtNo(Integer endtNo) {
		this.endtNo = endtNo;
	}

	public String getInceptDate() {
		return inceptDate;
	}

	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public Integer getTsiAmt() {
		return tsiAmt;
	}

	public void setTsiAmt(Integer tsiAmt) {
		this.tsiAmt = tsiAmt;
	}

	public String getWordsAmt() {
		return wordsAmt;
	}

	public void setWordsAmt(String wordsAmt) {
		this.wordsAmt = wordsAmt;
	}

	public Integer getPremAmt() {
		return premAmt;
	}

	public void setPremAmt(Integer premAmt) {
		this.premAmt = premAmt;
	}
	
	public String getObligee() {
		return obligee;
	}

	public void setObligee(String obligee) {
		this.obligee = obligee;
	}

	public String getNotary() {
		return notary;
	}

	public void setNotary(String notary) {
		this.notary = notary;
	}

	public String getNotary_no() {
		return notary_no;
	}

	public void setNotary_no(String notary_no) {
		this.notary_no = notary_no;
	}

	public String getNotary_issue() {
		return notary_issue;
	}

	public void setNotary_issue(String notary_issue) {
		this.notary_issue = notary_issue;
	}

	public String getNotary_expiry() {
		return notary_expiry;
	}

	public void setNotary_expiry(String notary_expiry) {
		this.notary_expiry = notary_expiry;
	}

	public String getNotary_place() {
		return notary_place;
	}

	public void setNotary_place(String notary_place) {
		this.notary_place = notary_place;
	}
}
