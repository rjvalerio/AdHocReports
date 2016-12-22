package com.geniisys.common.entity;

import java.math.BigDecimal;

public class Item {
	
	private Integer extractId;
	private Integer itemNo;
	private String itemTitle;
	private String itemDesc;
	private BigDecimal tsiAmt;
	private String color;
	private String motorNo;
	private String serialNo;
	private String plateNo;
	
	public Item() {}
	
	public Item(Integer extractId,Integer itemNo,String itemTitle,String itemDesc,BigDecimal tsiAmt,
			String color,String motorNo,String serialNo,String plateNo){
		this.extractId = extractId;
		this.itemNo = itemNo;
		this.itemTitle = itemTitle;
		this.itemDesc = itemDesc;
		this.tsiAmt = tsiAmt;
		this.color = color;
		this.motorNo = motorNo;
		this.serialNo = serialNo;
		this.plateNo = plateNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(String motorNo) {
		this.motorNo = motorNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Integer getExtractId() {
		return extractId;
	}

	public void setExtractId(Integer extractId) {
		this.extractId = extractId;
	}

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public BigDecimal getTsiAmt() {
		return tsiAmt;
	}

	public void setTsiAmt(BigDecimal tsiAmt) {
		this.tsiAmt = tsiAmt;
	}
	
	
}
