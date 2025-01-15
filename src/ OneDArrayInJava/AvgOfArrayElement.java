package OneDArrayInJava;

import java.util.Scanner;

public class AvgOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg;
		System.out.println("Enter the number of the row:");
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Enter the element of the array:");
		int[] ar = new int[r];
		for(int i=0;i<r;i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("The element of an array are:");
		for(int i=0;i<r;i++) {
			System.out.println(ar[i]);
			sum = sum+ar[i];
		}
		avg=sum/r;
		System.out.println("The average of the array element is"+avg);
	}

}
