package com.cn.yl.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Build;

@Repository
public interface IBuildDao {
	Build findById(int buildId);
	List<Build> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void buildInsert(Build build);
	void buildUpdate(Build build);
}
