package TwoDArray;

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int sumRow =0;
		System.out.println("Enter the number of row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the number of column:");
		int col = sc.nextInt();
		System.out.println("Enter the element of the array:");
		int[][] a= new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of the array are:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				sumRow = sumRow+a[i][j];
				
			}
			System.out.println("The row wise sum of "+(i+1)+" is:"+sumRow);
		}
	}

}
