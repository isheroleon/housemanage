package com.cn.yl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Tenement;

@Repository
public interface ITenementDao {
	Tenement findById(int tenementId);
	List<Tenement> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void tenementInsert(Tenement tenement);
	void tenementUpdate(Tenement tenement);
}
