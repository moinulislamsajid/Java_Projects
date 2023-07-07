package Telecommunication;

public class MobliePhone implements Telephone {

	private String mynumber;
	private boolean isRinging;
	private boolean isPowerOn;
	
	public MobliePhone(String mynumber) {
		this.mynumber = mynumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Phone Powerd on");
		
	}

	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now Ringing" + phoneNumber + "On Desktop");
		
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging && isPowerOn) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}else {
			System.out.println("Phone is not ringing");
		}
	}

	@Override
	public boolean phoneCall(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == mynumber && isPowerOn) {
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
