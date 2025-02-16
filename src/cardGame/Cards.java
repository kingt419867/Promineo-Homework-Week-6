package cardGame;

public class Cards { // This is the Cards class.  
	String name;
	String suit;
	int value;
	
	Cards(String name, String suit, int value) { // This is the Cards constructor.
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public String getName() { // Getters and Setters for the Cards class
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() { 
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	} // Describe
	
} //class
