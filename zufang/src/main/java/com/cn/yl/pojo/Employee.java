package com.cn.yl.pojo;

import java.math.BigDecimal;

/**
 * 员工表
 */
public class Employee {
	private int employeeId;//id	
	private String eName;//姓名
	private String eSex;//性别
	private int eAge;//年龄
	private String ePhone;//电话
	private BigDecimal eMoney;//工资
	private String eWokerAge;//工龄
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSex() {
		return eSex;
	}
	public void seteSex(String eSex) {
		this.eSex = eSex;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public String getePhone() {
		return ePhone;
	}
	public void setePhone(String ePhone) {
		this.ePhone = ePhone;
	}
	public BigDecimal geteMoney() {
		return eMoney;
	}
	public void seteMoney(BigDecimal eMoney) {
		this.eMoney = eMoney;
	}
	public String geteWokerAge() {
		return eWokerAge;
	}
	public void seteWokerAge(String eWokerAge) {
		this.eWokerAge = eWokerAge;
	}
	
}
