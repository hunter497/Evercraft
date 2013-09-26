package Evercraft;

// Enemy character, make this implement GameCharacter
public class EnemyCharacter implements GameCharacter {
	private int ArmorClass = 10;
	private int HealthPoints = 5;
	private boolean alive = true;
	private String name = "Enemy";

	public int getArmorClass() { return ArmorClass; }
	public int getHealthPoints() { return HealthPoints; }
	public boolean isAlive() { return alive; }
	public String getName() { return name; }

	public void damage(int damage) {
		HealthPoints = HealthPoints - damage;
		if(HealthPoints <= 0) { 
			alive = false;
			System.out.println(getName() + " has been killed!"); 
		}
		else System.out.println(getName() + " now has " + HealthPoints + "HP left");
	}

	public String attack(EnemyCharacter enemy) {
		Die die = new Die();
		int roll = die.roll(20);
		if(roll > enemy.getArmorClass()) {
			enemy.damage(1);
			return "Hit!";
		} else return "Miss";
	}
}