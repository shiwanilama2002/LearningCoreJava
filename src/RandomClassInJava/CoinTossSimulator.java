package RandomClassInJava;

import java.util.Random;

public class CoinTossSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		boolean coinToss = random.nextBoolean();
		System.out.println(coinToss);
		if(coinToss) {
			System.out.println("The coin tossed and the result is Head");
		}
		else {
			System.out.println("The coin tossed and the result is Tail");
		}
		}

}
