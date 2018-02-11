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
import com.cn.yl.pojo.Tenement;
import com.cn.yl.service.ITenementService;
@Controller
@RequestMapping("/tenement")
public class TenementController extends BaseController<Tenement>{
	@Resource
	private ITenementService tenementService;
	
	/**
	 * 查询所有租房信息
	 */
	@RequestMapping("/tenementSearch.do")
	public String tenementSearch(Model model,
							@RequestParam(required=false) String tAddress,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("tAddress", tAddress);
		Integer totalCount = tenementService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<Tenement> tenementList = tenementService.findAll(map);
		initResult(model, tenementList, map); 
		return "WEB-INF/tenement/tenementSearch";
	}
	/**
	 * 添加求租信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/tenement/tenementInsert";
    }
	/**
	 * 添加租房信息确认
	 * @return
	 */
	@RequestMapping("/tenementInsert.do")
    public String tenementInsert(HttpServletRequest request,HttpSession session) {
		Tenement tenement=new Tenement();
		tenement.settAddress(request.getParameter("tAddress"));
		tenement.settContacts(request.getParameter("tContacts"));
		tenement.settPhone(request.getParameter("eName"));
		tenement.settPrice(new BigDecimal(request.getParameter("tPrice")));
		tenement.settPriceType(request.getParameter("tPriceType"));
		tenement.settType(request.getParameter("tType"));
		tenementService.tenementInsert(tenement);
		return "redirect:/tenement/tenementSearch.do";
    }
	
	/**
	 * 修改租房信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int tenementId = Integer.valueOf(request.getParameter("tenementId"));
		Tenement tenement = tenementService.findById(tenementId);
		model.addAttribute("tenement", tenement);
		return "WEB-INF/tenement/tenementUpdate";
    }
	
	/**
	 * 修改租房信息确认
	 * @return
	 */
	@RequestMapping("/tenementUpdate.do")
    public String tenementUpdate(HttpServletRequest request,HttpSession session) {
		int tenementId = Integer.valueOf(request.getParameter("tenementId"));
		Tenement tenement = tenementService.findById(tenementId);
		tenement.settAddress(request.getParameter("tAddress"));
		tenement.settContacts(request.getParameter("tContacts"));
		tenement.settPhone(request.getParameter("eName"));
		tenement.settPrice(new BigDecimal(request.getParameter("tPrice")));
		tenement.settPriceType(request.getParameter("tPriceType"));
		tenement.settType(request.getParameter("tType"));
		tenementService.tenementUpdate(tenement);
		return "redirect:/tenement/tenementSearch.do";
    }
}
