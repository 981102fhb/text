package com.fhb.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//导入测试

import com.fhb.pojo.User;
import com.fhb.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration("classpath:springdao.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void testSelectByPrimaryKey() {
		User user = userService.selectByPrimaryKey(4);
		System.out.println(user);
	}

	@Test
	public void testSelectList() {
		List<User> users = userService.selectList();
	}

}
