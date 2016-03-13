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

	private String name;
	private int score;
	private Deck hand;
	/**
	 * @param name
	 * @param score
	 * @param hand
	 */
	public Player(String name, int score, Deck hand) {
		this.name = name;
		this.score = score;
		this.hand = hand;
	}
	
	public Player(){ 
	 name = "";
     score = 0;
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
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
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
