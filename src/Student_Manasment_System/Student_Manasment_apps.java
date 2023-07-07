package Student_Manasment_System;
import java.util.Scanner;
public class Student_Manasment_apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ask how many student new you went to add
		System.out.print("How many student to enroll : ");
		Scanner in =  new  Scanner(System.in);
		int numOfStu = in.nextInt();

		// create an array
		Student[] student = new Student[numOfStu];
		
		//create a number of new student
		
		for(int i =0;i<numOfStu;i++) {
			student[i] = new Student();
			student[i].enroll();
			student[i].payTution();
			//System.out.println(student[i].toString());
		}
		System.out.println(student[0].toString());
		System.out.println(student[1].toString());
		System.out.println(student[2].toString());
		
	}
	

}
