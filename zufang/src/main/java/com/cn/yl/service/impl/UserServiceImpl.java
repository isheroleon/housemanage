package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.yl.dao.IUserDao;
import com.cn.yl.pojo.User;
import com.cn.yl.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao ;

    @Override
    public User findUserByUsername(String username) {
        User User = userDao.findUserByUsername(username);
        return User;
    }

    @Override
    public Set<String> findRoles(String username) {
        return userDao.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return userDao.findPermissions(username);
    }

	@Override
	public List<User> findAll(Map<String,Object> map) {
		return userDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String,Object> map) {
		return userDao.getCount(map);
	}
}
