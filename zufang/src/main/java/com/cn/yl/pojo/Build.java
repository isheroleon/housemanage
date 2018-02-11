package com.cn.yl.pojo;

/**
 * 楼盘表
 */
public class Build {
	private int buildId;//id
	private String bLlocaltion;//位置
	private String bPrice;//价格
	private String bStatus;//状态
	private String bPhone;//电话
	public int getBuildId() {
		return buildId;
	}
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}
	public String getbLlocaltion() {
		return bLlocaltion;
	}
	public void setbLlocaltion(String bLlocaltion) {
		this.bLlocaltion = bLlocaltion;
	}
	public String getbPrice() {
		return bPrice;
	}
	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	public String getbStatus() {
		return bStatus;
	}
	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}
	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
}
