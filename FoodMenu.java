package com.rt;

public class FoodMenu {
	public static void main(String[] args) {
		
		int Food=4;
		
		switch(Food) {
		
		case 1:{
			System.out.println("Pizza");
			break;
		}
		case 2:{
			System.out.println("Burger");
			break;
		}
		case 3:{
			System.out.println("Sandwich");
			break;
		}
		case 4:{
			System.out.println("Pasta");
			break;
		}
		default:{
			System.out.println("Invalid Input");
		}
		}
	}

}
