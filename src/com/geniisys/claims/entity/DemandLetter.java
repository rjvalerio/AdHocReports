package com.geniisys.claims.entity;

import java.math.BigDecimal;

public class DemandLetter {
	private Integer claimId;
	private Integer recoveryId;
	private String claimNo;
	private String lossDate;
	private String lossLoc1;
	private String lossLoc2;
	private String lossLoc3;
	private String assuredName;
	private String plateNo;
	private String modelYear;
	private String carCompany;
	private String make;
	private BigDecimal recoverableAmt;
	
	public DemandLetter(){}
	
	public DemandLetter(Integer claimId,Integer recoveryId,String claimNo,String lossDate,String lossLoc1,String lossLoc2,String lossLoc3,String assuredName,String plateNo,String modelYear,String carCompany,String make,BigDecimal recoverableAmt){
		this.claimId = claimId;
		this.recoveryId = recoveryId;
		 this.claimNo = claimNo;
		 this.lossDate = lossDate;
		 this.lossLoc1 = lossLoc1;
		 this.lossLoc2 = lossLoc2;
		 this.lossLoc3 = lossLoc3;
		 this.assuredName = assuredName;
		 this.plateNo = plateNo;
		 this.modelYear = modelYear;
		 this.carCompany = carCompany;
		 this.make = make;
		 this.recoverableAmt = recoverableAmt;
	}
	
	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	public Integer getRecoveryId() {
		return recoveryId;
	}

	public void setRecoveryId(Integer recoveryId) {
		this.recoveryId = recoveryId;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getLossDate() {
		return lossDate;
	}

	public void setLossDate(String lossDate) {
		this.lossDate = lossDate;
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

	public String getAssuredName() {
		return assuredName;
	}

	public void setAssuredName(String assuredName) {
		this.assuredName = assuredName;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public BigDecimal getRecoverableAmt() {
		return recoverableAmt;
	}

	public void setRecoverableAmt(BigDecimal recoverableAmt) {
		this.recoverableAmt = recoverableAmt;
	}
	
	
}
