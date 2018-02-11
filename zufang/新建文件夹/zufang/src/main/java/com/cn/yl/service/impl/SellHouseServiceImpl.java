package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.ISellHouseDao;
import com.cn.yl.pojo.SellHouse;
import com.cn.yl.service.ISellHouseService;


@Service("sellHouseService")
public class SellHouseServiceImpl implements ISellHouseService {

    @Resource
    private ISellHouseDao sellHouseDao ;

	@Override
	public SellHouse findById(int sellHouseId) {
		return sellHouseDao.findById(sellHouseId);
	}

	@Override
	public List<SellHouse> findAll(Map<String, Object> map) {
		return sellHouseDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return sellHouseDao.getCount(map);
	}

	@Override
	public void sellHouseInsert(SellHouse sellHouse) {
		sellHouseDao.sellHouseInsert(sellHouse);
	}

	@Override
	public void sellHouseUpdate(SellHouse sellHouse) {
		sellHouseDao.sellHouseUpdate(sellHouse);
	}



}
