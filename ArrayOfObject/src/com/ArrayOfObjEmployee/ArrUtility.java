package com.ArrayOfObjEmployee;

import java.util.Scanner;

public class ArrUtility {
	
	public static void AcceptArrayEmp(Employee[] emp)
	{
		Scanner sc=new Scanner(System.in);
       for(int i=0;i<emp.length;i++)
       {
    	   System.out.println("Enter id of employee");
    	   int Id=sc.nextInt();
    	   System.out.println("Enter name");
    	   String name=sc.next();
    	   System.out.println("Enter salary");
    	   double sal=sc.nextDouble();
    	   System.out.println("Enter designation 1.Software developer 2.Consultant 3.Sr Consultant");
    	   int dcode=sc.nextInt();
    	   Designation desgvar=null;
    	   switch(dcode)
    	   {
    	   case 1:
    		   desgvar=Designation.SOFTWARE_DEVELOPER;
    		   break;
    	   case 2:
    		   desgvar=Designation.CONSULTANT;
    		   break;
    	   case 3:
    		   desgvar=Designation.SR_CONSULTANT;
    		   break;
    	   }
    	   Employee em=new Employee(Id,name,sal,desgvar);
    	   emp[i]=em;
    	   
       }
	}
	
	public static void DisplayArrEmp(Employee[] emp)
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}
	public static void MaxSalEmp(Employee [] emp)
	{
		int maxsal=0;
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getSalary()>emp[maxsal].getSalary())
			{
				maxsal=i;
			}
		}
		System.out.println("Highest salary employee is: "+emp[maxsal]);
	}

}
