package com.geniisys.common.entity;

public class Employee {

	private String employeeId;
	private String lastName;
	private String firstName;
	private String middleName;
	private String sssNo;
	private String tinNo;
	private String employeeType;
	private String employeeClass;
	private String position;
	private String rcCode;

	public Employee() {
	}

	public Employee(String employeeId, String lastName, String firstName, String middleName, String sssNo, String tinNo,
			String employeeType, String employeeClass, String position, String rcCode) {
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.sssNo = sssNo;
		this.tinNo = tinNo;
		this.employeeType = employeeType;
		this.employeeClass = employeeClass;
		this.position = position;
		this.rcCode = rcCode;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSssNo() {
		return sssNo;
	}

	public void setSssNo(String sssNo) {
		this.sssNo = sssNo;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmployeeClass() {
		return employeeClass;
	}

	public void setEmployeeClass(String employeeClass) {
		this.employeeClass = employeeClass;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRcCode() {
		return rcCode;
	}

	public void setRcCode(String rcCode) {
		this.rcCode = rcCode;
	}
	
}
