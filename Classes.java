package com.classesdao.javaweb;

public class Classes {
	private int classID;	//班级编号
	private String className;	//班级名称
	private String major;	//专业
	private String college;	//院系
	private int grade;	//年级
	
	public Classes(String className,
			String major,String college,int grade) {
		this.className=className;
		this.major=major;
		this.college=college;
		this.grade=grade;
	}
	
	public int getClassID() {
		return classID;
	}
	
	public void setClassId(int classID) {
		this.classID=classID;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className=className;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college=college;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}

}
