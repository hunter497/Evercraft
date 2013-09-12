import Evercraft.*;

public class CharacterTest extends junit.framework.TestCase {
	public void testCharacterName() {
		PlayerCharacter character = new PlayerCharacter();
		character.setName("Newbie");
		assertEquals(character.getName(), "Newbie");
	}
}