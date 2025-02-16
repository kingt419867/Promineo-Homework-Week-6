package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {						// This is the Player class

	String playerName;
	int score;
	List<Cards> hand = new ArrayList<Cards>();
	
	Player(String name) { // This is the Player constructor.
		this.playerName = name;
		this.score = 0;
	} // Constructor
	
	public Cards flip() { // This is the flip method
		Cards hand = this.hand.remove(0);
		return hand;
	} // flip
	
	public String getPlayerName() {  // Getters and Setters
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
	public void  incrementScore() { // This is the incrementScore method.
		this.score = score + 1;
	} // incrementScore
	
	public List<Cards> getHand() {
		return hand;
	}
	public void setHand(List<Cards> hand) {
		this.hand = hand;
	}
	
	public void describe() { // This is the Describe method.
		System.out.println("Player name: " + this.getPlayerName() + "; score: " + this.getScore());
	} // describe
	
} // class
