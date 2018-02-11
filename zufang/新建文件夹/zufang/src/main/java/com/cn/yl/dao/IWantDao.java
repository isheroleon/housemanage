package com.cn.yl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Want;

@Repository
public interface IWantDao {
	Want findById(int wantId);
	List<Want> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void wantInsert(Want want);
	void wantUpdate(Want want);
}
