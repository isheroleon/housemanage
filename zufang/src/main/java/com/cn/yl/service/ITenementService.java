package com.cn.yl.service;

import java.util.List;
import java.util.Map;

import com.cn.yl.pojo.Tenement;

public interface ITenementService {
	Tenement findById(int tenementId);
	List<Tenement> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void tenementInsert(Tenement tenement);
	void tenementUpdate(Tenement tenement);
}
