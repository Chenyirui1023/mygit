package com.classesdao.javaweb;
/**
 * ������
 * @author Administrator
 *
 */
public class ClassesTest {
	public static void main(String agrs[]) {
		Classes c=new Classes("��2��", "�������", "��ѧ����ϢѧԺ", 18);
		ClassesDao dao=new ClassesDaompl();
		dao.insert(c);
		System.out.println(c.getClassID());
		dao.select("��2��");
		
		c.setClassName("��1��");
		dao.update(c);
		dao.select("��1��");
		
		
		dao.delete("��1��");
	}
}
