package com.geniisys.common.entity;

public class User {
	private String userId;
	private Integer userGrp;
	private String userName;
	private Integer userLevel;
	
	public User(){}
	
	public User(String userId,Integer userGrp,String userName,Integer userLevel){
		this.userId = userId;
		this.userGrp = userGrp;
		this.userName = userName;
		this.userLevel = userLevel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getUserGrp() {
		return userGrp;
	}

	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}
	
	
}
