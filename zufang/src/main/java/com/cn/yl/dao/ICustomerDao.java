package com.cn.yl.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Customer;

@Repository
public interface ICustomerDao {
	Customer findById(int customerId);
	List<Customer> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void customerInsert(Customer customer);
	void customerUpdate(Customer customer);
}
