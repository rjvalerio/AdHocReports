package com.geniisys.claims.entity;

public class DemandLetterInsert {
	private Integer claimId;
	private Integer policyId;
	private String dspLossDate;
	private String assdName;
	private String lossLoc1;
	private String lossLoc2;
	private String lossLoc3;
	private String make;
	private String policyNumber;
	private String recoveryNo;
	private String demandType;
	private String extra1;
	private String extra2;
	private String dateSend;
	private String demands;
	private String ctrlNo;
	private String userId;
	private String controlNo;
	private String car1;
	private String plateNo1;
	private String car2;
	private String plateNo2;
	private String amtWord1;
	private String amtWord2;
	private String amtWord3;
	private String contactNo;
	private String branchCd;
	private String userEmail;
	private String claimNo;

	public DemandLetterInsert() {
	}

	public DemandLetterInsert(Integer claimId, Integer policyId, String dspLossDate, String assdName, String lossLoc1,
			String lossLoc2, String lossLoc3, String make, String policyNumber, String recoveryNo, String demandType,
			String extra1, String extra2, String dateSend, String demands, String ctrlNo, String userId,
			String controlNo, String car1, String plateNo1, String car2, String plateNo2, String amtWord1,
			String amtWord2, String amtWord3, String contactNo,String branchCd,String userEmail,String claimNo) {
		this.claimId = claimId;
		this.policyId = policyId;
		this.dspLossDate = dspLossDate;
		this.assdName = assdName;
		this.lossLoc1 = lossLoc1;
		this.lossLoc2 = lossLoc2;
		this.lossLoc3 = lossLoc3;
		this.make = make;
		this.policyNumber = policyNumber;
		this.recoveryNo = recoveryNo;
		this.demandType = demandType;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.dateSend = dateSend;
		this.demands = demands;
		this.ctrlNo = ctrlNo;
		this.userId = userId;
		this.controlNo = controlNo;
		this.car1 = car1;
		this.plateNo1 = plateNo1;
		this.car2 = car2;
		this.plateNo2 = plateNo2;
		this.amtWord1 = amtWord1;
		this.amtWord2 = amtWord2;
		this.amtWord3 = amtWord3;
		this.contactNo = contactNo;
		this.branchCd = branchCd;
		this.userEmail = userEmail;
		this.claimNo = claimNo;
	}
	
	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getBranchCd() {
		return branchCd;
	}

	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}

	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getDspLossDate() {
		return dspLossDate;
	}

	public void setDspLossDate(String dspLossDate) {
		this.dspLossDate = dspLossDate;
	}

	public String getAssdName() {
		return assdName;
	}

	public void setAssdName(String assdName) {
		this.assdName = assdName;
	}

	public String getLossLoc1() {
		return lossLoc1;
	}

	public void setLossLoc1(String lossLoc1) {
		this.lossLoc1 = lossLoc1;
	}

	public String getLossLoc2() {
		return lossLoc2;
	}

	public void setLossLoc2(String lossLoc2) {
		this.lossLoc2 = lossLoc2;
	}

	public String getLossLoc3() {
		return lossLoc3;
	}

	public void setLossLoc3(String lossLoc3) {
		this.lossLoc3 = lossLoc3;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getRecoveryNo() {
		return recoveryNo;
	}

	public void setRecoveryNo(String recoveryNo) {
		this.recoveryNo = recoveryNo;
	}

	public String getDemandType() {
		return demandType;
	}

	public void setDemandType(String demandType) {
		this.demandType = demandType;
	}

	public String getExtra1() {
		return extra1;
	}

	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}

	public String getExtra2() {
		return extra2;
	}

	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}

	public String getDateSend() {
		return dateSend;
	}

	public void setDateSend(String dateSend) {
		this.dateSend = dateSend;
	}

	public String getDemands() {
		return demands;
	}

	public void setDemands(String demands) {
		this.demands = demands;
	}

	public String getCtrlNo() {
		return ctrlNo;
	}

	public void setCtrlNo(String ctrlNo) {
		this.ctrlNo = ctrlNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getControlNo() {
		return controlNo;
	}

	public void setControlNo(String controlNo) {
		this.controlNo = controlNo;
	}

	public String getCar1() {
		return car1;
	}

	public void setCar1(String car1) {
		this.car1 = car1;
	}

	public String getPlateNo1() {
		return plateNo1;
	}

	public void setPlateNo1(String plateNo1) {
		this.plateNo1 = plateNo1;
	}

	public String getCar2() {
		return car2;
	}

	public void setCar2(String car2) {
		this.car2 = car2;
	}

	public String getPlateNo2() {
		return plateNo2;
	}

	public void setPlateNo2(String plateNo2) {
		this.plateNo2 = plateNo2;
	}

	public String getAmtWord1() {
		return amtWord1;
	}

	public void setAmtWord1(String amtWord1) {
		this.amtWord1 = amtWord1;
	}

	public String getAmtWord2() {
		return amtWord2;
	}

	public void setAmtWord2(String amtWord2) {
		this.amtWord2 = amtWord2;
	}

	public String getAmtWord3() {
		return amtWord3;
	}

	public void setAmtWord3(String amtWord3) {
		this.amtWord3 = amtWord3;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
