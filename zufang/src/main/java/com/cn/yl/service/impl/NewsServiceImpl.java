package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.INewsDao;
import com.cn.yl.pojo.News;
import com.cn.yl.service.INewsService;


@Service("newsService")
public class NewsServiceImpl implements INewsService {

    @Resource
    private INewsDao newsDao ;

	@Override
	public News findById(int newsId) {
		// TODO Auto-generated method stub
		return newsDao.findById(newsId);
	}

	@Override
	public List<News> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return newsDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return newsDao.getCount(map);
	}

	@Override
	public void newsInsert(News news) {
		newsDao.newsInsert(news);
		
	}

	@Override
	public void newsUpdate(News news) {
		newsDao.newsUpdate(news);
		
	}

}
