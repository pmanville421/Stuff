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
	private Deck hand;
	/**
	 * @param name
	 * @param cardsScore
	 * @param hand
	 */
	public Player(String name, int cardsScore, Deck hand) {
		this.name = name;
		this.cardsScore = cardsScore;
		this.hand = hand;
	}
	
	public Player(){ 
	 name = "";
     cardsScore = 0;
     hand = null;
		
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
	public Deck getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(Deck hand) {
		this.hand = hand;
	}
	
	//Create and add the hand
	
	
	
}
