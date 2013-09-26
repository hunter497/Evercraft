package Evercraft;

public class Stats {
	private int healthPoints;
	private int armorClass;
	private Attribute[] attributes;
	private String alignment;
	private int attackDamage;
	private int level;
	private int experience;

	public Stats() {
		experience = 0;
		armorClass = 10;
		healthPoints = 5;
		attackDamage = 1;
		level = 1;
		attributes = new Attribute[6];
		// Sets default attributes to 10
		for(int i=0; i < attributes.length; i++) attributes[i] = new Attribute(10);
		setCapabilities();
	}

	public String getAlignment() { return alignment; }

	public int getArmorClass() { return armorClass; }

	public int getHealthPoints() { return healthPoints; }
	public void increaseHealthPoints(int healthPoints) { this.healthPoints += healthPoints; }

	public int getAttackDamage() { return attackDamage; }
	public void increaseAttackDamage(int attackDamage) { this.attackDamage += attackDamage; }

	public int getStrength() { return attributes[0].getValue(); }
	public void setStrength(int strength) { attributes[0].setValue(strength); }

	public int getDexterity() { return attributes[1].getValue(); }
	public void setDexterity(int dexterity) { attributes[1].setValue(dexterity); }

	public int getConstitution() { return attributes[2].getValue(); }
	public void setConstitution(int constitution) { attributes[2].setValue(constitution); }

	public int getWisdom() { return attributes[3].getValue(); }
	public void setWisdom(int wisdom) { attributes[3].setValue(wisdom); } 

	public int getIntelligence() { return attributes[4].getValue(); }
	public void setIntelligence(int intelligence) { attributes[4].setValue(intelligence); }

	public int getCharisma() { return attributes[5].getValue(); }
	public void setCharisma(int charisma) { attributes[5].setValue(charisma); }

	public void increaseLevel() { level++; }

	public int getStrengthModifier() { return attributes[0].getModifier(); }
	public int getDexterityModifier() { return attributes[1].getModifier(); }
	public int getConstitutionModifier() { return attributes[2].getModifier(); }
	public int getWisdomModifier() { return attributes[3].getModifier(); }
	public int getIntelligenceModifier() { return attributes[4].getModifier(); }
	public int getCharismaModifier() { return attributes[5].getModifier(); }

	public void setAlignment(String alignment) {
		if(alignment == "Good") this.alignment = alignment;
		else if(alignment == "Neutral") this.alignment = alignment;
		else if(alignment == "Evil") this.alignment = alignment;
		else {
			System.out.println("Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':");
			this.alignment = "Invalid alignment. Please enter 'Good', 'Evil', or 'Neutral':";
			//TODO finish this input, using a scanner, instantiate the scanner elsewhere
		}
	}

	// Levels up on every 1000th experience point
	public void increaseExperience(int exp) {
		experience += exp;
		if(experience % 1000 == 0) levelUp();
	}

	// Leveling up adds (5 + constitution) to the HP, if the level is even, attack damage goes up by 1.
	public void levelUp() {
		increaseHealthPoints(5 + getConstitutionModifier());
		level++;
		if(level % 2 == 0) increaseAttackDamage(1);
	}

	private void setCapabilities() {
		armorClass += getDexterityModifier();
		healthPoints += getConstitutionModifier();
		if(healthPoints < 1) healthPoints = 1;
	}

	
}