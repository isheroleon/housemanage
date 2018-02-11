package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.IWantDao;
import com.cn.yl.pojo.Want;
import com.cn.yl.service.IWantService;


@Service("wantService")
public class WantServiceImpl implements IWantService {

    @Resource
    private IWantDao  wantDao;

	@Override
	public Want findById(int wantId) {
		return wantDao.findById(wantId);
	}

	@Override
	public List<Want> findAll(Map<String, Object> map) {
		return wantDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return wantDao.getCount(map);
	}

	@Override
	public void wantInsert(Want want) {
		wantDao.wantInsert(want);
	}

	@Override
	public void wantUpdate(Want want) {
		wantDao.wantUpdate(want);
	}



}
