package Evercraft;

public class FighterCharacter extends PlayerCharacter {
	private boolean alive;
	private Stats stats;

	public FighterCharacter() {
		stats = new FighterStats();
		alive = true;
	}
}