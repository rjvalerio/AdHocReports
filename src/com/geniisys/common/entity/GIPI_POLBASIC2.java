package com.geniisys.common.entity;

import java.math.BigDecimal;

public class GIPI_POLBASIC2 {
	private Integer policyId;
	private String lineCd;
	private String sublineCd;
	private String issCd;
	private Integer issueYy;
	private Integer polSeqNo;
	private String endtIssCd;
	private Integer endtYy;
	private Integer endtSeqNo;
	private Integer renewNo;
	private Integer parId;
	private String effDate;
	private String expiryDate;
	private Integer assdNo;
	private String designation;
	private String address1;
	private String address2;
	private String address3;
	private String mortgName;
	private BigDecimal tsiAmt;
	private BigDecimal premAmt;
	
	public GIPI_POLBASIC2() {}
	
	public GIPI_POLBASIC2(Integer policyId,String lineCd,String sublineCd,String issCd,Integer issueYy,Integer polSeqNo,
			String endtIssCd,Integer endtYy,Integer endtSeqNo,Integer renewNo,Integer parId,String effDate,String expiryDate,
			Integer assdNo,String designation,String address1,String address2,String address3,String mortgName,
			BigDecimal tsiAmt,BigDecimal premAmt){
		this.policyId = policyId;
		this.lineCd = lineCd;
		this.sublineCd = sublineCd;
		this.issCd = issCd;
		this.issueYy = issueYy;
		this.polSeqNo = polSeqNo;
		this.endtIssCd = endtIssCd;
		this.endtYy=endtYy;
		this.endtSeqNo=endtSeqNo;
		this.renewNo= renewNo;
		this.parId=parId;
		this.effDate=effDate;
		this.expiryDate=expiryDate;
		this.assdNo=assdNo;
		this.designation=designation;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.mortgName = mortgName;
		this.tsiAmt = tsiAmt;
		this.premAmt = premAmt;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
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

	public Integer getIssueYy() {
		return issueYy;
	}

	public void setIssueYy(Integer issueYy) {
		this.issueYy = issueYy;
	}

	public Integer getPolSeqNo() {
		return polSeqNo;
	}

	public void setPolSeqNo(Integer polSeqNo) {
		this.polSeqNo = polSeqNo;
	}

	public String getEndtIssCd() {
		return endtIssCd;
	}

	public void setEndtIssCd(String endtIssCd) {
		this.endtIssCd = endtIssCd;
	}

	public Integer getEndtYy() {
		return endtYy;
	}

	public void setEndtYy(Integer endtYy) {
		this.endtYy = endtYy;
	}

	public Integer getEndtSeqNo() {
		return endtSeqNo;
	}

	public void setEndtSeqNo(Integer endtSeqNo) {
		this.endtSeqNo = endtSeqNo;
	}

	public Integer getRenewNo() {
		return renewNo;
	}

	public void setRenewNo(Integer renewNo) {
		this.renewNo = renewNo;
	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getAssdNo() {
		return assdNo;
	}

	public void setAssdNo(Integer assdNo) {
		this.assdNo = assdNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public String getMortgName() {
		return mortgName;
	}

	public void setMortgName(String mortgName) {
		this.mortgName = mortgName;
	}

	public BigDecimal getTsiAmt() {
		return tsiAmt;
	}

	public void setTsiAmt(BigDecimal tsiAmt) {
		this.tsiAmt = tsiAmt;
	}

	public BigDecimal getPremAmt() {
		return premAmt;
	}

	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	
	
}
