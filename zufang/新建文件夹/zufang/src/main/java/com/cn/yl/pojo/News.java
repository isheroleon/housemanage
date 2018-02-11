package com.cn.yl.pojo;

/**
 * 新闻表
 */
public class News {
	private int nwesId;//id
	private String nContext;//内容
	private String nTitle;//标题
	private String nStatus;//状态
	private String nName;//姓名
	private String nPhone;//电话
	public int getNwesId() {
		return nwesId;
	}
	public void setNwesId(int nwesId) {
		this.nwesId = nwesId;
	}
	public String getnContext() {
		return nContext;
	}
	public void setnContext(String nContext) {
		this.nContext = nContext;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnStatus() {
		return nStatus;
	}
	public void setnStatus(String nStatus) {
		this.nStatus = nStatus;
	}
	public String getnName() {
		return nName;
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public String getnPhone() {
		return nPhone;
	}
	public void setnPhone(String nPhone) {
		this.nPhone = nPhone;
	}

}
