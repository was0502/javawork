package _04_Enum;

import java.util.*;

public class T01_EnumWeek {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar ca1 = Calendar.getInstance();
		int week = ca1.get(ca1.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;	
	}
		if(today == Week.SATURDAY)
			System.out.println("술 먹을 시간");
		else
			System.out.println("자야 할 시간");
	}

}
