package RandomClassInJava;

import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rollDice = random.nextInt(1,6);
		System.out.println("Dice rolled result:"+rollDice);

	}

}
