package day31_InterfacesAndAbstraction.Alarm;

import java.util.ArrayList;

public class AlarmTest {
	public static void main(String[] args) {
		
//		Alarm alarm = new Alarm (); cannot instantiate like this 
		
		Iphone proMax14 = new Iphone ();
		
		proMax14.call("123");
		proMax14.attendingZoomMeeting();
		proMax14.message("7038889999", "Irfan");
		
		
		proMax14.setAlarm();
		
		Alexa alexa1 = new Alexa ();
		
		alexa1.alexaWhatTimeIsIt();
		
		Clock clock1 = new Clock ();
		
		clock1.setAlarm();
		clock1.showCurrentTime();
		//-------------------------------
		Alarm callAlexa = new Alexa ();
		
		// callAlexa.alexWhatTimeIsIt (); // You cannot tell the method from alexa class if you are
		// overriding the signature method
		
		Alarm iphone13 = new Iphone ();
		
		Alarm clock2 = new Clock ();
		
		callAlexa.setAlarm();
		iphone13.setAlarm();
		clock2.setAlarm();
		
		System.out.println("----------");
		
		ArrayList <Alarm> list = new ArrayList <>();
		
		
		list.add(proMax14);
		list.add(alexa1);
		list.add(clock1);
		
		list.add(iphone13);
		list.add(callAlexa);
		list.add(clock2);
		
		for (Alarm eachAlarm : list) {
			eachAlarm.setAlarm();
		}
		
		
		
		
	}
}
