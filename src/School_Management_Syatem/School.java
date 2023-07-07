package School_Management_Syatem;

import java.util.List;

/**
 * many student and many teacher
 * using the many student and many teacher an array list
 * @author Sajid
 *
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int TotalEearn;
	private static int TotalSPend;
	
	// create a constructor
	/**
	 * 
	 * @param teacher list of the teacher of the school
	 * @param student list of the student of the school
	 */
	public School(List<Teacher> teachers,List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		TotalEearn =0;
		TotalSPend = 0;
	}
	
	// set for every value
	/**
	 * 
	 * @param teacher add the teacher all the different time
	 */
	public void addTeaccher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	/**
	 * 
	 * @param student add the student all different time
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @param TotalEearn  set the total earning 
	 */
	
	public static void UpdateTotalEearn(int MoneyEearn) {
		TotalEearn+= MoneyEearn;
	}
	
	/**
	 * 
	 * @param TotalSPend set the total spend
	 */
	public static void setTotalSpend(int MoneySpend) {
		TotalSPend-=MoneySpend;
	}
	
	// get the all method
	
	@SuppressWarnings("hiding")
	public List<Teacher> getTeacher() {
		return teachers;
	}
	
	public List<Student> getStudent(){
		
		return students;
	}
	
	public int getTotalEearn() {
		return TotalEearn;
	}
	
	public int getTotalSPend() {
		return TotalSPend;
	}
	
	public int getProfit() {
		return TotalEearn+TotalSPend;
	}
	// how to create a list
	/*
	 *array list
	 *
	 * List(Any data type but capital letter) variable name = new ArrayList<>();
	 * 
	 *Llst(Any data type but capital letter) varibale name = new ArrayList<>();
 	 * */
	
}
