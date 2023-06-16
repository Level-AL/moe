package day31_InterfacesAndAbstraction.Alarm;

import java.time.LocalTime;

public class Clock implements Alarm {

	public void showCurrentTime () {
		System.out.println("Current time of clock: " + LocalTime.now());
	}

	public void setAlarm() {
		System.out.println("Clock is setting up Alarm");
	}
	
}
