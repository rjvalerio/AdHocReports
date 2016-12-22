package com.geniisys.common.entity;

public class Line {
	
	private String lineCd;
	private String lineName;
	
	public Line() {}
	
	public Line(String lineCd,String lineName){
		this.lineCd = lineCd;
		this.lineName = lineName;
	}
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	
	
}
