package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.ITenementDao;
import com.cn.yl.pojo.Tenement;
import com.cn.yl.service.ITenementService;


@Service("tenementService")
public class TenementServiceImpl implements ITenementService {

    @Resource
    private ITenementDao tenementDao ;

	@Override
	public Tenement findById(int tenementId) {
		return tenementDao.findById(tenementId);
	}

	@Override
	public List<Tenement> findAll(Map<String, Object> map) {
		return tenementDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return tenementDao.getCount(map);
	}

	@Override
	public void tenementInsert(Tenement tenement) {
		tenementDao.tenementInsert(tenement);
		
	}

	@Override
	public void tenementUpdate(Tenement tenement) {
		tenementDao.tenementUpdate(tenement);
	}

}
