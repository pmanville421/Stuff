package model;

import java.io.Serializable;

public class PlayWar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Deck player1Deck;
	private Deck player2Deck;
	/**
	 * @param player1Deck
	 * @param player2Deck
	 */
	public PlayWar(Deck player1Deck, Deck player2Deck) {
		super();
		this.player1Deck = player1Deck;
		this.player2Deck = player1Deck.splitDeck();
	}
	public Deck getPlayer1Deck() {
		return player1Deck;
	}
	public void setPlayer1Deck(Deck player1Deck) {
		this.player1Deck = player1Deck;
	}
	public Deck getPlayer2Deck() {
		return player2Deck;
	}
	public void setPlayer2Deck(Deck player2Deck) {
		this.player2Deck = player2Deck;
	}
	//Comparison goes here
}
