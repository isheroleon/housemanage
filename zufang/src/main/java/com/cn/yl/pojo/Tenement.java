package com.cn.yl.pojo;

import java.math.BigDecimal;

/**
 *租房信息
 */
public class Tenement {
	private int tenementId;//ID
	private String tAddress;//地址
	private String tContacts;//联系人
	private BigDecimal tPrice;//价格
	private String tPhone;//电话
	private String tPriceType;//付款方式
	private String tType;//租房方式
	public int getTenementId() {
		return tenementId;
	}
	public void setTenementId(int tenementId) {
		this.tenementId = tenementId;
	}
	public String gettAddress() {
		return tAddress;
	}
	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}
	public String gettContacts() {
		return tContacts;
	}
	public void settContacts(String tContacts) {
		this.tContacts = tContacts;
	}
	public BigDecimal gettPrice() {
		return tPrice;
	}
	public void settPrice(BigDecimal tPrice) {
		this.tPrice = tPrice;
	}
	public String gettPhone() {
		return tPhone;
	}
	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}
	public String gettPriceType() {
		return tPriceType;
	}
	public void settPriceType(String tPriceType) {
		this.tPriceType = tPriceType;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	
}
