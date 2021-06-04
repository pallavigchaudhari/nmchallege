/**
* <h1>Class to build deck of cards!</h1>
* This Class builds deck of the cards and provides methods to display the deck,shuffle the deck and deal the cards off the top of deck.
* @author  Pallavi Chaudhari.
* @version 1.0
* @date  2021-05-31
*/
package nmchallenge;

public class Card {
	
	    //Private data members to hold the suit and rank values.
		private final Rank rank;
	    private final Suit suit;
	    
	    /**
	     * Card class constructor that initializes the private data members rank and suit .
	     * @param Rank rank,Suit suit
	     * @return None
	    */
	    public Card(final Rank rank,
	            final Suit suit) {
	           this.rank = rank;
	           this.suit = suit;
	       }
		
	     // Enum representing 4 suits in a deck of playing cards : DIAMONDS,CLUBS,HEARTS and SPADES
		 public enum Suit {
		    DIAMONDS(1),
		    CLUBS(2),
		    HEARTS(3),
		    SPADES(4);

		    private final int suitValue;

		    Suit(final int suitValue) {
		        this.suitValue = suitValue;
		    }

		    public int getSuitValue() {
		        return this.suitValue;
		    }
		}
		
		// Enum representing Rank of a card within each suit e.g.TWO,THREE,FOUR..ACE.
		public enum Rank {
		    TWO(2),
		    THREE(3),
		    FOUR(4),
		    FIVE(5),
		    SIX(6),
		    SEVEN(7),
		    EIGHT(8),
		    NINE(9),
		    TEN(10),
		    JACK(11),
		    QUEEN(12),
		    KING(13),
		    ACE(14);

		    private final int rankValue;

		    Rank(final int rankValue) {
		        this.rankValue = rankValue;
		    }

		    public int getRankValue() {
		        return this.rankValue;
		    }
		}
			
	    //Override toString() method to format the string
	    @Override
	    public String toString() {
	        return String.format("%s of %s", this.rank, this.suit);
	    }
	    
	    //Override equals herited from the Object class in order to implement ArrayList.contains on Card object
	    @Override
	    public boolean equals(Object obj) {

	    if (obj == this) {
	        return true;
	    }

	    if (!(obj instanceof Card)) {
	        return false;
	    }

	    Card other = (Card) obj;

	    return rank == other.rank && suit == other.suit;
	    }
	    
	}