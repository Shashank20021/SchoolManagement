package com.miniproject.SchoolManagement1;
import java.util.Scanner;

	public class Main
    {
	 public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("HOW MANY TEACHER AND STUDENT DETAILS U WANT TO ENTER?");
		int n=sc.nextInt();
		School C[]=new School[n];
		for(int i=0;i<C.length;i++)
		{
			C[i]=new School();
			C[i].inputStudentDetails();	
		}
		
		int ch;
		do
		{
			System.out.println("Welcome To Our School Management Services ");
		    System.out.println("-------------------------------------------");
			System.out.println("\n 1 - To view  student Details\n"
					+ " 2 - To update student's info\n"
					+ " 3 - Display Fee Details\n"
					+ " 4 - Accept Fee Details\n"
			        + " 5 - To view Teacher Details\n"
			        + " 6 - Update Teacher Details \n"
			        + " 7 -  Delete Teacher Details\n"                                     
			        + " 8 - Exit\n");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				for(int i=0;i<C.length;i++)
				{
					C[i].displayAllDetails();
			}
				break;
			case 2:
				System.out.println("Enter student id to update :");
				String stu_id=sc.next();
				boolean find = false;
				for(int i=0;i<C.length;i++)
				{
					find=C[i].search(stu_id);
					if(find)
					{
						C[i].updateDetails();
						break;
					}
				}
				if(!find) 
				{
					System.out.println("Student details not found..Try again!!");
					
				}
				break;
				
			case 3:
				
					System.out.println("Enter student id to access fee details:");
					stu_id=sc.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{
						found = C[i].search(stu_id);
						if(found) 
						{
      					C[i].displayFeeDetails();
							break;
						}
					}
					if(!found) 
					{
						System.out.println("Unable to get student fee details");
					}
					break;
			case 4:
				for(int i=0;i<C.length;i++) 
				{
					C[i].displayFeeDetails();
				}
				break;
			case 5:
				for(int i=0;i<C.length;i++) 
				{
					C[i].inputTeacherDetails();
				}
				break;
				
			case 6:
				System.out.println("Enter teacher id to update :");
				String teach_id=sc.next();
				found = false;
				for(int i=0;i<C.length;i++)
				{
					found=C[i].search1(teach_id);
					if(found)
					{
						C[i].updateDetails1();
						break;
					}
				}
				if(!found) 
				{
					System.out.println("Search failed Teacher details not found..!!");
					
				}
				break;
				
			case 7:
				System.out.println("Enter teacher id to delete :");
				teach_id=sc.next();
				found = false;
				for(int i=0;i<C.length;i++)
				{
					found=C[i].search1(teach_id);
					if(found)
					{
						C[i].deleteTeacher(teach_id);
						break;
					}
				}
				if(!found) 
				{
					System.out.println("Search failed Teacher details not found..!!");
					
				}
			
			
			}
		}
		while(ch!=8);
	}
 }
			