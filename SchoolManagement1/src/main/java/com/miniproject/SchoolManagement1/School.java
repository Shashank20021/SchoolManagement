package com.miniproject.SchoolManagement1;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class School
{
	private String student_id = "101";
	private String student_name;
	private long totalfees = 30000;
	private long feespaid;
	private long remainigfees;
	private String teacher_id ="1001";
	private String teacher_name;
	private long salary;
	
Scanner sc =new Scanner(System.in);
	
	
	public void inputStudentDetails() 
	{
		System.out.println("Enter student-id:");
		student_id=sc.next();
		System.out.println("Enter student-name:");
		student_name=sc.next();
		System.out.println("enter amount of fees paid");
		feespaid=sc.nextLong();
		System.out.println("Student Details:\n"+"student-id:"
		+student_id+"\nstudent-name:"+student_name+"\ntotalfees:"+totalfees+"\nfeespaid:"+feespaid);
		System.out.println("YOUR DETAILS ENTERED...");
	}
	
	public void inputTeacherDetails() 
	{
		System.out.println("Enter Teacher-id:");
		teacher_id=sc.next();
		System.out.println("Enter Teacher-name:");
		teacher_name=sc.next();
		System.out.println("Enter Teacher salary");
		salary=sc.nextLong();
		System.out.println("Teacher details:\n"+"Teacher-id:"
		+teacher_id+"\nTeacher-name:"+teacher_name+"\nsalary:"+salary);
		System.out.println("TEACHER DETAILS ENTERED..");
		System.out.println("                                 ");
   }
	
	public void displayAllDetails() 
	{
		System.out.println("Name of student:"+student_name);
		System.out.println("Student id:"+student_id);
	}
	public void displayFeeDetails()
	{	
		System.out.println("Total fees of students"+totalfees);
		System.out.println("fees paid"+feespaid);
		
    }
	public void updateDetails()
	{
		
		System.out.println("Enter student-name to update:");
		student_name=sc.next();
		System.out.println( "Enter updated fees :");
		feespaid=sc.nextLong();
		System.out.println("Student details:\n"+"student-id:"
		+student_id+"\nstudent-name:"+student_name+"\ntotalfees:"+totalfees+"\nfeespaid:"+feespaid);
		System.out.println("YOUR DETAILS SUCCESFULLY UPDATED...");	
	}

	public boolean search(String stu_id) 
	{
		if(student_id.equals(stu_id))
		{
			displayAllDetails();
			return(true);
		}
		return(false);
	
	}
	public void updateDetails1()
	{
		
		System.out.println("Enter Teacher-name to update:");
		teacher_name=sc.next();
		System.out.println( "Enter salary  to updated :");
		salary=sc.nextLong();
		System.out.println("Teacher details:\n"+"Teacher-id:"
				+teacher_id+"\nTeacher-name:"+teacher_name+"\nsalary:"+salary);
		System.out.println("YOUR DETAILS SUCCESFULLY UPDATED...");
		
	}
	
	public boolean search1(String teach_id) 
	{
		if(teacher_id.equals(teach_id))
		{
			
			return(true);
		}
		return(false);
	
	}

	public void deleteTeacher(String teach_id)
	{
		if(teacher_id.equals(teach_id))
		{
			System.out.println("Teacher Details are removed");
		}
		else
		{
			System.out.println("unanle to remove");
		}
		
	}

}
	
	

