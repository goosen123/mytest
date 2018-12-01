package com.goosen.mytest1;

import java.util.List;

public interface CrudDao<T> {
	
	public T get(String id);
	public int insert(T entity);
	public int update(T entity);
	public int delete(String id);
	/**********************/
	public List<T> findList(T entity);
	/************************/
	public T get(T entity);
	public int delete(T entity);
	
}
