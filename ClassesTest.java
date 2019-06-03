package com.classesdao.javaweb;
/**
 * 测试用
 * @author Administrator
 *
 */
public class ClassesTest {
	public static void main(String agrs[]) {
		Classes c=new Classes("软工2班", "软件工程", "数学与信息学院", 18);
		ClassesDao dao=new ClassesDaompl();
		dao.insert(c);
		System.out.println(c.getClassID());
		dao.select("软工2班");
		
		c.setClassName("软工1班");
		dao.update(c);
		dao.select("软工1班");
		
		
		dao.delete("软工1班");
	}
}
