package com.cn.yl.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cn.yl.controller.base.BaseController;
import com.cn.yl.pojo.Employee;
import com.cn.yl.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends BaseController<Employee>{
	@Resource
	private IEmployeeService employeeService;
	
	/**
	 * 查询所有员工信息
	 */
	@RequestMapping("/employeeSearch.do")
	public String employeeSearch(Model model,
							@RequestParam(required=false) String eName,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("eName", eName);
		Integer totalCount = employeeService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<Employee> employeeList = employeeService.findAll(map);
		initResult(model, employeeList, map); 
		return "WEB-INF/employee/employeeSearch";
	}
	/**
	 * 添加员工信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/employee/employeeInsert";
    }
	
	/**
	 * 添加员工信息确认
	 * @return
	 */
	@RequestMapping("/employeeInsert.do")
    public String employeeInsert(HttpServletRequest request,HttpSession session) {
		Employee employee=new Employee();
		if(!StringUtils.isEmpty(request.getParameter("eAge")))
		{
			employee.seteAge(Integer.valueOf(request.getParameter("eAge")));
		}
		employee.seteMoney(new BigDecimal(request.getParameter("eMoney")));
		employee.seteName(request.getParameter("eName"));
		employee.setePhone(request.getParameter("ePhone"));
		employee.seteSex(request.getParameter("eSex"));
		employee.seteWokerAge(request.getParameter("eWokerAge"));
		employeeService.employeeInsert(employee);
		return "redirect:/employee/employeeSearch.do";
    }
	
	/**
	 * 修改员工信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int employeeId = Integer.valueOf(request.getParameter("employeeId"));
		Employee employee = employeeService.findById(employeeId);
		model.addAttribute("employee", employee);
		return "WEB-INF/employee/employeeUpdate";
    }
	
	/**
	 * 修改员工信息确认
	 * @return
	 */
	@RequestMapping("/employeeUpdate.do")
    public String employeeUpdate(HttpServletRequest request,HttpSession session) {
		int employeeId = Integer.valueOf(request.getParameter("employeeId"));
		Employee employee = employeeService.findById(employeeId);
		if(!StringUtils.isEmpty(request.getParameter("eAge")))
		{
			employee.seteAge(Integer.valueOf(request.getParameter("eAge")));
		}
		employee.seteMoney(new BigDecimal(request.getParameter("eMoney")));
		employee.seteName(request.getParameter("eName"));
		employee.setePhone(request.getParameter("ePhone"));
		employee.seteSex(request.getParameter("eSex"));
		employee.seteWokerAge(request.getParameter("eWokerAge"));
		employeeService.employeeUpdate(employee);
		return "redirect:/employee/employeeSearch.do";
    }
}
