package model;

import java.io.Serializable;

public class MessageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String guessMsg;
	String correctGuessMsg;
	
	
	public MessageBean(){
		// TODO Auto-generated constructor stub
		guessMsg = "";
		correctGuessMsg = "";
	}


	/**
	 * @return the guessMsg
	 */
	public String getGuessMsg() {
		return guessMsg;
	}


	/**
	 * @param guessMsg the guessMsg to set
	 */
	public void setGuessMsg(String guessMsg) {
		this.guessMsg = guessMsg;
	}


	/**
	 * @return the correctGuessMsg
	 */
	public String getCorrectGuessMsg() {
		return correctGuessMsg;
	}


	/**
	 * @param correctGuessMsg the correctGuessMsg to set
	 */
	public void setCorrectGuessMsg(String correctGuessMsg) {
		this.correctGuessMsg = correctGuessMsg;
	}

	
	
}
