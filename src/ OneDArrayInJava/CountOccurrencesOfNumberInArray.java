package ArraysInJava;

import java.util.Scanner;

public class CountOccurrencesOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count =0;
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar= new int[n];
		System.out.println("enter the element of an array");
		for( i =0;i<n;i++) {
			ar[i] =sc.nextInt();			
		}
		System.out.print("The entered element of an array are:");
		for(i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("Enter the target value to count");
		int target = sc.nextInt();
		for(i=0;i<n;i++) {
			if(ar[i]==target) {
				count++;
			}
			
		}
		System.out.println("The occurence of the target value in array is:"+count);
	}

}
