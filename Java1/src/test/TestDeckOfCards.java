package test;
import nmchallenge.*;
import nmchallenge.Card.Suit;
import nmchallenge.Card.Rank;


import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDeckOfCards {
	
    @Test
    public void testDeckSize() {
        final DeckOfCards deckOfCards = new DeckOfCards();
        assertEquals(deckOfCards.size(), 52); //This test case should pass
        //assertNotEquals(deckOfCards.size(), 53);  // Junit version i used Junit 4.10. This version does not provide
                                                    //assertNotEquals. Junit 5 does provide this method.
        
        //assertEquals(deckOfCards.size(), 53); // if we uncomment this This test case should fail.
    }
    

	@Test
    public void testDeckContainsCards() {
		
        final DeckOfCards deckOfCards = new DeckOfCards();
        //Test if Deck contains exactly 52 cards
        assertEquals(deckOfCards.size(), 52);
        
        //Test if TWO of DAIMONDS is present in Deck
        assertTrue(deckOfCards.containsCard(new Card(Rank.TWO, Suit.DIAMONDS)));
        
        //Test if ACE of SPADES is present in Deck
        assertTrue(deckOfCards.containsCard(new Card(Rank.ACE, Suit.SPADES)));
        
        //Test if KING of CLUBS is present in Deck
        assertTrue(deckOfCards.containsCard(new Card(Rank.KING, Suit.CLUBS)));
        
        
      //Negative test : Test if NINE of CLUBS is present in Deck
        assertFalse(deckOfCards.containsCard(new Card(Rank.NINE, Suit.CLUBS))); // This test should fail
        
        //Test for all cards in the deck
        for(final Suit suit : Suit.values()) {
            for(final Rank rank : Rank.values()) {
            	assertTrue(deckOfCards.containsCard(new Card(rank,suit)));
            }
        }
    }
	
	@Test
	public void testDealCards() {
		
        final DeckOfCards deckOfCards = new DeckOfCards();
        //Test if Deck contains exactly 52 cards
        assertEquals(deckOfCards.size(), 52);
        
        //Test deal operation. Remove first element from the deck
        IntStream.range(0, 52).forEach(i->deckOfCards.deal(0));
        assertEquals(deckOfCards.size(), 0);
        assertFalse(deckOfCards.containsCard(new Card(Rank.ACE, Suit.SPADES)));
	}
	
	@Test
	public void testDeckSizeAfterDeal() {
		
        final DeckOfCards deckOfCards = new DeckOfCards();
        //Test if Deck contains exactly 52 cards
        assertEquals(deckOfCards.size(), 52);
        
        deckOfCards.deal(0); //This operation will remove first card from Deck of cards.
                             //Deck of cards will now contain 51 cards as first card is removed from deck
        assertEquals(deckOfCards.size(), 51); 
       // assertFalse(deckOfCards.containsCard(new Card(Rank.ACE, Suit.SPADES)));
        
        deckOfCards.deal(0); //This operation will remove 1 card from deck , so now deck will have 50 cards;
        assertEquals(deckOfCards.size(), 51); // This test should fail as deck have 50 cards now
        
        assertEquals(deckOfCards.size(), 50); // This test should pass as deck have 50 cards
	}
	
	
	@Test
    public void testshuffleDeckCards() {
		
        final DeckOfCards deckOfCards = new DeckOfCards();
        //Before Shuffle : Test if Deck contains exactly 52 cards
        assertEquals(deckOfCards.size(), 52);
        
        //Before Shuffle : Test deal operation. Remove first element from the deck
        IntStream.range(0, 52).forEach(i->deckOfCards.deal(0));
        assertEquals(deckOfCards.size(), 0);
        assertTrue(deckOfCards.containsCard(new Card(Rank.TWO, Suit.DIAMONDS)));
        
        
        deckOfCards.shuffleDeckOfCards();
        
        //After Shuffle : Test if Deck contains exactly 52 cards after shuffling 
        assertEquals(deckOfCards.size(), 52);
        
        //After Shuffle : Test deal operation. Remove first element from the deck
        IntStream.range(0, 52).forEach(i->deckOfCards.deal(0));
        assertEquals(deckOfCards.size(), 0);
        assertFalse(deckOfCards.containsCard(new Card(Rank.ACE, Suit.SPADES))); // This test may pass/fail as after shuffle                                                                                 //there is possibility that ACE of SPADES will be the top card
             
    }
}
