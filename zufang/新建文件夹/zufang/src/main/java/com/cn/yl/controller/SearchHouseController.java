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
import com.cn.yl.pojo.SearchHouse;
import com.cn.yl.service.ISearchHouseService;

@Controller
@RequestMapping("/searchHouse")
public class SearchHouseController extends BaseController<SearchHouse>{
	@Resource
	private ISearchHouseService searchHouseService;
	
	/**
	 * 查询所有寻房信息
	 */
	@RequestMapping("/searchHouseSearch.do")
	public String searchHouseSearch(Model model,
							@RequestParam(required=false) String sAddress,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("sAddress", sAddress);
		Integer totalCount = searchHouseService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<SearchHouse> searchHouseList = searchHouseService.findAll(map);
		initResult(model, searchHouseList, map); 
		return "WEB-INF/searchHouse/searchHouseSearch";
	}
	/**
	 * 添加寻房信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/searchHouse/searchHouseInsert";
    }
	
	/**
	 * 添加寻房信息确认
	 * @return
	 */
	@RequestMapping("/searchHouseInsert.do")
    public String searchHouseInsert(HttpServletRequest request,HttpSession session) {
		SearchHouse searchHouse=new SearchHouse();
		searchHouse.setsAddress(request.getParameter("sAddress"));
		searchHouse.setsContacts(request.getParameter("sContacts"));
		searchHouse.setsPhone(request.getParameter("sPhone"));
		searchHouse.setsPrice(request.getParameter("sPrice"));
		searchHouse.setsType(request.getParameter("sType"));
		searchHouseService.searchHouseInsert(searchHouse);
		return "redirect:/searchHouse/searchHouseSearch.do";
    }
	
	/**
	 * 修改寻房信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int searchHouseId = Integer.valueOf(request.getParameter("searchHouseId"));
		SearchHouse searchHouse = searchHouseService.findById(searchHouseId);
		model.addAttribute("searchHouse", searchHouse);
		return "WEB-INF/searchHouse/searchHouseUpdate";
    }
	
	/**
	 * 修改寻房信息确认
	 * @return
	 */
	@RequestMapping("/searchHouseUpdate.do")
    public String searchHouseUpdate(HttpServletRequest request,HttpSession session) {
		int searchHouseId = Integer.valueOf(request.getParameter("searchHouseId"));
		SearchHouse searchHouse = searchHouseService.findById(searchHouseId);
		searchHouse.setsAddress(request.getParameter("sAddress"));
		searchHouse.setsContacts(request.getParameter("sContacts"));
		searchHouse.setsPhone(request.getParameter("sPhone"));
		searchHouse.setsPrice(request.getParameter("sPrice"));
		searchHouse.setsType(request.getParameter("sType"));
		searchHouseService.searchHouseUpdate(searchHouse);
		return "redirect:/searchHouse/searchHouseSearch.do";
    }
}
