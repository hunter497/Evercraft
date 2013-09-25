package Evercraft;

public interface GameCharacter {
	void damage(int damage);
	int getArmorClass();
	int getHealthPoints();
	boolean getAlive();
	String attack(GameCharacter enemy);
	String getName();
}