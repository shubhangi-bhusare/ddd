package com.ArrOfObjClassroom;

public class Teacher {
	private int tid;
	private String name;
	private Designation des;
	
	
	public Teacher(int tid, String name, Designation des) {
		// TODO Auto-generated constructor stub
		this.tid=tid;
		this.name=name;
		this.des=des;
	}
	public String toString()
	{
		return "tid: "+tid+" Name:"+name+" Designation:"+des;
	}

}
