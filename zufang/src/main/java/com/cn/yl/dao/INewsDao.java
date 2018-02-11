package com.cn.yl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.News;

@Repository
public interface INewsDao {
	News findById(int newsId);
	List<News> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void newsInsert(News news);
	void newsUpdate(News news);
}
