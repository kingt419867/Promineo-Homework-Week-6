package cardGame;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck(); // Instantiates the Deck class.	    
	    //deck.describe(); // Describes the Deck, if needed.
	    System.out.println("-----------------------------------------------------------------------");
	    System.out.println("Welcome to the card game, War!");
	    System.out.println("There are 2 players, Player1 and Player2.");
	    System.out.println("The play will proceed automatically.  Suites are ignored.  Ace is high, but Jokers are played.");
	    System.out.println("-----------------------------------------------------------------------");
	    System.out.println();
	    deck.shuffle(); // Shuffles the Deck.
	    
	    Player player1 = new Player("PlayerOne");  // Instantiates the first Player.
	    Player player2 = new Player("PlayerTwo");  // Instantiates the 2nd Player.
	    
	    for (int i = 0; i <=25; i++) {			// This reveals the cards in Player1's Hand.
	    	player1.getHand().add(deck.draw());
	    } // Player1 Card Reveal
	    
	    for (int j = 0; j <=25; j++) {			// This reveals the cards in Player2's Hand.
	    	player2.getHand().add(deck.draw());
	    } // Player 2 Card Reveal
	    
	    for (int k = 0; k <=25; k++) {			// This is the battle.  It will compare the values held by Player1 vs Player2.
	    	Cards player1Draw = player1.flip(); // Both players reveal their cards, here.
	    	Cards player2Draw = player2.flip();
	    	System.out.println("This is Round " + k + ". Player1 drew a " + player1Draw.getName() + ".  Player2 drew a " + player2Draw.getName() + ".");
	    	if (player1Draw.getValue() > player2Draw.getValue()) { // This compares the players' scores and determines the winner.
	    		player1.incrementScore();		// Player1 wins
	    		System.out.println("Player1 wins.");
	    	} else if (player2Draw.getValue() > player1Draw.getValue()) {
	    		player2.incrementScore();		// Player2 wins
	    		System.out.println("Player2 wins.");
	    	} else {							// If the players scored the same, then it's a draw.
	    		System.out.println("It was a tie.  No points awarded.");
	    	}
	    	System.out.println("The score is:  Player1: " + player1.getScore() + " Player2: " + player2.getScore());
	    	System.out.println();
	    } // Battle for
	    System.out.println("-----------------------------------------------------------------------");
	    System.out.println();							// This section is the end of game summary.
	    if (player1.getScore() > player2.getScore()) {  // The players' final scores are compared, and the overall winner is announced.
	    	System.out.println("Player1 wins overall.");
	    } else if (player2.getScore() > player1.getScore()){
	    	System.out.println("Player2 wins overall.");
	    } else {
	    	System.out.println("It was a tie.");
	    }
	    System.out.println("Player1 score: " + player1.getScore() + ".  Player2 score: " + player2.getScore()); // This prints out the players' final scores.
	} // main

} // class

