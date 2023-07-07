package Student_Manasment_System;

import java.util.Scanner;

public class Student {
	private String fName;
	private String lName;
	private int gradeYear;
	private String courses;
	private int tutionBalance=0;
	private static int constOfCourse=600;
	private static int id = 1000;
	private String studentId;

	// constructor prompt user to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your First Name : ");
		this.fName = in.nextLine();
		System.out.print("Enter your Last Name : ");
		this.lName = in.nextLine();
		System.out.println("Set the Droop Manu : ");
		System.out.println("1>= Freshmen  \n2>= Sopmore  \n3>= Junior \n4>=senior");
		System.out.println("ENter your choice : ");
		gradeYear = in.nextInt();
		
		setstudentId();

		
		
		
	}
	
	// Generate an id
	private void setstudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	// Enroll a COurse
	public void enroll() {
		// get inside a loop user hits 0
		do {
			System.out.print("Enter an enrol (Q to quit) : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {  // (!course.equals("Q"))  (!course.equals)
				courses = courses + "\n " + course;
				tutionBalance+=constOfCourse;
				
			}
			else {
				System.out.println("Break");
				break;
			}
			
		}while(1!=0);
	}
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your Balanace is : "+tutionBalance);
	}
	
	// pay tuition congractional 
	public void payTution() {
		viewBalance();
		System.out.print("Enter your Payment : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance -= payment;
		System.out.println("Congractional You Have payment of $"+payment);
		viewBalance();
	}
	
	
	// show status
	@Override
	public String toString() {
		return "Name:" + fName + " " + lName+
				"\nStudent Id:" + studentId+
				"\nCourse Enrolled:" + courses+
				"\nBalance:$"+tutionBalance;
	}

	
	
	
}
