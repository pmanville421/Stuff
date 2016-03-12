package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Hand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	

	private ArrayList<Card> cards;
	
	//Adds cards from ArrayList to the Player Hand
	
	public Hand (ArrayList<Card> cards){
		for (int i = 0; i < cards.size(); i++){
			this.cards.add(cards.get(i));
		}
	}
	
	public Card flipCard(){
		return this.cards.get(0);
	}
	
	public void decreaseHand(){
		this.cards.remove(0);
	}
	
	
	
}
