package OneDArrayInJava;

import java.util.Scanner;

public class PrintingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the element of the array:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[] arr = new int[r];
		System.out.println("Enter the element of an array:");
		for(int i=0;i<r;i++) {
			arr[i] =  sc.nextInt();
		
		}
		System.out.println("The element of an array are:");
		for(int i=0;i<r;i++) {
			
			System.out.println(arr[i]);
		}
		

	}

}
