package com.rt;

public class Studentresult {
	public static void main(String[] args) {
		
		String Grade="D";
		
		switch(Grade) {
		
		case "A":{
			System.out.println("Distinction");
			break;
			
		}
		case "B":{
			System.out.println("Frist Class");
			break;
			
		}
		case "C":{
			System.out.println("Second Class");
			break;
			
	}
		case "D":{
			System.out.println("Pass");
			break;
			

}
		default:{
			System.out.println("Invalid input");
		}
		}
	}
}
		