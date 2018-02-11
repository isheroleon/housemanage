package com.cn.yl.pojo;

/**
 *求租表
 */
public class Want {
	private int wantId;//ID
	private String wAddress;//地址
	private String wContacts;//联系人
	private String wPrice;//价格
	private String wPhone;//电话
	private String wPricetype;//押金形式
	private String wType;//租房方式
	public int getWantId() {
		return wantId;
	}
	public void setWantId(int wantId) {
		this.wantId = wantId;
	}
	public String getwAddress() {
		return wAddress;
	}
	public void setwAddress(String wAddress) {
		this.wAddress = wAddress;
	}
	public String getwContacts() {
		return wContacts;
	}
	public void setwContacts(String wContacts) {
		this.wContacts = wContacts;
	}
	public String getwPrice() {
		return wPrice;
	}
	public void setwPrice(String wPrice) {
		this.wPrice = wPrice;
	}
	public String getwPhone() {
		return wPhone;
	}
	public void setwPhone(String wPhone) {
		this.wPhone = wPhone;
	}
	public String getwPricetype() {
		return wPricetype;
	}
	public void setwPricetype(String wPricetype) {
		this.wPricetype = wPricetype;
	}
	public String getwType() {
		return wType;
	}
	public void setwType(String wType) {
		this.wType = wType;
	}
}
