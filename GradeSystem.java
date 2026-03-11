package com.rt;

public class GradeSystem {
	
	public static void main(String[] args) {
		
		String Grade = "D";
		
		switch (Grade) {
		

		case"A":{
			System.out.println("Excellent");
			break;
		}
		case"B":{
			System.out.println("Nice");
			break;
		}
		case"C":{
			System.out.println("V Good");
			break;
		}
		case"D":{
			System.out.println("Good");
			break;
		}
		case"E":{
			System.out.println("Average");
			break;
		}
	default:{
		System.out.println("Fail");
	}
		}
		}

}
