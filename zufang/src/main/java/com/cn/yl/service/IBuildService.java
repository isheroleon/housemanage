package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.Build;

public interface IBuildService {
	Build findById(int buildId);
	List<Build> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void buildInsert(Build build);
	void buildUpdate(Build build);
}
