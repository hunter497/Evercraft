package Evercraft;

public class Runner {
	public static void main(String[] args) {
		PlayerCharacter character = new PlayerCharacter();
		character.setName("Newbie");
		System.out.println("The name of your character is: " +
			character.getName());
		EnemyCharacter enemy = new EnemyCharacter();
		System.out.println(character.attack(enemy));
	}
}