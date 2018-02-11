package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.IBuildDao;
import com.cn.yl.pojo.Build;
import com.cn.yl.service.IBuildService;

@Service("buildService")
public class BuildServiceImpl implements IBuildService {

    @Resource
    private IBuildDao buildDao ;

	@Override
	public Build findById(int buildId) {
		// TODO Auto-generated method stub
		return buildDao.findById(buildId);
	}

	@Override
	public List<Build> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return buildDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return buildDao.getCount(map);
	}

	@Override
	public void buildInsert(Build build) {
		buildDao.buildInsert(build);
		
	}

	@Override
	public void buildUpdate(Build build) {
		buildDao.buildUpdate(build);
		
	}

}
