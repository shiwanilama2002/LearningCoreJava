package TwoDArray;

import java.util.Scanner;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int sum=0;
		System.out.println("ENter the value of row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the value of column:");
		int col = sc.nextInt();
		System.out.println("Enter the value of the array element:");
		int[][ ] a= new int[row][col];
		for( i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The element of an array are:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
				
				sum=sum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of the array element is:"+sum);

	}

}
