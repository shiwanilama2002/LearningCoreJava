package FunctionsInJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find reverse:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = reverse(n);
		System.out.println(result);

	}
	public static int reverse(int num) {
		int rev =0;
		int temp=num;
		int rem;
		while(temp!=0) {
		rem= temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
		}
		return rev;
		
	}
}
