package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.yl.dao.ISearchHouseDao;
import com.cn.yl.pojo.SearchHouse;
import com.cn.yl.service.ISearchHouseService;

@Service("searchHouseService")
public class SearchHouseServiceImpl implements ISearchHouseService {

    @Resource
    private ISearchHouseDao searchHouseDao ;

	@Override
	public SearchHouse findById(int searchhouseId) {
		return searchHouseDao.findById(searchhouseId);
	}

	@Override
	public List<SearchHouse> findAll(Map<String, Object> map) {
		return searchHouseDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return searchHouseDao.getCount(map);
	}

	@Override
	public void searchHouseInsert(SearchHouse searchHouse) {
		searchHouseDao.searchHouseInsert(searchHouse);		
	}

	@Override
	public void searchHouseUpdate(SearchHouse searchHouse) {
		searchHouseDao.searchHouseUpdate(searchHouse);		
	}


}
