package com.cn.yl.test;


import java.util.Set;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
import com.cn.yl.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
  private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
  @Resource
  private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

  @Test
  public void test1() {
	  String username="aaa";
	  Set<String> userList = userService.findPermissions(username);
	  logger.info(JSON.toJSONString(userList));
  }
}