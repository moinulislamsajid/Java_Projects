package School_Management_Syatem;
/**
 * this is class is responsible for keeping the track 
 * of teacher name id and salary.
 * @author Sajid
 *
 */
public class Teacher {

	private int id;
	private int salary;
	private int salaryEarned;
	private String name;


// create a constructor for initialization the value

/**
 * create a new Teacher objects
 * @param id for the teacher 
 * @param salary for the salary
 * @param name for the teacher name
 */
public Teacher(int id,int salary,String name, int salaryEarned) {
	this.id = id;
	this.salary = salary;
	this.name = name;
	salaryEarned = 0;
		}

// set for all method such as id salary and name

	public void setId(int id) {
	 this.id = id;
	}
	
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	
 

// get for all method such as id salary and name
	public String getName() {
		return name;
	}
	
	public int getId() {
	
		return id;
	}
	
		
	public int getSalary() {
		return salary;
	}


	
	

	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.setTotalSpend(salary);
		}
	
	}

