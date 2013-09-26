package Evercraft;

public interface GameCharacter {
	void damage(int damage);
	boolean isAlive();
	String attack(EnemyCharacter enemy);
	String getName();
}