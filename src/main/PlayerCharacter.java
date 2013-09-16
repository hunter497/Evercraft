package Evercraft;
/**
* My own foray into Guy Royse's and George Walters II's Evercraft Kata in Java
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

	// public String Attack(Enemy enemy) {
	// 	Dice die = new Dice(20);
	// 	roll = die.roll();
	// 	if(roll > enemy.getArmorClass()) return "Hit";
	// 	else return "Miss";
	// }

}