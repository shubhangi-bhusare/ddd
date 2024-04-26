package com.ArrOfObjClassroom;

import java.util.Scanner;

public class ArrUtility {
	public static void AcceptClassroom(ClassRoom[]cls)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<cls.length;i++)
		{
			System.out.println("Enter classroomid");
			int cid=sc.nextInt();
			System.out.println("Enter ClassName");
			String name=sc.next();
			System.out.println("Enter teacher id");
			int tid=sc.nextInt();
			System.out.println("Enter teacher name");
			String tname=sc.next();
			System.out.println("Enter Teacher designation 1.PROF 2.ASS_PROF");
			int tcode=sc.nextInt();
			Designation desvar=null;
			switch(tcode)
			{
			case 1:
				desvar=Designation.PROF;
				break;
			case 2:
				desvar=Designation.ASS_PROF;
				break;
			}
			ClassRoom cs=new ClassRoom(cid,name,new Teacher(tid,name,desvar));
			cls[i]=cs;
		}
	}
	
	public static void DisplayClassroom(ClassRoom[] cls)
	{
		for(int i=0;i<cls.length;i++)
		{
			System.out.println(cls[i]);
		}
	}

}
