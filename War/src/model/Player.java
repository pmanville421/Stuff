package model;

import java.io.Serializable;

public class Player implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Hand hand;
	private int score;
	/**
	 * @param name
	 * @param hand
	 */
	public Player(String name, Hand hand) {
		super();
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore() {
		this.score = 0;
	}
}
