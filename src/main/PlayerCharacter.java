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
	private int armorClass;
	private int healthPoints;
	private int[] attributes;
	private int[] modifiers;

	public PlayerCharacter() {
		armorClass = 10;
		healthPoints = 5;
		attributes = new int[6];
		modifiers = new int[6];
		for(int i=0; i < attributes.length; i++) attributes[i] = 10;
		setModifiers();			
	}

	// Setting attributes, this is more readable, but might just pass in 
	// an integer array instead of the ints separately
	public void setAttributes(int strength, int dexterity, int constituion,
		int wisdom, int intelligence, int charisma) {
		attributes[0] = strength;
		attributes[1] = dexterity;
		attributes[2] = constituion;
		attributes[3] = wisdom;
		attributes[4] = intelligence;
		attributes[5] = charisma;
		setModifiers();
	}

	private void setModifiers() {
		for(int i = 0; i < attributes.length; i++) {
			if(i < 19) modifiers[i] = 5;
			else if(i < 17) modifiers[i] = 4;
			else if(i < 15) modifiers[i] = 3;
			else if(i < 13) modifiers[i] = 2;
			else if(i < 11) modifiers[i] = 1;
			else if(i < 9) modifiers[i] = 0;
			else if(i < 7) modifiers[i] = -1;
			else if(i < 5) modifiers[i] = -2;
			else if(i < 3) modifiers[i] = -3;
			else if(i < 1) modifiers[i] = -4;
			else modifiers[i] = -5;
		}
	}

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