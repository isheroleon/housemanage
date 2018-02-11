package com.cn.yl.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Permission;

@Repository
public interface IPermissionDao {
	
	List<Permission> findAll(Map<String,Object> map);
	
	Integer getCount(Map<String,Object> map);

	List<Permission> getMeun(Map<String,Object> map);
	
}
