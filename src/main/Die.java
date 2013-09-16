package Evercraft;
import java.util.Random;

public class Die {
	private Random die;

	public Die() {
		die =  new Random();
	}

	public int roll(int sides) {
		return die.nextInt(sides) + 1;
	}
}