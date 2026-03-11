package com.rt;

public class DayName {

	public static void main(String[] args) {
		
		int Num=10;
		
		switch (Num/3){
			
		case 1:{
			System.out.println("Monday");
			break;
				
		}
		case 2:{
			System.out.println("Tuesday");
			break;
			}
		case 3:{
			System.out.println("wensday");
			break;
			}
		case 4:{
			System.out.println("Tursday");
			break;
			}
		case 5:{
			System.out.println("Friday");
			break;	
			}
		case 6:{
				System.out.println("saturday");
				break;
				}
		case 7:{
					System.out.println("sunday");
					break;
				}
		default:{
			System.out.println("Invalid Input");
			
		}
		
	}

}
}
