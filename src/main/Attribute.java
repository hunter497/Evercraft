package Evercraft;

public class Attribute {
	private int value = 0;
	private int modifier = 0;

	public Attribute(int value) {
		this.value = value;
		if(value > 19) modifier = 5;
		else if(value > 17) modifier = 4;
		else if(value > 15) modifier = 3;
		else if(value > 13) modifier = 2;
		else if(value > 11) modifier = 1;
		else if(value > 9) modifier = 0;
		else if(value > 7) modifier = -1;
		else if(value > 5) modifier = -2;
		else if(value > 3) modifier = -3;
		else if(value > 1) modifier = -4;
		else modifier = -5;
	}

	public void setValue(int value) { 
		this.value = value; 
		if(value > 19) modifier = 5;
		else if(value > 17) modifier = 4;
		else if(value > 15) modifier = 3;
		else if(value > 13) modifier = 2;
		else if(value > 11) modifier = 1;
		else if(value > 9) modifier = 0;
		else if(value > 7) modifier = -1;
		else if(value > 5) modifier = -2;
		else if(value > 3) modifier = -3;
		else if(value > 1) modifier = -4;
		else modifier = -5;
	}

	public int getValue() { return value; }
	public int getModifier() { return modifier; }
}