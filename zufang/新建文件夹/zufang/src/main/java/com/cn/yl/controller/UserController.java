package com.cn.yl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cn.yl.controller.base.BaseController;
import com.cn.yl.pojo.User;
import com.cn.yl.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController<User>{
	@Resource
	private IUserService userService;
	
	/**
	 * 查询所有用户
	 */
	@RequestMapping("/userSearch.do")
	@RequiresRoles("admin")
	public String userSearch(Model model,
							@RequestParam(required=false) String userName,
							@RequestParam(required=false) Integer pageNum,   
							@RequestParam(required=false) Integer pageSize){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userName", userName);
		Integer totalCount = userService.getCount(map);
		initPage(map, pageNum, pageSize, totalCount);
		List<User> userList = userService.findAll(map);
		initResult(model, userList, map); 
		return "WEB-INF/user/userSearch";
	}
}
