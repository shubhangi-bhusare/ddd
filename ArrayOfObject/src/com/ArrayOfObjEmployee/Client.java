package com.ArrayOfObjEmployee;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[3];
		ArrUtility.AcceptArrayEmp(e);
		ArrUtility.DisplayArrEmp(e);
		ArrUtility.MaxSalEmp(e);
//		 while(true) {
//	   System.out.println("1.Accept Employee 2.Display Employee");
//	   System.out.println("Enter the choice");
//	   int choice;
//	   choice=sc.nextInt();
//	  
//	   switch(choice)
//	   {
//	   case 1:
//		   ArrUtility.AcceptArrayEmp(e);
//		   break;
//	   case 2:
//		   ArrUtility.DisplayArrEmp(e);
//		   break;
//	   }
//	   
//
//	}
	}

}
