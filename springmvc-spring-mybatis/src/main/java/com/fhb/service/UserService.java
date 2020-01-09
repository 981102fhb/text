package com.fhb.service;

import java.util.List;

import com.fhb.pojo.User;
//ҵ���ӿ�
public interface UserService {
	public User selectByPrimaryKey(Integer id);

	public List<User> selectList();

	public int insert(User user);

	public int updateByPrimaryKey(User user);

	public int deleteByPrimaryKey(Integer id);
}
