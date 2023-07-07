package Email_Administartor;
import java.util.Scanner;
public class Email {
	// used to variable 
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String compantsuffix = "linlroad.com";
	private int mailbokcapacity = 500;
	private int defaultPasswordLength = 10;
	
	// to declared a constructor receive a last_name and first_name
	
	// when ever you can all department for any kinds method you can run as a application to constructor 
	public Email(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created : " +this.firstName + " " + this.lastName);
		
		// call a method for the department return the department
		this.department = setDepartment();
		System.out.println("Department : "+this.department);
		
		// call the method asking for return a random password
		this.password = set_random_pass(defaultPasswordLength);  // you can initialization the value this is also length
		System.out.println("Your password is : "+this.password);
		
		//combine generated for email
		email = firstName.toLowerCase()  + lastName.toLowerCase() + "@" + department + "." + compantsuffix;
		System.out.println("Your Email is : "+email);
		
	}
	// ask for the department
	@SuppressWarnings("resource")
	private String  setDepartment() {
		System.out.print("Choice THe Department");
		System.out.print("\n 1>= Sales \n 2>= Devlopment \n 3>= Accounting \n 0>= None");
		System.out.print("\nYour Choice : ");

		Scanner in = new Scanner(System.in);
		int department_choice = in.nextInt();
		
			if(department_choice == 1) {
				return "Sales";
			}
			else if(department_choice == 2) {
				return "Devlopment";
			}
			else if(department_choice == 3) {
				return "Accounting";
			}
			else if(department_choice == 0) {
				return "none";
			}
			else {
				return "";
			}
		}

	// Generate a random password
	private String set_random_pass(int length) {
		String set_pass = "ABCDEFGHIJKLMNOPQRSTWXYZ0987654321!@#$%";
		// create an array the type of char
		
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			//int ran = (int) ((Math.random()) * set_pass.length());
			// set for random password
			//int ran = (int) ((Math.random()) * set_pass.length());
			//password[i] = set_pass.charAt(ran);
			
			// again for random password
			
			int rand = (int) ((Math.random()) * set_pass.length());
			password[i] = set_pass.charAt(rand);
			
		}
		// now return password but this is string
		return new String(password);
	}
	
	// set the mail box capacity
	public void setMailBoxcapacity(int capacity) {
		this.mailbokcapacity = capacity;
	}
	
	// set the alternative email
	
	public void setAlternativeEmail(String alt_mail) {
		this.alternateEmail = alt_mail;
	}
	// change the password
	
	public void change_password(String password) {
		this.password = password;
	}
	public int getsetMailBoxcapacity() {
		return mailbokcapacity;
	}
	
	public String getsetAlternativeEmail() {
		return alternateEmail;
	}
	
	public String getchange_password() {
		return password;
	}
	public String show_information() {
		return "Display Name : " + firstName + " " + lastName +
				"Company mail : " + email + 
				"MailBox capacity : " + mailbokcapacity + "Mb";
				
	}
	
	

}
