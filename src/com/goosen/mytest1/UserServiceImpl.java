package com.goosen.mytest1;

import java.util.List;

import com.goosen.entity.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	@Override
	public User get(String id) {
		return userDao.get(id);
	}
	
	public String branch(){
		return "branch";
	}
	
	public String hh(){
		return "hh";
	}

	@Override
	public User get(User entity) {
		return userDao.get(entity);
	}

	@Override
	public List<User> findList(User entity) {
		return userDao.findList(entity); 
	}

	@Override
	public int insert(User entity) {
		return userDao.insert(entity);
	}

	@Override
	public int update(User entity) {
		return userDao.update(entity);
	}
	
	@Override
	public int delete(String id) {
		return userDao.delete(id);
	}

	@Override
	public int delete(User entity) {
		return userDao.delete(entity);
	}

	@Override
	public List<User> findListByType(User entity) {
		return userDao.findListByType(entity);
	}

	

}
