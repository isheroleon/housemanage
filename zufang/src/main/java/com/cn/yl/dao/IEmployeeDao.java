package com.cn.yl.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.cn.yl.pojo.Employee;

@Repository
public interface IEmployeeDao {
	Employee findById(int employeeId);
	List<Employee> findAll(Map<String,Object> map);
	Integer getCount(Map<String,Object> map);
	void employeeInsert(Employee employee);
	void employeeUpdate(Employee employee);
	
}
