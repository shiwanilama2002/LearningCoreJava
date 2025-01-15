package OneDArrayInJava;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter the number of element in java:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[] ar = new int[r];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<r;i++) {
			ar[i] = sc.nextInt();
			
		}
		System.out.print("The element of the array are: ");
		for(int i=0;i<r;i++) {
			
			System.out.println(ar[i]);
			sum = sum+ar[i];
		}
		System.out.println("The element of arrays sum is:"+sum);
	}

}
