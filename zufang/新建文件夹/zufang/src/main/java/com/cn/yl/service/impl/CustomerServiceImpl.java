package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.ICustomerDao;
import com.cn.yl.pojo.Customer;
import com.cn.yl.service.ICustomerService;


@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private ICustomerDao customerDao ;

	@Override
	public Customer findById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.findById(customerId);
	}

	@Override
	public List<Customer> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return customerDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return customerDao.getCount(map);
	}

	@Override
	public void customerInsert(Customer customer) {
		customerDao.customerInsert(customer);
		
	}

	@Override
	public void customerUpdate(Customer customer) {
		customerDao.customerUpdate(customer);
		
	}



}
