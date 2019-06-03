package com.classesdao.javaweb;

public interface ClassesDao{
	//插入班级
	public void insert(Classes c);
	//修改班级
	public void update(Classes c);
	//删除班级
	public void delete(String className);
	//查询班级
	public void select(String className);
}