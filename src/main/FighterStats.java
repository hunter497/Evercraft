package Evercraft;

public class FighterStats extends Stats {

	public void levelUp() {
		increaseHealthPoints(5 + getConstitutionModifier());
		increaseLevel();
		increaseAttackDamage(1);
	}

}