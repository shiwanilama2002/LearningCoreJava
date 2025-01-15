package LoopsInJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int mul=1;
		System.out.println("Enter the number to generate the table:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the value till which you want to generate table: ");
		int n = sc.nextInt();
		sc.close();
		
		for(i=1;i<=n;i++) {
			mul = num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
		

	}

}
