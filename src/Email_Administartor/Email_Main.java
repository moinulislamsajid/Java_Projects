package Email_Administartor;

public class Email_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email info = new Email("ayman","sajid");
		info.setAlternativeEmail("sajid@gmail.com");
		System.out.println("Alternative Gmail : "+info.getsetAlternativeEmail());
		
		/*info.setMailBoxcapacity(1000);
		System.out.println("Alternative Mail Box Capacity : "+info.getsetMailBoxcapacity());
		*/
		info.change_password("jwi4282");
		System.out.println("Another password : "+info.getchange_password());
		
		System.out.println(info.show_information());
		 
	}

}
