package FunctionsInJava;

import java.util.Scanner;

public class MaxInOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt() ;
		System.out.println("Enter the element of the array:");
		int[] ar = new int[rows];
		for(int k =0;k<rows;k++) {
			ar[k] = sc.nextInt();
			
		}
		System.out.println("The enterd element in array is:");
		for(int k =0;k<rows;k++) {
			System.out.print(ar[k]+" ");
			
		}
		int result = findMax(ar);
		System.out.println("The max element in the array is: "+ result);
		
	}
	public static int findMax(int[] a) {
		int i;
		
		int max = a[0];
		for(i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
		}
		
	
		}
		return max;
}
}