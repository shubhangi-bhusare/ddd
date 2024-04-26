package com.ArrayOfObjEmployee;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	private Designation des;
	
	public Employee(int eid,String name,double salary,Designation des)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.des=des;
	}
	public String toString()
	{
		return "Eid:"+eid+" name:"+name+" salary:"+salary+" Designation:"+des;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Designation getDes() {
		return des;
	}
	public void setDes(Designation des) {
		this.des = des;
	}
	

}
