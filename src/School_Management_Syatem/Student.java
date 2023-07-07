package School_Management_Syatem;

// this class responsible for keeping the track of students , name, grade, fees;
public class Student {
	// for variable to counting to and always declared to private 
	
	// used for encapsulation 
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	/**
	 * 
	 * @param id for the student : unique
	 * fees for every student for every year $20200
	 * @param name name of the student
	 * @param grade grade of the student
	 */
	
	// create a constructor 
	public Student(int id,String name,int grade) {
		// initialization the value
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// not going to alter student name , student id.
	
	/**
	 * used to update the student's grade
	 * @param grade new grade of the student
	 */
	
	public void setGrade(int grade) {
		this.grade = grade;  // to continue to local variable that it!
		
	}
	
	/**
	 * Keep adding the fees to feesPaid Fields 
	 * feesPaid = 10000 + 5000 + 150000
	 * Add the fees to the fees paid
	 * THe School is going to receive the funds
	 * @param fees the fees student pays
	 */
	public void payFees(int fees){
		feesPaid+=fees;
		// feesPaid = feesPaid + fees
		// 
		School.UpdateTotalEearn(feesPaid);
		
	}
	
	// get the all the method
	
	/**
	 * 
	 * @return the id of student 
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return the name of student
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return the grade of student 
	 */
	
	public int getGrade() {
		return grade;
	}
	/**
	 * 
	 * @return the feesPaid of student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	/**
	 * 
	 * @return FeesTotal of  the student
	 */
		
	public int getFeesTotal() {
		return feesTotal;
	}
	
	// for remaining total fees
	
	public int getRemaining() {
		return feesTotal-feesPaid;
	}
	
	

}
