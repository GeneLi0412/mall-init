package com.feify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feify.dao.UserMapper;
import com.feify.entity.User;
import com.feify.service.IUserSerivce;

@Service
public class UserServiceImpl implements IUserSerivce{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getUserName() {
		return userMapper.selectAll();
	}

}
