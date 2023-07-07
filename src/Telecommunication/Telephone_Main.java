package Telecommunication;

public class Telephone_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DesKPhone my_phone = new DesKPhone("01793573029");
		my_phone.powerOn();
		my_phone.phoneCall("01793573029");
		my_phone.answer();*/
		
		MobliePhone myphone = new MobliePhone("01845494303");
		
		myphone.powerOn();
		myphone.phoneCall("0184549430");
		myphone.answer();
		
		

	}

}
