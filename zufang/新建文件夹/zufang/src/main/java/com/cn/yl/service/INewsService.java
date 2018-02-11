package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.News;

public interface INewsService {
	News findById(int newsId);
	List<News> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void newsInsert(News news);
	void newsUpdate(News news);
}
