package com.cn.yl.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.yl.dao.IEmployeeDao;
import com.cn.yl.pojo.Employee;
import com.cn.yl.service.IEmployeeService;


@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Resource
    private IEmployeeDao employeeDao ;

	@Override
	public Employee findById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId);
	}

	@Override
	public List<Employee> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return employeeDao.findAll(map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return employeeDao.getCount(map);
	}

	@Override
	public void employeeInsert(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.employeeInsert(employee);
	}

	@Override
	public void employeeUpdate(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.employeeUpdate(employee);
	}

 
}
