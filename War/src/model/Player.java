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
	
	private String playerName;
	private Deck hand;
	private int playerScore;
	private boolean dealWinner = false;
	private boolean gameWinner = false;
	
	
	/**
	 * @param name
	 */
	/**
	 * @param playerName 
	 * @param playerName
	 * @param hand
	 * @param playerScore
	 */
	public Player(String playerName) {
		this.playerName = playerName;
		hand = new Deck();
		setdealWinner(false);
		setgameWinner(false);

	}
    public void setgameWinner(boolean gameWinner) {
		// TODO Auto-generated method stub
		this.gameWinner = gameWinner;
	}
    
    public boolean isgameWinner(){
    	return gameWinner;
    }
    
	public void setdealWinner(boolean dealWinner) {
		// TODO Auto-generated method stub
		this.dealWinner = dealWinner;
	}
	
	public boolean isdealWinner(){
		return dealWinner;
		
		
	}
	public Player(){
    	setPlayerScore (0);
    	hand = new Deck();
    	
    }
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the playerHand
	 */
	public Deck gethand() {
		return hand;
	}
	/**
	 * @param playerHand the playerHand to set
	 */
	public void sethand(Deck hand) {
		this.hand = hand;
	}
	/**
	 * @return the playerScore
	 */
	public int getPlayerScore() {
		return playerScore;
	}
	/**
	 * @param playerScore the playerScore to set
	 */
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	
	public void getHand(Deck deck){
		this.hand = deck;
		
	}
	
	public void addDeck(Deck hand){
		this.hand = hand;
		
		
		//change to hand instead of playerHand//  
		
		System.out.println("player1" + hand.toString() + "size" + hand.getCardsLeft());
		System.out.println("player2" + hand.toString() + "size" + hand.getCardsLeft());

	}
	
	public void addtoDeck(Card card){
		System.out.println(this.getPlayerName() + "deckAdded" + card.getValue());
		this.hand.addCard(card);
	}
	
	public void clearDeck(){
		this.hand = new Deck();
	}
}

