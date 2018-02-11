package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.Customer;

public interface ICustomerService {
	Customer findById(int customerId);
	List<Customer> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void customerInsert(Customer customer);
	void customerUpdate(Customer customer);
}
