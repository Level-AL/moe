package day31_InterfacesAndAbstraction.Alarm;

public class Iphone implements Alarm {

	public void message (String phoneNumber, String to) {
		System.out.println("Sending " + phoneNumber + " to "+ to + " number" );
	}
	
	public void call (String phoneNumber ) {
		System.out.println("Calling " + phoneNumber);
	}
	
	public void playGame () {
		System.out.println("Playing Game using my Iphone");
	}
	
	public void attendingZoomMeeting () {
		System.out.println("Attending Zoom meeting using my Iphone");
	}

	public void setAlarm() {
		System.out.println("Iphone is setting alarm");		
	}
	
}
