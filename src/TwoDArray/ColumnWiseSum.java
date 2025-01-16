package TwoDArray;

import java.util.Scanner;

public class ColumnWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int sumCol;
		System.out.println("Enter the row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		System.out.println("Enter the element of an array:");
		int[][] a = new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("The element of an array is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		for(j=0;j<col;j++) {
			sumCol =0;
			for(i=0;i<row;i++) {
				sumCol =sumCol+a[i][j];
				
			}
			System.out.println("The sum of columnwise "+(j+1)+" is "+sumCol);
		}
	}

}
