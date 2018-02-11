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
import com.cn.yl.pojo.Build;
import com.cn.yl.service.IBuildService;
@Controller
@RequestMapping("/build")
public class BuildController extends BaseController<Build>{
	@Resource
	private IBuildService buildService;
	
	/**
	 * 查询所有楼盘信息
	 */
	@RequestMapping("/buildSearch.do")
	public String buildSearch(Model model,
							@RequestParam(required=false) String bLlocaltion,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("bLlocaltion", bLlocaltion);
		Integer totalCount = buildService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<Build> buildList = buildService.findAll(map);
		initResult(model, buildList, map); 
		return "WEB-INF/build/buildSearch";
	}
	/**
	 * 添加楼盘信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/build/buildInsert";
    }
	
	/**
	 * 添加楼盘信息确认
	 * @return
	 */
	@RequestMapping("/buildInsert.do")
    public String buildInsert(HttpServletRequest request,HttpSession session) {
		Build build=new Build();		
		build.setbLlocaltion(request.getParameter("bLlocaltion"));
		build.setbPhone(request.getParameter("bPrice"));
		build.setbPrice(request.getParameter("bStatus"));
		build.setbStatus(request.getParameter("bPhone"));
		buildService.buildInsert(build);
		return "redirect:/build/buildSearch.do";
    }
	
	/**
	 * 修改楼盘信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int buildId = Integer.valueOf(request.getParameter("buildId"));
		Build build = buildService.findById(buildId);
		model.addAttribute("build", build);
		return "WEB-INF/build/buildUpdate";
    }
	
	/**
	 * 修改楼盘信息确认
	 * @return
	 */
	@RequestMapping("/buildUpdate.do")
    public String buildUpdate(HttpServletRequest request,HttpSession session) {
		int buildId = Integer.valueOf(request.getParameter("buildId"));
		Build build = buildService.findById(buildId);
		build.setbLlocaltion(request.getParameter("bLlocaltion"));
		build.setbPhone(request.getParameter("bPrice"));
		build.setbPrice(request.getParameter("bStatus"));
		build.setbStatus(request.getParameter("bPhone"));
		buildService.buildUpdate(build);
		return "redirect:/build/buildSearch.do";
    }
}
