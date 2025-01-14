package BasicJavaProgram;

import java.util.Scanner;

public class SimpleInterestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the principle amt:");
		Scanner sc = new Scanner(System.in);
		int p= sc.nextInt();
		System.out.print("Enter the time:");
		int t = sc.nextInt();
		System.out.print("Enter the rate:");
		int r = sc.nextInt();
		sc.close();
		int SI = (p*t*r)/100;
		System.out.println("The Simple Interest for the principle "+p+" time "+t+" and rate "+r+" is: "+SI);

	}

}
