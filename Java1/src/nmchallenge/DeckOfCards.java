/**
* <h1>Class to build deck of cards!</h1>
* This Class builds deck of the cards and provides methods to display the deck,shuffle the deck and deal the cards off the top of deck.
* @author  Pallavi Chaudhari.
* @version 1.0
* @date  2021-05-31
*/
package nmchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import nmchallenge.Card.Suit;
import nmchallenge.Card.Rank;
import java.util.Optional;
import java.util.stream.IntStream;

public class DeckOfCards {
	
	private final ArrayList<Card> deckCards; // Create an ArrayList object deckCards
	
    /**
     * DeckOfCards class zero argument constructor that will build a full deck of cards.
     * @param None
     * @return None
    */
    public DeckOfCards() {
        this.deckCards = buildDeck();
    }
    
    /**
     * This method is used build the deck of Cards.
     * @param None
     * @return ArrayList of Card objects
    */
    private ArrayList<Card> buildDeck() {
        final ArrayList<Card> deckCards = new ArrayList<>();
        for(final Suit suit : Suit.values()) {
            for(final Rank rank : Rank.values()) {
            	deckCards.add(new Card(rank,suit));
            }
        }
        return deckCards;
    }
    
    /**
     * This method is used to get ArrayList of Card objects.
     * @param None
     * @return ArrayList of Card objects
     */
	public ArrayList<Card> getDeckCards() {
		return deckCards;
	}
	
	
    /**
     * Method to shuffle deck of cards using Random() method to shuffle given ArrayList.
     * @param None
     * @return None
     */
	public void shuffleDeckOfCards() {
        Collections.shuffle(deckCards, new Random());
	}
	
	
    /**
     * Method to display the cards in the desk.
     * @param None
     * @return None
    */
	public void displayDeck() {
		System.out.println(deckCards);
		System.out.println();
	}
	
  
    /**
     * Method to deal the top card off the deck of the cards.
     * @param numberOfPlayers , dealCardsPerPlayer
     * @return None 
    */
    public void dealCardsFromDeck(int numberOfPlayers, int dealCardsPerPlayer) {
    	  	
    	for(int playerNumber=1;playerNumber<=numberOfPlayers;playerNumber++) {
    		
    		System.out.println("DEALING CARDS FOR PLAYER "+ playerNumber+" :");
    		System.out.println("****************************");
    		
    		for(int dealCards=1;dealCards<=dealCardsPerPlayer;dealCards++) {
    			
		       if (deckCards.size()>0)
		            
		        	System.out.println("PLAYER "+playerNumber+" DEAL CARD "+dealCards+": "+deckCards.remove(0));
		       else
		            System.out.println("DECK IS EMPTY !!! ");
		       
    		}
    		System.out.println();    		
    	}
    }
    
    /**
     * Method to return the size of deck.
     * @param None
     * @return int 
    */
    public int size() {
        return this.deckCards.size();
    }
    
    
    /**
     * Method to check if given card is present in the deck of cards.
     * @param Card card
     * @return boolean - true/false 
    */
    public boolean containsCard(final Card card) {
        return this.deckCards.contains(card);
    }
    
    /**
     * Method to deal the card at given position.
     * @param int
     * @return Card obj
    */
    public Optional<Card> deal(int position) {
        return this.deckCards.isEmpty() ? Optional.empty() :
                Optional.of(this.deckCards.remove(position));
    }
}
