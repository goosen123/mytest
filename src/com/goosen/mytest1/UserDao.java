package com.goosen.mytest1;

import java.util.List;

import com.goosen.entity.User;

public interface UserDao extends CrudDao<User>{

	public List<User> findListByType(User entity);
	
}
