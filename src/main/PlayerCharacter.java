package Evercraft;
/**
* My own foray into Guy Royse's and George Walters II's Evercraft Kata in Java
* Some of my own stuff thrown in, since Guy isn't here to teach the Kata and
* I like the idea so much, I'm going to expand upon it.
* Make this implement GameCharacter in future
* by Nick Hunter
*/
public class PlayerCharacter implements GameCharacter {
	private String name;
	private boolean alive;
	private Stats stats;

	public PlayerCharacter() {
		stats = new Stats();
		alive = true;	
	}

	public boolean isAlive() { return alive; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Stats getStats() { return stats; }

	public String attack(EnemyCharacter enemy) {
		Die die = new Die();
		int roll = die.roll(20);
		if(roll == 20) {
			stats.increaseExperience(10);
			enemy.damage(2*stats.getAttackDamage() + 2*stats.getStrengthModifier());
			return "Critical Hit!";
		}
		else if(roll + stats.getStrengthModifier() > enemy.getArmorClass()) {
			stats.increaseExperience(10);
			enemy.damage(stats.getAttackDamage() + stats.getStrengthModifier());
			return "Hit";
		}
		else return "Miss";
	}

	public void damage(int damage) {
		stats.increaseHealthPoints(-damage);
		if(stats.getHealthPoints() <= 0) { 
			alive = false;
			System.out.println(getName() + " has been killed!"); 
		}
		else System.out.println(getName() + " now has " + stats.getHealthPoints() + "HP left");
	}

}