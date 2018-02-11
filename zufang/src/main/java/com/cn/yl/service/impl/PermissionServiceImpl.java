package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.yl.dao.IPermissionDao;
import com.cn.yl.pojo.Permission;
import com.cn.yl.service.IPermissionService;


@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService {

    @Resource
    private IPermissionDao permissionDao ;

	@Override
	public List<Permission> findAll(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return permissionDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String,Object> map) {
		// TODO 自动生成的方法存根
		return permissionDao.getCount(map);
	}

	@Override
	public List<Permission> getMeun(Map<String,Object> map) {
		// TODO 自动生成的方法存根
		return permissionDao.getMeun(map);
	}


}
