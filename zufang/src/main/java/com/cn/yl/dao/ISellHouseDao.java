package com.cn.yl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.SellHouse;

@Repository
public interface ISellHouseDao {
	SellHouse findById(int sellHouseId);
	List<SellHouse> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void sellHouseInsert(SellHouse sellHouse);
	void sellHouseUpdate(SellHouse sellHouse);
}
