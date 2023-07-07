package Email_Administartor;

public class Aain_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Again_Email_Administraction info = new Again_Email_Administraction("ayman","sajid");
		info.setMailbox(1000);
		System.out.println("ANother Mail_Capacity : "+info.get_box_capacity());
		
		info.set_al_email("nifho@gmail.com");
		System.out.println("ANother EMail : "+info.get_al_mail());
		
		info.set_changePassword("4uewiwu949");
		System.out.println("Another password : "+info.get_change_pass());
		
		System.out.println(info.show_display());
		
	}

}
 