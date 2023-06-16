package day31_InterfacesAndAbstraction.Alarm;

import java.time.LocalTime;

public class Alexa implements Alarm {

	
	
	
	
	
	
	public void setAlarm() {
		System.out.println("Alexa is setting Alarm");
	}
	
	public void alexaWhatTimeIsIt () {
		System.out.println("It is " + LocalTime.now());
	}

}
