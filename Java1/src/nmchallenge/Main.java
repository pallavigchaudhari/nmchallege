/**
* <h1>Main Class containing the main() method</h1>
* This Class accepts user input for number of players and cards to be dealt per player and 
* calls the DeckOfCards class functions to build deck of the cards,display the deck of cards,shuffle the deck and deal the cards off the top of deck.
* @author  Pallavi Chaudhari.
* @version 1.0
* @date  2021-05-31
*/

package nmchallenge;
import java.util.Scanner;  // Import the Scanner class

public class Main {
	
	// Driver method
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);  // CREATE SCANNER OBJECT TO GET INPUT FROM PROGRAM USER
		
		System.out.println("ENTER NUMBER OF PLAYERS :");
		int numberOfPlayers= scannerObj.nextInt(); 
		
		System.out.println("ENTER NUMBER OF CARDS TO BE DEALT PER PLAYER :");
		int dealCardsPerPlayer= scannerObj.nextInt(); 
		
		System.out.println();
	    scannerObj.close();	// CLOSE THE SCANNER OBJECT
		
		System.out.println("WE HAVE " + numberOfPlayers+ " PLAYERS AND "+dealCardsPerPlayer+" CARDS TO BE DEALT PER PLAYER.");
		System.out.println();
		
		//CREATE DECK OF CARDS OBJECT. DECK IS INITIALISED VIA DeckOfCards() CONSTRUCTOR METHOD.
		final DeckOfCards deckOfCards = new DeckOfCards();
		
		System.out.println("DISPLAY DECK OF CARDS BEFORE SHUFFLING CARDS:");
		deckOfCards.displayDeck();
		System.out.println();
		
		System.out.println("SHUFFLING THE DECK OF CARDS...");
		System.out.println();
        deckOfCards.shuffleDeckOfCards();
        
        System.out.println("DISPLAY DECK OF CARDS AFTER SHUFFLING CARDS:");
        deckOfCards.displayDeck();
        
        System.out.println("DEALING THE CARDS FROM THE DECK....");
        System.out.println();
        deckOfCards.dealCardsFromDeck(numberOfPlayers,dealCardsPerPlayer);

	}

}
