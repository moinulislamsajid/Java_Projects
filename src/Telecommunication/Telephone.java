package Telecommunication;

public interface Telephone {
	// Power On
	// dial a number
	// answer phone call
	// call another phone
	// is ringing
	
	void powerOn(); // this is automatic called static and public
	void dial(String phoneNumber);
	void answer();
	boolean phoneCall(String phoneNumber);
	boolean isRinging();
	

}
