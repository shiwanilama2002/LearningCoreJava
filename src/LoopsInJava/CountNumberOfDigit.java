package LoopsInJava;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the digit:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		sc.close();
		int count = 0;
		int temp = digit;
		int rem;
		if(temp==0) {
			count = count+1;
		}
		while(temp!=0) {
			rem = temp %10;
			count++;
			temp=temp/10;
			
			
		}
		System.out.println("The "+digit+" has the count as "+count);

	}

}
