package RandomClassInJava;

import java.util.Random;

public class GeneratingRandomNumberUsingRandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(1,100);
		System.out.println("Random number betn 1 and 100 is "+num);

	}

}
