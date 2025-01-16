package TwoDArray;

import java.util.Scanner;

public class LargestELementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,max;
		System.out.println("Enter the row number:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the column number:");
		int col = sc.nextInt();
		System.out.println("Enter the element of an array:");
		int[][] a = new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		max = a[0][0];
		System.out.println("The elements of the array element are:");
		for(i=0;i<row;i++) {
			for(j=0;j<row;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		 
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
				
			}
			
			
		}
		System.out.println("The max element in the given array is "+max);
	}

}
