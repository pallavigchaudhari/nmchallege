package test;
import nmchallenge.*;
import nmchallenge.Card.Suit;
import nmchallenge.Card.Rank;


import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestCard {
    @Test
	public void testCardInDeck() {
    	
		Card card=new Card(Rank.TWO, Suit.DIAMONDS);
		final DeckOfCards deckOfCards = new DeckOfCards();
		assertTrue(deckOfCards.containsCard(card));
		deckOfCards.deal(0);//This will remove TWO of DIAMONDS from the deck ( first card in deck)
		
		assertTrue(deckOfCards.containsCard(card)); // This test should fail as TWO of DIAMONDS is removed from Deck
		
		assertFalse(deckOfCards.containsCard(card));
		
		assertTrue(deckOfCards.containsCard(new Card(Rank.THREE, Suit.DIAMONDS)));
   }
}
