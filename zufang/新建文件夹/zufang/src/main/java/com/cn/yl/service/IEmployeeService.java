package com.cn.yl.service;

import java.util.List;
import java.util.Map;
import com.cn.yl.pojo.Employee;

public interface IEmployeeService {
	Employee findById(int employeeId);
	List<Employee> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void employeeInsert(Employee employee);
	void employeeUpdate(Employee employee);
}
