package com.geniisys.common.entity;

public class Assured {
	private String assdNo;
	private String assdName;
	private String tranDate; //date
	private String mailAddr1;
	private String mailAddr2;
	private String mailAddr3;
	
	public Assured() {}
	
	public Assured(String assdNo,String assdName,String tranDate,String mailAddr1,String mailAddr2,String mailAddr3){
		this.assdNo = assdNo;
		this.assdName = assdName;
		this.tranDate = tranDate;
		this.mailAddr1 = mailAddr1;
		this.mailAddr2 = mailAddr2;
		this.mailAddr3 = mailAddr3;
	}

	public String getAssdNo() {
		return assdNo;
	}

	public void setAssdNo(String assdNo) {
		this.assdNo = assdNo;
	}

	public String getAssdName() {
		return assdName;
	}

	public void setAssdName(String assdName) {
		this.assdName = assdName;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getMailAddr1() {
		return mailAddr1;
	}

	public void setMailAddr1(String mailAddr1) {
		this.mailAddr1 = mailAddr1;
	}

	public String getMailAddr2() {
		return mailAddr2;
	}

	public void setMailAddr2(String mailAddr2) {
		this.mailAddr2 = mailAddr2;
	}

	public String getMailAddr3() {
		return mailAddr3;
	}

	public void setMailAddr3(String mailAddr3) {
		this.mailAddr3 = mailAddr3;
	}
	
	

}
