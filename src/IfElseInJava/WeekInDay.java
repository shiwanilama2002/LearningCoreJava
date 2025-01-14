package IfElseInJava;

import java.util.Scanner;

public class WeekInDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:
		{
			System.out.println("Week "+day+"st day is Sunday");
			break;
		}
		case 2:{
			System.out.println("Week "+day+"st day is Monday");
			break;
		}
		case 3:
		{
			System.out.println("Week "+day+"st day is Tuesday");
			break;
		}
		case 4:{
			System.out.println("Week "+day+"st day is Wednesday");
			break;
		}
		case 5:{
			System.out.println("Week "+day+"st day is Thrusday");
			break;
		}
		case 6:{
			System.out.println("Week "+day+"th day is Friday");
			break;
		}
		case 7:{
			System.out.println("Week "+day+"th day is Saturday");
			break;
		}
		default:{
			System.out.println(day+" is invalid");
		}
		
	}

}
}