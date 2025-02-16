package cardGame;
import java.util.*;

public class Deck { 							// This is the Deck class
	List<Cards> cards = new ArrayList<Cards>();
	
	Deck() { // This is the Deck constructor.
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Cards card = new Cards(number, suit, count);
				this.cards.add(card);
				count++;
			} // for cards
		} // for suit
	} // deck

	public List<Cards> getCards() { // Getters and Setters
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}
	
	public void describe() {			// This is the Describe method.
		for (Cards card : this.cards) {
			card.describe();
		}
	} // Describe
	
	public void shuffle() { // This is the Shuffle method.
		Collections.shuffle(this.cards);
	} // Shuffle
	
	public Cards draw() {   // This is the Draw method.
		Cards card = this.cards.remove(0);
		return card;
	} // Draw
} // Class
