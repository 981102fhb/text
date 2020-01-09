package com.fhb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fhb.pojo.User;
import com.fhb.service.UserService;

@Controller
// 请求映射路径
@RequestMapping("/user")
public class UserController {
	//注入业务层接口
	@Autowired
	private UserService userService;

	//查询用户列表
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.selectList();
		// 将查询出来的用户数据共享
		model.addAttribute("users", users);
		System.out.println("123");
		return "userList";
	}
	
	
	//删除用户
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		userService.deleteByPrimaryKey(userId);
			
		//重定向
		return "redirect:/user/list.do";
		
	}
	
	
	

}
