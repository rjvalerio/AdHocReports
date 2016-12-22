package com.geniisys.common.entity;

public class PaymentRequest {
	private String documentCd;
	private String branchCd;
	private Integer docYear ;
	private Integer docMm;
	private Integer docSeqNo ;
	private Integer tranId;
	private String payeeClassCd;
	private Integer payeeCd;
	private String payee;
	private String particulars;
	
	public PaymentRequest() {
		super();
	}
	
	public PaymentRequest(String documentCd, String branchCd, Integer docYear, Integer docMm, Integer docSeqNo,
			Integer tranId, String payeeClassCd, Integer payeeCd, String payee, String particulars) {
		super();
		this.documentCd = documentCd;
		this.branchCd = branchCd;
		this.docYear = docYear;
		this.docMm = docMm;
		this.docSeqNo = docSeqNo;
		this.tranId = tranId;
		this.payeeClassCd = payeeClassCd;
		this.payeeCd = payeeCd;
		this.payee = payee;
		this.particulars = particulars;
	}

	public String getDocumentCd() {
		return documentCd;
	}
	public void setDocumentCd(String documentCd) {
		this.documentCd = documentCd;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public Integer getDocYear() {
		return docYear;
	}
	public void setDocYear(Integer docYear) {
		this.docYear = docYear;
	}
	public Integer getDocMm() {
		return docMm;
	}
	public void setDocMm(Integer docMm) {
		this.docMm = docMm;
	}
	public Integer getDocSeqNo() {
		return docSeqNo;
	}
	public void setDocSeqNo(Integer docSeqNo) {
		this.docSeqNo = docSeqNo;
	}

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public String getPayeeClassCd() {
		return payeeClassCd;
	}


	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}


	public Integer getPayeeCd() {
		return payeeCd;
	}

	public void setPayeeCd(Integer payeeCd) {
		this.payeeCd = payeeCd;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getParticulars() {
		return particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	


}
