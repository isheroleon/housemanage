package com.cn.yl.controller;

import java.math.BigDecimal;
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
import com.cn.yl.pojo.SellHouse;
import com.cn.yl.service.ISellHouseService;

@Controller
@RequestMapping("/sellHouse")
public class SellHouseController extends BaseController<SellHouse>{
	@Resource
	private ISellHouseService sellHouseService;
	
	/**
	 * 查询所有售房信息
	 */
	@RequestMapping("/sellHouseSearch.do")
	public String sellHouseSearch(Model model,
							@RequestParam(required=false) String sAdress,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("sAdress", sAdress);
		Integer totalCount = sellHouseService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<SellHouse> sellHouseList = sellHouseService.findAll(map);
		initResult(model, sellHouseList, map); 
		return "WEB-INF/sellHouse/sellHouseSearch";
	}
	/**
	 * 添加售房信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/sellHouse/sellHouseInsert";
    }
	
	/**
	 * 添加售房信息确认
	 * @return
	 */
	@RequestMapping("/sellHouseInsert.do")
    public String sellHouseInsert(HttpServletRequest request,HttpSession session) {
		SellHouse sellHouse=new SellHouse();
		sellHouse.setsAdress(request.getParameter("sAdress"));
		sellHouse.setsContacts(request.getParameter("sContacts"));
		sellHouse.setsPhone(request.getParameter("sPhone"));
		sellHouse.setsPrice(new BigDecimal(request.getParameter("sPrice")));
		sellHouse.setsStatus(request.getParameter("sStatus"));
		sellHouse.setsType(request.getParameter("sType"));
		sellHouseService.sellHouseInsert(sellHouse);
		return "redirect:/sellHouse/sellHouseSearch.do";
    }
	
	/**
	 * 修改售房信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int sellHouseId = Integer.valueOf(request.getParameter("sellHouseId"));
		SellHouse sellHouse = sellHouseService.findById(sellHouseId);
		model.addAttribute("sellHouse", sellHouse);
		return "WEB-INF/sellHouse/sellHouseUpdate";
    }
	
	/**
	 * 修改售房信息确认
	 * @return
	 */
	@RequestMapping("/sellHouseUpdate.do")
    public String sellHouseUpdate(HttpServletRequest request,HttpSession session) {
		int sellHouseId = Integer.valueOf(request.getParameter("sellHouseId"));
		SellHouse sellHouse = sellHouseService.findById(sellHouseId);
		sellHouse.setsAdress(request.getParameter("sAdress"));
		sellHouse.setsContacts(request.getParameter("sContacts"));
		sellHouse.setsPhone(request.getParameter("sPhone"));
		sellHouse.setsPrice(new BigDecimal(request.getParameter("sPrice")));
		sellHouse.setsStatus(request.getParameter("sStatus"));
		sellHouse.setsType(request.getParameter("sType"));
		sellHouseService.sellHouseUpdate(sellHouse);
		return "redirect:/sellHouse/sellHouseSearch.do";
    }
}
