package com.classesdao.javaweb;

public interface ClassesDao{
	//����༶
	public void insert(Classes c);
	//�޸İ༶
	public void update(Classes c);
	//ɾ���༶
	public void delete(String className);
	//��ѯ�༶
	public void select(String className);
}