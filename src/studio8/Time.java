package studio8;

import java.util.Objects;

public class Time {
	int hour, minute;
	boolean is24Hour;
	
	/**
	 * @param h
	 * @param m
	 */
	public Time(int h, int m) {
		hour = h;
		minute = m;
		is24Hour = true;
	}
	public String toString() {
		if(is24Hour==false) {
			hour = hour%12;
		}
		String min ="";
		
		if(minute<10) {
			min+= "0";
		}
		min += minute;
		
		return hour +":" + min;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	
	public static void main(String[] args) {
		Time t1 = new Time(1,1);
		Time t2 = new Time(1,1);
		System.out.println(t1.hashCode()==t2.hashCode());
	}

	

}