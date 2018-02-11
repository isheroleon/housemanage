package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.Want;

public interface IWantService {
	Want findById(int wantId);
	List<Want> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void wantInsert(Want want);
	void wantUpdate(Want want);
}
