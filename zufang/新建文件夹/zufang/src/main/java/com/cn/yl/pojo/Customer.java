package com.cn.yl.pojo;

/**
 *客户表
 */
public class Customer {
	private int customerId;//ID
	private String cName;//姓名
	private String cSex;//性别
	private String cEmail;//邮箱
	private String cPhone;//电话
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSex() {
		return cSex;
	}
	public void setcSex(String cSex) {
		this.cSex = cSex;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	
}
