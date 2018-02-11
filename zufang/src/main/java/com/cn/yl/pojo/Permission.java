package com.cn.yl.pojo;

import java.util.List;

/**
 * 权限管理
 */
public class Permission {
	private Integer id;//id
	private String permissionName;//权限名称
	private Integer roleId;//角色
	private String uri;//url路径
	private String name;//父类名称
	private List<Permission> funs;//子类集合
	private Integer nfatherId;//父类ID
	private Integer isMenu;//是否是菜单
	
	public Permission() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Permission> getFuns() {
		return funs;
	}
	public void setFuns(List<Permission> funs) {
		this.funs = funs;
	}
	public Integer getNfatherId() {
		return nfatherId;
	}
	public void setNfatherId(Integer nfatherId) {
		this.nfatherId = nfatherId;
	}
	public Integer getIsMenu() {
		return isMenu;
	}
	public void setIsMenu(Integer isMenu) {
		this.isMenu = isMenu;
	}	
	
}
