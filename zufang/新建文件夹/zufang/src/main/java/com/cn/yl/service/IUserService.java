package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cn.yl.pojo.User;

public interface IUserService {
	/**
	 * Shiro的登录验证，通过用户名查询用户信息
	 * 
	 * @param username
	 * @return
	 */
	 User findUserByUsername(String username);

	/**
	 * 根据账号查找角色名称
	 * 
	 * @param username
	 * @return
	 */
	 Set<String> findRoles(String username);

	/**
	 * 根据账号查找权限
	 * 
	 * @param username
	 * @return
	 */
	 Set<String> findPermissions(String username);
	 
	 /**
	  * 查询全部用户
	  * @return
	  */
	 List<User> findAll(Map<String,Object> map);
	 
	 /**
	  * 统计用户数量
	  * @return
	  */
	 Integer getCount(Map<String,Object> map);
}
