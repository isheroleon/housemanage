package com.cn.yl.pojo;

import java.math.BigDecimal;

/**
 *售房信息
 */
public class SellHouse {
	private int sellHouseId;//id
	private String sAdress;//地址
	private String sContacts;//联系人
	private String sStatus;//状态（一手还是二手）
	private BigDecimal sPrice;//价格
	private String sPhone;//电话
	private String sType;//方式（个人还是中介）
	public int getSellHouseId() {
		return sellHouseId;
	}
	public void setSellHouseId(int sellHouseId) {
		this.sellHouseId = sellHouseId;
	}
	public String getsAdress() {
		return sAdress;
	}
	public void setsAdress(String sAdress) {
		this.sAdress = sAdress;
	}
	public String getsContacts() {
		return sContacts;
	}
	public void setsContacts(String sContacts) {
		this.sContacts = sContacts;
	}
	public String getsStatus() {
		return sStatus;
	}
	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}
	public BigDecimal getsPrice() {
		return sPrice;
	}
	public void setsPrice(BigDecimal sPrice) {
		this.sPrice = sPrice;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
}
