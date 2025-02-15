package cardGame;

public class App {

	public static void main(String[] args) {

	}

}

// War rules:  There are at least a dozen different ways of playing the card game, War.  See https://en.wikipedia.org/wiki/War_(card_game)
// Also see:  https://search.brave.com/search?q=How+many+different+ways+are+there+of+playing+the+card+game%2C+War%3B+that+is%2C+how+many+different+sets+of+rules+are+there+for+the+game%3F&source=web&summary=1&conversation=2d9cf263141c177335e1d9
// And see:  https://search.brave.com/search?q=How+do+you+play+the+card+game+%22War%22%3F&source=web

// My wife's rules, how she learned as a child, have the Joker high, and all the cards are played (some variations don't play the Joker)
// She also plays 3 cards down for a "war," and whoever runs out of cards first, loses.
// Thus, scoring is not by points, per se, but by how many cards you have, until eventually, one player has all of them.
// The discard piles are recycled into new hands, when the hands are exhausted.  Reshuffling is optional.

// In my MVP release, we're not going to have any "wars," at all - only "battles".
// Discard piles will not be implemented in the MVP version; rather, discarded cards (that is, cards that have been "won") will simply be added to the bottom of the hand.
// Scoring will be done by keeping a tally of how many cards each player has left in their hand.
// I will keep the Ace high for the MVP version.