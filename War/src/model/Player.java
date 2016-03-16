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
	private Deck playerHand;
	private int playerScore;
	/**
	 * @param name
	 */
	/**
	 * @param playerName 
	 * @param playerName
	 * @param playerHand
	 * @param playerScore
	 */
	public Player(String playerName) {
		this.playerName = playerName;
		setPlayerScore (0);
		playerHand = new Deck();
	}
    public Player(){
    	setPlayerScore (0);
    	playerHand = new Deck();
    	
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
	public Deck getPlayerHand() {
		return playerHand;
	}
	/**
	 * @param playerHand the playerHand to set
	 */
	public void setPlayerHand(Deck playerHand) {
		this.playerHand = playerHand;
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
		this.playerHand = deck;
	}
	
}


/*public void deal(Player player1, Player player2){
Deck deck1,deck2;
deck1 = new Deck();
deck2 = new Deck();

gameDeck.newDeck();
gameDeck.shuffleDeck();

System.out.println(this.gameDeck.toString());

while( gameDeck.getCardsLeft() > 0 ){
	deck1.addCard(gameDeck.removeCard());
	deck2.addCard(gameDeck.removeCard());
}

player1.addDrawDeck(deck1);
player2.addDrawDeck(deck2);;

}*/