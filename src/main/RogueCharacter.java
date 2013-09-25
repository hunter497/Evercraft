// package Evercraft;

// public class RogueCharacter extends PlayerCharacter {
// 	public String attack(GameCharacter enemy) {
// 		Die die = new Die();
// 		int roll = die.roll(20);
// 		if(roll == 20) {
// 			increaseExperience(10);
// 			enemy.damage(3*attackDamage + 3*modifiers[0]);
// 			return "Critical Hit!";
// 		}
// 		else if(roll + modifiers[0] > enemy.getArmorClass()) {
// 			increaseExperience(10);
// 			enemy.damage(attackDamage + modifiers[0]);
// 			return "Hit";
// 		}
// 		else return "Miss";
// 	}
// }