import Evercraft.*;

// Have to refactor these to utilize Before and After cases
public class PlayerCharacterTest extends junit.framework.TestCase {

	public void testCharacterName() {
		PlayerCharacter character = new PlayerCharacter();
		character.setName("Newbie");
		assertEquals("Newbie", character.getName());
	}

	public void testCharacterAlignment() {
		PlayerCharacter character = new PlayerCharacter();
		character.setAlignment("Good");
		assertEquals("Good", character.getAlignment());
	}

	public void testInvalidCharacterAlignment() {
		PlayerCharacter character = new PlayerCharacter();
		character.setAlignment("BadAlignment");
		assertEquals("Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':", character.getAlignment());
	}

	// Default AC(Armor Class) should be 10
	public void testDefaultArmorClass() {
		PlayerCharacter character = new PlayerCharacter();
		assertEquals(10, character.getArmorClass());
	}

	// Default HP(Hit Points) should be 5
	public void testDefaultHitPoints() {
		PlayerCharacter character = new PlayerCharacter();
		assertEquals(5, character.getHealthPoints());
	}

	// Check that all attributes are 10
	public void testDefaultAttributes() {
		PlayerCharacter character = new PlayerCharacter();
	}


}