package com.rt;

public class Languagesection {
	public static void main(String[] args) {
		
		int language=4;
		
		switch(language) {
		
		case 1:{
			System.out.println("English-Hello");
			break;
			
		}
		case 2:{
			System.out.println("Hindi-Namste");
			break;
			
		}
		case 3:{
			System.out.println("Marathi-Namskar");
			break;
			
		}
		
		default:{
			System.out.println("Invalid Input");
		}
		}
		
	}

}
