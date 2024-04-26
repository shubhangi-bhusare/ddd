package com.ArrOfObjClassroom;

public class ClassRoom {
	private int roomid;
	private String name;
	private Teacher tec;
	
	public ClassRoom(int roomid,String name,Teacher tec)
	{
		this.roomid=roomid;
		this.name=name;
		this.tec=tec;
	}
	public String toString()
	{
		return "Roomid:"+roomid+" Name:"+name+tec.toString();
	}
	
	public int getRoomid()
	{
		return roomid;
	}
	public void setRoomid(int roomid)
	{
		this.roomid=roomid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Teacher getTec()
	{
		return tec;
	}
	public void setTec(Teacher tec)
	{
		this.tec=tec;
	}
}
