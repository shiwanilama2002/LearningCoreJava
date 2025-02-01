package RandomClassInJava;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int ranNum = random.nextInt(50)+1;
		System.out.println("Guess the nmber that i will pick: ");
		Scanner sc = new Scanner(System.in);
		int guessnum = sc.nextInt();
		System.out.println("The random number generated is:"+ranNum);
		if(ranNum==guessnum) {
			System.out.println("The guess is correct.");
		}
		else if(guessnum<ranNum) {
			System.out.println("The guess is too low");
		}
		else {
			System.out.println("The guess is too high.");
		}
		sc.close();

	}

}
