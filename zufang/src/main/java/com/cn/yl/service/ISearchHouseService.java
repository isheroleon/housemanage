package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.SearchHouse;

public interface ISearchHouseService {
	SearchHouse findById(int searchhouseId);
	List<SearchHouse> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void searchHouseInsert(SearchHouse searchHouse);
	void searchHouseUpdate(SearchHouse searchHouse);
}
