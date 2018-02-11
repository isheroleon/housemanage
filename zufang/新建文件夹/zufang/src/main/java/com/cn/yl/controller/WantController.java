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
import com.cn.yl.pojo.Want;
import com.cn.yl.service.IWantService;
@Controller
@RequestMapping("/want")
public class WantController extends BaseController<Want>{
	@Resource
	private IWantService wantService;
	
	/**
	 * 查询所有求租信息
	 */
	@RequestMapping("/wantSearch.do")
	public String wantSearch(Model model,
							@RequestParam(required=false) String wAddress,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wAddress", wAddress);
		Integer totalCount = wantService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<Want> wantList = wantService.findAll(map);
		initResult(model, wantList, map); 
		return "WEB-INF/want/wantSearch";
	}
	/**
	 * 添加求租信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/want/wantInsert";
    }
	
	/**
	 * 添加求租信息确认
	 * @return
	 */
	@RequestMapping("/wantInsert.do")
    public String wantInsert(HttpServletRequest request,HttpSession session) {
		Want want=new Want();
		want.setwAddress(request.getParameter("wAddress"));
		want.setwContacts(request.getParameter("wContacts"));
		want.setwPhone(request.getParameter("wPhone"));
		want.setwPrice(request.getParameter("wPrice"));
		want.setwPricetype(request.getParameter("wPricetype"));
		want.setwType(request.getParameter("wType"));
		wantService.wantInsert(want);
		return "redirect:/want/wantSearch.do";
    }
	
	/**
	 * 修改求租信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int wantId = Integer.valueOf(request.getParameter("wantId"));
		Want want = wantService.findById(wantId);
		model.addAttribute("want", want);
		return "WEB-INF/want/wantUpdate";
    }
	
	/**
	 * 修改求租信息确认
	 * @return
	 */
	@RequestMapping("/wantUpdate.do")
    public String wantUpdate(HttpServletRequest request,HttpSession session) {
		int wantId = Integer.valueOf(request.getParameter("wantId"));
		Want want = wantService.findById(wantId);
		want.setwAddress(request.getParameter("wAddress"));
		want.setwContacts(request.getParameter("wContacts"));
		want.setwPhone(request.getParameter("wPhone"));
		want.setwPrice(request.getParameter("wPrice"));
		want.setwPricetype(request.getParameter("wPricetype"));
		want.setwType(request.getParameter("wType"));
		wantService.wantUpdate(want);
		return "redirect:/want/wantSearch.do";
    }
}
