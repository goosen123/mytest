package com.goosen.mytest1;

import java.util.List;

import com.goosen.entity.User;


public interface UserService extends UserDao{
	
	@Override
	public List<User> findListByType(User entity);
	
}
