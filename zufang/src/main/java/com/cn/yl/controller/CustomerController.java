package com.cn.yl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.yl.controller.base.BaseController;
import com.cn.yl.pojo.Customer;
import com.cn.yl.service.ICustomerService;
@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController<Customer>{
	@Resource
	private ICustomerService customerService;
	
	/**
	 * 查询所有客户信息
	 */
	@RequestMapping("/customerSearch.do")
	public String customerSearch(Model model,
							@RequestParam(required=false) String cName,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cName", cName);
		Integer totalCount = customerService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<Customer> customerList = customerService.findAll(map);
		initResult(model, customerList, map); 
		return "WEB-INF/customer/customerSearch";
	}
	/**
	 * 添加客户信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/customer/customerInsert";
    }
	
	/**
	 * 添加客户信息确认
	 * @return
	 */
	@RequestMapping("/customerInsert.do")
    public String customerInsert(HttpServletRequest request,HttpSession session) {
		Customer customer=new Customer();		
		customer.setcEmail(request.getParameter("cEmail"));
		customer.setcName(request.getParameter("cName"));
		customer.setcPhone(request.getParameter("cPhone"));
		customer.setcSex(request.getParameter("cSex"));
		customerService.customerInsert(customer);
		return "redirect:/customer/customerSearch.do";
    }
	
	/**
	 * 修改客户信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int customerId = Integer.valueOf(request.getParameter("customerId"));
		Customer customer = customerService.findById(customerId);
		model.addAttribute("customer", customer);
		return "WEB-INF/customer/customerUpdate";
    }
	
	/**
	 * 修改客户信息确认
	 * @return
	 */
	@RequestMapping("/customerUpdate.do")
    public String customerUpdate(HttpServletRequest request,HttpSession session) {
		int customerId = Integer.valueOf(request.getParameter("customerId"));
		Customer customer = customerService.findById(customerId);
		customer.setcEmail(request.getParameter("cEmail"));
		customer.setcName(request.getParameter("cName"));
		customer.setcPhone(request.getParameter("cPhone"));
		customer.setcSex(request.getParameter("cSex"));
		customerService.customerUpdate(customer);
		return "redirect:/customer/customerSearch.do";
    }
}
