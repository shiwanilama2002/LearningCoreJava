package IfElseInJava;

import java.util.Scanner;

public class PrintingDaysUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:{
			System.out.println("Day 1 is sunday.");
		break;
		}
		case 2:{
			System.out.println("Day 2 is monday.");
		break;
		}
		case 3:{
			System.out.println("Day 3 is tuesday.");
		break;
		}
		case 4:{
			System.out.println("Day 4 is wednesday.");
		break;
		}
		case 5:{
			System.out.println("Day 5 is thursday.");
		break;
		}
		case 6:{
			System.out.println("Day 6 is friday.");
		break;
		}
		case 7:{
			System.out.println("Day 1 is saturday.");
		break;
		}
		default:
			System.out.println("Invalid day in week");
		}
	}

}
