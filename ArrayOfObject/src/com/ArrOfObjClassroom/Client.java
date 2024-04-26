package com.ArrOfObjClassroom;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//teacher and classroom containment
		Teacher t=new Teacher(1,"shilpa",Designation.ASS_PROF);
		ClassRoom c=new ClassRoom(1,"DAC Class ",t);
		System.out.println(c.toString());
		
		//Classroom Array 
		ClassRoom[] c1=new ClassRoom[3];
		ArrUtility.AcceptClassroom(c1);
		ArrUtility.DisplayClassroom(c1);
		
		

	}

}
