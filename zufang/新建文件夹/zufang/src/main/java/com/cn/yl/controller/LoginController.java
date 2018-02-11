package com.cn.yl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.yl.pojo.Permission;
import com.cn.yl.pojo.User;
import com.cn.yl.service.IPermissionService;
import com.cn.yl.service.IUserService;

/**
 * 后台Controller
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private IUserService userService;
	
	@Resource
	private IPermissionService permissionService;
	
	/**
	 * 登录
	 */
    @RequestMapping("/login.do")
    public String login(User user, Model model,HttpSession session){
        Subject subject = SecurityUtils.getSubject() ;
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword()) ;
        try {
        	//shiro权限控制-登录控制
            subject.login(token);
            //获取登录用户信息
            user = userService.findUserByUsername(user.getUserName());
            Map<String,Object> map = new HashMap<String,Object>();
            List<Permission> menuList = new ArrayList<Permission>();
            Integer nfatherId=0;
            Integer isMenu=0;
            Integer roleId = user.getRoleId();
            map.put("nfatherId", nfatherId);
            map.put("isMenu", isMenu);
            map.put("roleId", roleId);
            //查询父类菜单
            List<Permission> menus = permissionService.getMeun(map);
            for (Permission menu : menus) {
            	nfatherId = menu.getId();
            	isMenu = 1;
            	map.clear();
                map.put("nfatherId", nfatherId);
                map.put("isMenu", isMenu);
                map.put("roleId", roleId);
                //查询功能菜单
                List<Permission> funs = permissionService.getMeun(map);
                menu.setFuns(funs);
                menuList.add(menu);
			}
            session.setAttribute("menuList", menuList);
            return "WEB-INF/index" ;
        }catch (Exception e){
            model.addAttribute("error","用户名或密码错误") ;
            return "login" ;
        }
    }
}