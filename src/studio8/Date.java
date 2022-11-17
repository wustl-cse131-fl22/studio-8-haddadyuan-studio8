package studio8;

import java.util.*;
import java.util.Objects;

public class Date {
	private int month, day, year;
	
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	public String toString() {
		return month +"/" + day +"/" +year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(1,1,1);
		Date d2 = new Date(1,1,1);
		Date d3 = new Date(1,1,1);
		Date d4 = new Date(1,1,1);
		Date d5 = new Date(1,1,1);
		Date d6 = d1;
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d1);
		list.add(d2);
		
		HashSet<Date> set = new HashSet<Date>();
		
		set.add(d1);
		set.add(d2);
		
		System.out.println(list);
		
		System.out.println(set);
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


    

}
