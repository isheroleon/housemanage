package com.cn.yl.service;

import java.util.List;
import java.util.Map;

import com.cn.yl.pojo.Permission;

public interface IPermissionService {
	
	/**
	 * 查看所有权限信息
	 * @param map
	 * @return
	 */
	List<Permission> findAll(Map<String,Object> map);
	
	/**
	 * 统计权限数量
	 * @return
	 */
	Integer getCount(Map<String,Object> map);

	/**
	 * 获取所有菜单名称
	 * @param roleId
	 * @return
	 */
	List<Permission> getMeun(Map<String,Object> map);
}
