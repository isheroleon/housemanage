package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.SellHouse;

public interface ISellHouseService {
	SellHouse findById(int sellHouseId);
	List<SellHouse> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void sellHouseInsert(SellHouse sellHouse);
	void sellHouseUpdate(SellHouse sellHouse);
}
