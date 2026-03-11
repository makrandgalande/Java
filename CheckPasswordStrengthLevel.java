package com.rt;

public class CheckPasswordStrengthLevel {
	public static void main(String[] args) {
		
		int password=3;
		
		switch(password) {
		
		case 1:{
			System.out.println("Weak Password");
			break;
		}
		case 2:{
			System.out.println("Medium Password");
			break;
		}
		case 3:{
			System.out.println("Strong Password");
			break;
		}
		
		default:{
			System.out.println("Invalid Input");
		}
		}
	}

}
