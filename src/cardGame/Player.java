package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	String playerName;
	int score;
	List<Cards> hand = new ArrayList<Cards>();
	
	Player(String name) { // This is the Player constructor.
		this.playerName = name;
		this.score = 0;
		for (int i = 0; i <= 26; i++) {
			hand.add(Deck.draw()); // Depending on which player, this gives half the deck to them, as a Hand.
		} // for
	} // Constructor
	
	public Cards flip() {
		Cards hand = this.hand.remove(0);
		return hand;
	}
	
//	public Cards draw() {
//		Cards card = this.cards.remove(0);
//		return card;
//	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void  incrementScore() {
		this.score = score + 1;
	}
	
	public List<Cards> getHand() {
		return hand;
	}
	public void setHand(List<Cards> hand) {
		this.hand = hand;
	}
	
	public void describe() {
		System.out.println("Player name: " + this.getPlayerName() + "; score: " + this.getScore());
	} // describe
	
} // class
