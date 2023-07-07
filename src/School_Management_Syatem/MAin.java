package School_Management_Syatem;
import java.util.*;
public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiple Number = defined
		// create a list for different time for different number of student
		/*List<Integer> number = new ArrayList<>();
		
		// create a objects for different teacher different time
		
		number.add(5);
		number.add(32);
		number.add(50);
		System.out.println(number);
		*/
		Teacher Ayman = new Teacher(101,100000,"Ayman",0);
		Teacher Sajid = new Teacher(102,200,"Sajid",0);
		Teacher Riaz  = new Teacher(103,30000,"Riaz",0);
		Teacher Aman  = new Teacher(104,400000,"Aman",0);
		// add to teacher list to list
		List<Teacher> teacherlist = new ArrayList<>();
		teacherlist.add(Ayman);
		teacherlist.add(Sajid);
		teacherlist.add(Riaz);
		teacherlist.add(Aman);


		Student irfan = new Student(1,"Irfan",3);
		Student tanveer = new Student(2,"Tanveer",5);
		Student akther = new Student(3,"Akther",7);
		// Added to student list
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(irfan);
		studentlist.add(tanveer);
		studentlist.add(akther);
		
		School DHS= new School(teacherlist,studentlist);
		
		irfan.payFees(2000);
		tanveer.payFees(5000);
		System.out.println("DHS Total earning $"+DHS.getTotalEearn());
		
		Sajid.receiveSalary(Sajid.getSalary());
		System.out.println("DHS To Spend THeir teacher $"+Sajid.getSalary());
		System.out.println("DHS Total earning $"+DHS.getProfit());

		

	}

}
