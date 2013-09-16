package Evercraft;
/**
* My own foray into Guy Royse's and George Walters II's Evercraft Kata in Java
* Some of my own stuff thrown in, since Guy isn't here to teach the Kata
* I like the idea so much, I'm going to expand upon it.
* Make this implement GameCharacter in future
* by Nick Hunter
*/
public class PlayerCharacter {
	private String name;
	private String alignment;
	private int armorClass = 10;
	private int healthPoints = 5;

	public void setName(String character) { name = character; }

	public String getName() { return name; }

	public void setAlignment(String align) {
		if(align == "Good") alignment = align;
		else if(align == "Neutral") alignment = align;
		else if(align == "Evil") alignment = align;
		else {
			System.out.println("Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':");
			alignment = "Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':";
		}
	}

	public String getAlignment() { return alignment; }

	public int getArmorClass() { return armorClass; }

	public int getHealthPoints() { return healthPoints; }

	public String attack(EnemyCharacter enemy) {
		Die die = new Die();
		int roll = die.roll(20);
		if(roll == 20) {
			enemy.damage(2);
			return "Critical Hit!";
		}
		else if(roll > enemy.getArmorClass()) {
			enemy.damage(1);
			return "Hit";
		}
		else return "Miss";
	}

}