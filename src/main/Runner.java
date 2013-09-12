package Evercraft;

public class Runner {
	public static void main(String[] args) {
		Character character = new Character();
		character.setName("Newbie");
		System.out.println("The name of your character is: " +
			character.getName());
	}
}