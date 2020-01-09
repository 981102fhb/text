package com.fhb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fhb.pojo.User;
import com.fhb.service.UserService;

@Controller
// ����ӳ��·��
@RequestMapping("/user")
public class UserController {
	//ע��ҵ���ӿ�
	@Autowired
	private UserService userService;

	//��ѯ�û��б�
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.selectList();
		// ����ѯ�������û����ݹ���
		model.addAttribute("users", users);
		System.out.println("123");
		return "userList";
	}
	
	
	//ɾ���û�
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		userService.deleteByPrimaryKey(userId);
			
		//�ض���
		return "redirect:/user/list.do";
		
	}
	
	
	

}
