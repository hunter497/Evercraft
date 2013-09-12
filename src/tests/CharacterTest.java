import Evercraft.*;

public class CharacterTest extends junit.framework.TestCase {

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
}