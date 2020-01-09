package com.fhb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fhb.mapper.UserMapper;
import com.fhb.pojo.User;
import com.fhb.service.UserService;
//ҵ���ӿ�ʵ����
@Service
public class UserServiceimpl implements UserService {
	// ע��mapper��
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectList() {
		return userMapper.selectList();
	}

	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateByPrimaryKey(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
