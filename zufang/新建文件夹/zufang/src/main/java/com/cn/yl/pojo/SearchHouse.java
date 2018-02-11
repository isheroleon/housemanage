package com.cn.yl.pojo;

/**
 *寻房表
 */
public class SearchHouse {
	private int searchHouseId;//ID
	private String sAddress;//地址
	private String sContacts;//联系人
	private String sPrice;//价格
	private String sPhone;//电话
	private String sType;//方式
	public int getSearchHouseId() {
		return searchHouseId;
	}
	public void setSearchHouseId(int searchHouseId) {
		this.searchHouseId = searchHouseId;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsContacts() {
		return sContacts;
	}
	public void setsContacts(String sContacts) {
		this.sContacts = sContacts;
	}
	public String getsPrice() {
		return sPrice;
	}
	public void setsPrice(String sPrice) {
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
