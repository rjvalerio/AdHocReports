package com.geniisys.claims.entity;

public class DemandLetterTbl {
	private Integer claimId;
	private Integer policyId;
	private String extra1;
	private String extra2;
	private String extra3;
	private String dateSend;
	private String demands;
	private String ctrlNo;
	private String userId;
	private String lastUpdate;

	public DemandLetterTbl() {
	}

	public DemandLetterTbl(Integer claimId, Integer policyId, String extra1, String extra2, String extra3,
			String dateSend, String demands, String ctrlNo, String userId, String lastUpdate) {
		this.claimId = claimId;
		this.policyId = policyId;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.extra3 = extra3;
		this.dateSend = dateSend;
		this.demands = demands;
		this.ctrlNo = ctrlNo;
		this.userId = userId;
		this.lastUpdate = lastUpdate;
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

	public String getExtra3() {
		return extra3;
	}

	public void setExtra3(String extra3) {
		this.extra3 = extra3;
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

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
