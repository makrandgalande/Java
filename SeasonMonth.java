package com.rt;

public class SeasonMonth {
	public static void main(String[] args) {
		
		
		String Month="Dec-Feb";
		
		switch(Month) {
		
		case "Dec-Feb":{
			System.out.println("Winter");
			break;
			}
		case "Mar-May":{
			System.out.println("Summer");
			break;
			}
		case "Jun-Sep":{
			System.out.println("Monson");
			break;
			}
		case "Oct-Nov":{
			System.out.println("Autumn");
			break;
			}
		
		default:{
			System.out.println("Invalid Input");
		}
		}
		
		
	}

}
