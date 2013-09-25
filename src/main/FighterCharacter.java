package Evercraft;

public class FighterCharacter extends PlayerCharacter {
	public void levelUp() {
		increaseAttackDamage(1);
		increaseHealthPoints(10 + getConstitutionModifier());		
	}
}