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
import com.cn.yl.pojo.News;
import com.cn.yl.service.INewsService;
@Controller
@RequestMapping("/news")
public class NewsController extends BaseController<News>{
	@Resource
	private INewsService newsService;
	
	/**
	 * 查询所有新闻信息
	 */
	@RequestMapping("/newsSearch.do")
	public String newsSearch(Model model,
							@RequestParam(required=false) String nTitle,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("nTitle", nTitle);
		Integer totalCount = newsService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<News> newsList = newsService.findAll(map);
		initResult(model, newsList, map); 
		return "WEB-INF/news/newsSearch";
	}
	/**
	 * 添加新闻信息
	 * @return
	 */
	@RequestMapping("/prepareInsert.do")
    public String prepareInsert() {
		return "WEB-INF/news/newsInsert";
    }
	
	/**
	 * 添加新闻信息确认
	 * @return
	 */
	@RequestMapping("/newsInsert.do")
    public String newsInsert(HttpServletRequest request,HttpSession session) {
		News news=new News();		
		news.setnContext(request.getParameter("nContext"));
		news.setnName(request.getParameter("nName"));
		news.setnPhone(request.getParameter("nPhone"));
		news.setnStatus(request.getParameter("nStatus"));
		news.setnTitle(request.getParameter("nTitle"));
		newsService.newsInsert(news);
		return "redirect:/news/newsSearch.do";
    }
	
	/**
	 * 修改新闻信息
	 * @return
	 */
	@RequestMapping("/prepareUpdate.do")
    public String prepareUpdate(HttpServletRequest request,Model model) {
		int newsId = Integer.valueOf(request.getParameter("nwesId"));
		News news = newsService.findById(newsId);
		model.addAttribute("news", news);
		return "WEB-INF/news/newsUpdate";
    }
	
	/**
	 * 修改新闻信息确认
	 * @return
	 */
	@RequestMapping("/newsUpdate.do")
    public String newsUpdate(HttpServletRequest request,HttpSession session) {
		int newsId = Integer.valueOf(request.getParameter("newsId"));
		News news = newsService.findById(newsId);
		news.setnContext(request.getParameter("nContext"));
		news.setnName(request.getParameter("nName"));
		news.setnPhone(request.getParameter("nPhone"));
		news.setnStatus(request.getParameter("nStatus"));
		news.setnTitle(request.getParameter("nTitle"));
		newsService.newsUpdate(news);
		return "redirect:/news/newsSearch.do";
    }
}
