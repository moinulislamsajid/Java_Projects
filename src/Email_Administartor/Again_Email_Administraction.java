package Email_Administartor;
import java.util.*;

public class Again_Email_Administraction {
	
	private String f_name;
	private String l_name;
	private String Department;
	private String password;
	private String email;
	private String company_suffix = "linkroad";
	private String ALternative_EMail;
	private int  mail_box_capacity=500;
	private int default_pass=10;
	
	// create a constructor to initialization the value
	
	public Again_Email_Administraction(String f_name,String l_name) {
		
		this.f_name = f_name;
		this.l_name = l_name;
		System.out.println("Email Created : "+this.f_name + this.l_name);
		
		// call the method for department 
		this.Department =  choice_department();
		System.out.println("Your CHoice Department : "+this.Department);
		
		// call for random password method
		this.password = random_password(default_pass);
		System.out.println("Your Random Password is : "+this.password);
		
		// for combing for email
		email = f_name.toLowerCase() + l_name.toLowerCase() + "." + Department + "@" + company_suffix;
		System.out.println("Your EMail is : "+email);
	}
	
	// for choice for department
	
	private String choice_department() {
		System.out.print("Department for choice : ");
		System.out.print("\n1>= Sales  \n2>= Devlopment  \n3>= Carreer  \n4>= None");
		System.out.println("\n\nYour CHoice : ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice == 1) {
			return "Sales";
		}
		else if(choice == 2) {
			return "Developer";
		}
		else if(choice == 3) {
			return "Carrer ThIngd";
		}
		else if(choice == 4) {
			return "None";
		}
		else {
			return "";
		}
	}
	
	// for generate a random password 
	
	private String random_password(int length) {
		String set_pass = "ABCDEFGIJKLMNOPQRSTWXYZ1234567890!@#$%&";
		
		// create an array for set  random password type char type
		char[] password = new char[length];
		for(int i =0;i<length;i++) {
			int rand = (int) ((Math.random()) * set_pass.length());
			password[i] = set_pass.charAt(rand);
			/*
			 * int ran = (int) (((Math.random)) * set_password.length);
			 * password[i] = set_password.charAt(ran);
			 * */
		}
		return new String(password);
	}
	
	// for set mail box capacity  and alternative mail and change password
	public void setMailbox(int mail_box_capacity) {
		
		this.mail_box_capacity = mail_box_capacity;
	}
	
	public void set_al_email(String ALternative_EMail) {
		this.ALternative_EMail = ALternative_EMail;
	}
	public void set_changePassword(String password) {
		this.password = password;
		
	}
	
	// for get mail box and alternative emil and change password
	
	public int get_box_capacity() {
		return mail_box_capacity;
	}
	
	public String get_al_mail() {
		return ALternative_EMail;
	}
	
	public String get_change_pass() {
		return password;
	}
	public String show_display() {
		return "Display name : " + f_name + l_name+
				"COmpany mail : " + email;
				
	}

}
