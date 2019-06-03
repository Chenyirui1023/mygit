package com.classesdao.javaweb;

public class ClassesDaompl extends BaseDao implements ClassesDao {
	public void insert(Classes c) {
		this.executeSql("insert into classinfo(className,major,college,grade) values(?,?,?,?)",
				c.getClassName(),c.getMajor(),c.getCollege(),c.getGrade());
		c.setClassId(this.getClassID(c.getClassName()));
	}

	public void update(Classes c) {
		this.executeSql("update classinfo set className=?,major=?,college=?,grade=? where classID=?",
				c.getClassName(),c.getMajor(),c.getCollege(),c.getGrade(),c.getClassID());
	}

	public void delete(String className) {
		this.executeSql("delete from classinfo where className=?", className);
	}

	public void select(String className) {
		this.executeSelect("select * from classinfo where className=?", className);
	}
}
