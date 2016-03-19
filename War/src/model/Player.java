/**
 * 
 */
package model;

import java.io.Serializable;
//import java.util.ArrayList;

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
		
	}
    public Player(){
    	setPlayerScore (0);
    	
    	
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
	
	/**
	 * @param playerHand the playerHand to set
	 */
	
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

	
	
	
	
}

