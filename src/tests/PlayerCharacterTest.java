import Evercraft.*;

// Have to refactor these to utilize Before and After cases
public class PlayerCharacterTest extends junit.framework.TestCase {

	public void testCharacterName() {
		PlayerCharacter character = new PlayerCharacter();
		character.setName("Newbie");
		assertEquals("Newbie", character.getName());
	}

	public void testCharacterDamage() {
		PlayerCharacter character = new PlayerCharacter();
		character.damage(1);
		Stats stats = character.getStats();
		assertEquals(4, stats.getHealthPoints());
	}

	public void testCharacterDeath() {
		PlayerCharacter character = new PlayerCharacter();
		character.damage(5);
		assertEquals(false, character.isAlive());
	}
}