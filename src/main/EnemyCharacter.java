package Evercraft;

// Enemy character, make this implement GameCharacter
public class EnemyCharacter {
	private int ArmorClass = 10;
	private int HealthPoints = 5;
	private boolean alive = true;

	public int getArmorClass() { return ArmorClass; }
	public int getHealthPoints() { return HealthPoints; }
	public boolean getAlive() { return alive; }

	public void damage(int damage) {
		HealthPoints = HealthPoints - damage;
		if(HealthPoints <= 0) { 
			alive = false;
			System.out.println("Enemy has been killed!"); 
		}
		else System.out.println("Enemy now has " + HealthPoints + "HP left");
	}
}