package _04_Enum;

import java.util.*;

public class T01_EnumMonth {

	public static void main(String[] args) {
		Month today = null;
		
		Calendar ca1 = Calendar.getInstance();
		int month = ca1.get(ca1.DAY_OF_MONTH);
		System.out.println(month);
		
		switch(month) {
		case 1: today = Month.JANUARY; break;
		case 2: today = Month.FEBRUARY; break;
		case 3: today = Month.MARCH; break;
		case 4: today = Month.APRIL; break;
		case 5: today = Month.MAY; break;
		case 6: today = Month.JUNE; break;
		case 7: today = Month.JULY; break;	
		case 8: today = Month.AUGUST; break;	
		case 9: today = Month.SEPTEMBER; break;	
		case 10: today = Month.OCTOBER; break;	
		case 11: today = Month.NOVEMBER; break;	
		case 12: today = Month.DECEMBER; break;	
		
	}
		if(today == Month.MAY)
			System.out.println("쿠라사마 태어난 달");
		else
			System.out.println("지옥");
	}

}
