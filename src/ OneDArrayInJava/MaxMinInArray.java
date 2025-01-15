package OneDArrayInJava;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		System.out.println("Enter the value of the row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the elements if an array:");
		int[] a= new int[row];
		for(i=0;i<row;i++) {
			a[i] = sc.nextInt();
		}
		
		
		int max = a[0];
		for(i=0;i<row;i++) {
			if(a[i]>max) {
				max= a[i];
			}
			else {
				max= max;
			}
		
		}
		System.out.println("The max in the array element is "+max);
		int min = a[0];
		for(i=0;i<row;i++) {
			if(a[i]<min) {
				min = a[i];
			}
			else {
				min = min;
			}
			
		}
		System.out.println("The min in the array element is  "+min);
	}

}
