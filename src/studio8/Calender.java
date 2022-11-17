package studio8;

import java.util.*;

public class Calender {
	private HashSet <Appointment> set;

	public Calender() {
		set = new HashSet<Appointment>();
	}

	public void addAppointment(Appointment a) {
		set.add(a);
	}
	
	public String toString() {
		return set.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender cal = new Calender();
		cal.addAppointment(new Appointment(new Date(1,1,1), new Time(1,1)));
		cal.addAppointment(new Appointment(new Date(1,1,2), new Time(2,1)));
		System.out.println(cal);
		


	}

}
