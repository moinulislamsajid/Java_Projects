package Telecommunication;

public class DesKPhone implements Telephone {

	private String mynumber;
	private boolean isRinging;
	
	public DesKPhone(String mynumber) {
		this.mynumber = mynumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Desk Phone is always powerd");
		
	}

	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now Ringing" + phoneNumber + "On Desktop");
		
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}else {
			System.out.println("Phone is not ringing");
		}
	}

	@Override
	public boolean phoneCall(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == mynumber) {
			isRinging = true;
			System.out.println("Phone Ringing");
		}else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;

	}
	
	
}
