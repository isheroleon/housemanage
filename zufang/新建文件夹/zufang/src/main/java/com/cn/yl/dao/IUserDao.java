package com.cn.yl.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cn.yl.pojo.User;

@Repository
public interface IUserDao {

	User findUserByUsername(String username);

	Set<String> findRoles(String username);

	Set<String> findPermissions(String username);
	
	List<User> findAll(Map<String,Object> map);
	
	Integer getCount(Map<String,Object> map);

}
