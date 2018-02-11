package com.cn.yl.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.SearchHouse;

@Repository
public interface ISearchHouseDao {
	SearchHouse findById(int searchhouseId);
	List<SearchHouse> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void searchHouseInsert(SearchHouse searchHouse);
	void searchHouseUpdate(SearchHouse searchHouse);
}
