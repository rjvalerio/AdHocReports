package com.geniisys.claims.entity;

public class DemandLetterParameter {
	private Integer claimId;
	private Integer recoveryId;
	private String userId;
	
	public DemandLetterParameter(){}
	
	public DemandLetterParameter(Integer claimId,Integer recoveryId){
		this.claimId = claimId;
		this.recoveryId = recoveryId;
	}
	
	public DemandLetterParameter(Integer claimId,Integer recoveryId,String userId){
		this.claimId = claimId;
		this.recoveryId = recoveryId;
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
	
	
}
