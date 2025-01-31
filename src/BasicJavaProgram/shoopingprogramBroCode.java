package BasicJavaProgram;

import java.util.Scanner;

public class shoopingprogramBroCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name:");
		String product_name = sc.nextLine();
		System.out.println("Enter the quantity:");
		int quantiy = sc.nextInt();
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		double product = quantiy *price;
		System.out.println("Your order is "+product_name+" with quanity of "+quantiy);
		System.out.println("The total price of the order is "+product);
		sc.close();

	}

}
