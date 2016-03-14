/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author plm12
 *
 */
public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int cardsScore;
	private Deck deck;
	/**
	 * @param name
	 * @param cardsScore
	 * @param hand
	 */
	public Player(String name, int cardsScore, Deck deck) {
		this.name = name;
		this.cardsScore = cardsScore;
		this.deck = deck;
	}
	
	public Player(){ 
	 name = "";
     cardsScore = 0;
     deck = null;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cardsScore
	 */
	public int getcardsScore() {
		return cardsScore;
	}

	/**
	 * @param cardsScore the cardsScore to set
	 */
	public void setcardsScore(int cardsScore) {
		this.cardsScore = cardsScore;
	}

	/**
	 * @return the hand
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	
	
}
