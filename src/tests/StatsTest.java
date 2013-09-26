import Evercraft.*;

// Have to refactor these to utilize Before and After cases
public class StatsTest extends junit.framework.TestCase {
	public void testCharacterAlignment() {
		Stats stats = new Stats();
		stats.setAlignment("Good");
		assertEquals("Good", stats.getAlignment());
	}

	public void testInvalidCharacterAlignment() {
		Stats stats = new Stats();
		stats.setAlignment("BadAlignment");
		assertEquals("Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':", stats.getAlignment());
	}

	// Default AC(Armor Class) should be 10
	public void testDefaultArmorClass() {
		Stats stats = new Stats();
		assertEquals(10, stats.getArmorClass());
	}

	// Default HP(Hit Points) should be 5
	public void testDefaultHitPoints() {
		Stats stats = new Stats();
		assertEquals(5, stats.getHealthPoints());
	}

	// Default Strength should be 10
	public void testDefaultAttribute() {
		Stats stats = new Stats();
		assertEquals(10, stats.getStrength());
	}

	// Can set an attribute manually, used for setting stats at the beginning/during the game
	public void testChangedAttribute() {
		Stats stats = new Stats();
		stats.setStrength(11);
		assertEquals(11, stats.getStrength());
	}

}