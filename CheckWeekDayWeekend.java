package com.rt;

public class CheckWeekDayWeekend {
	public static void main(String[] args) {
		
		String Day="monday";
		
		switch(Day) {
		
		case "Monday","Tuesday","Wedesday","Tursday","Friday":
			System.out.println("WeekDay");
			break;
		
		case "Saturday","Sunday":
			System.out.println("Weekend");
			break;
		
		
		default:
			System.out.println("Invalid Input");
		
		}
	}

}
