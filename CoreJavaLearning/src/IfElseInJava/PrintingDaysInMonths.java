package IfElseInJava;

import java.util.Scanner;

public class PrintingDaysInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		switch(month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12:{
			System.out.println(month+" st  month has 31 days.");
			break;
		}
		case 2:{
			System.out.println(month+" st  month   has 28 days.");
			break;
		}
		case 4: case 6: case 9:case 11:{
			System.out.println(month+"st month  month 30 days.");
			
		}
		 default:{
			 System.out.println("This is invalid month.");
		 }
			
		}
	}

}
