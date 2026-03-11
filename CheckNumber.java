package com.rt;

public class CheckNumber {
	public static void main(String[] args) {
		
		int Number=10;
		
		switch(Number) {
		
		case 0,1,2,3:{
			System.out.println("Low");
			break;
		}
		case 4,5,6,7:{
			System.out.println("Meduim");
			break;
		}
		case 8,9,10:{
			System.out.println("High");
			break;
		}
		default:{
			System.out.println("Invalid Input");
		}
		}
	}

}
